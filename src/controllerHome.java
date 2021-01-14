import java.io.*;

public class controllerHome {
    private viewHome view;



    public controllerHome(viewHome view){
        this.view = view;
        initController();
    }



    public void initController(){
        //button listeners
        view.getBTNStaff().addActionListener(e -> openLogin("modelStaff.csv"));
        view.getBTNCustomer().addActionListener(e -> openCustomerView("modelItems.csv", "modelReceipt.csv"));

    }
    private void openLogin(String address){

        int linesNumber = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(address))) {
            while (reader.readLine() != null) linesNumber++;
        } catch (IOException e) {
            e.printStackTrace();
        }
        modelStaff[] staffModel = new modelStaff[linesNumber];
        for (int i = 0; i <= linesNumber - 1; i++)
        {
            staffModel[i] = new modelStaff();
            staffModel[i].loadStaffCSV(address, i);
        }

        viewLogin loginView = new viewLogin();
        controllerLogin loginController = new controllerLogin(staffModel, loginView);



    }





    private void openCustomerView(String address, String addressReceipt){

        viewCustomer customerView = new viewCustomer();

        int linesNumber = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(address))) {
            while (reader.readLine() != null) linesNumber++;
        } catch (IOException e) {
            e.printStackTrace();
        }
        modelItems[] itemsModel = new modelItems[linesNumber];
        for (int i = 0; i <= linesNumber - 1; i++)
        {
            itemsModel[i] = new modelItems();
            itemsModel[i].loadModelCSV(address, i);
        }


        linesNumber = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(addressReceipt))) {
            while (reader.readLine() != null) linesNumber++;
        } catch (IOException e) {
            e.printStackTrace();
        }
        modelReceipt[] receiptModel = new modelReceipt[linesNumber];
        for (int i = 0; i <= linesNumber - 1; i++)
        {
            receiptModel[i] = new modelReceipt();
            receiptModel[i].loadModelCSV(addressReceipt, i);
        }

        controllerCustomer customerController
                = new controllerCustomer(itemsModel, customerView, receiptModel);

    }

}
