import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class controllerLogin {
    private modelStaff[] model;
    private viewLogin view;

    private String usernameInput;
    private String passHashInput;

    public controllerLogin(modelStaff[] model, viewLogin view){
        this.model = model;
        this.view = view;
        initView();
        initController();
    }

    public void initView(){

    }
    public void initController(){
        //add action listeners here
        view.getBTNSubmit().addActionListener(e -> getLoginDetails(view));

    }
    private void getLoginDetails(viewLogin view){
        usernameInput = view.getUsername();
        passHashInput = view.getPassword(); //could hash it here -- thought it better to only give controller the hashed and not plaintext

        for (int i = 0; i < model.length ; i++) {
            if (usernameInput.equals(model[i].getStaffUsername()) &&
                    passHashInput.equals(model[i].getStaffPasswordHash())) //try login -- search for username in db & compare hashes
            {
                openStaff(model, i);
                break;
            }
        }


    }
    private int returnCSVLineCount(String address){
        int linesNumber = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(address))) {
            while (reader.readLine() != null) linesNumber++;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return linesNumber;
    }

    private void openStaff(modelStaff[] model, int staffPosition){

        viewStaff staffView = new viewStaff();

        String address = "modelItems.csv";
        int linesNumber = returnCSVLineCount(address) - 1;//-1 to remove header
        modelItems[] itemsModel = new modelItems[linesNumber];
        for (int i = 0; i <= linesNumber - 1; i++)
        {
            itemsModel[i] = new modelItems();
            itemsModel[i].loadModelCSV(address, i);
        }
        controllerStaff staffController = new controllerStaff(model, staffPosition, staffView,itemsModel);


        address = "modelReceipt.csv";
        linesNumber = returnCSVLineCount(address) - 1;
        modelReceipt[] receiptModel = new modelReceipt[linesNumber];
        for (int i = 0; i <= linesNumber - 1; i++)
        {
            receiptModel[i] = new modelReceipt();
            receiptModel[i].loadModelCSV(address, i);
        }

        address = "modelReceiptItems.csv";
        linesNumber = returnCSVLineCount(address) - 1;
        modelReceiptItems[] receiptItemsModel = new modelReceiptItems[linesNumber];
        for (int i = 0; i <= linesNumber - 1; i++)
        {
            receiptItemsModel[i] = new modelReceiptItems();
            receiptItemsModel[i].loadModelCSV(address, i);
        }

        controllerReceipt receiptController = new controllerReceipt(receiptModel, receiptItemsModel, staffView, itemsModel);



    }

}
