import java.awt.*;

public class controllerCustomer {
    private viewCustomer view;
    private modelItems[] itemsModel;
    private modelReceipt receiptModel;
    private modelReceiptItems[] receiptItemsModel;

    public controllerCustomer(modelItems[] itemsModel
            , viewCustomer view){
        this.itemsModel = itemsModel;
        receiptModel = new modelReceipt();

        receiptItemsModel = new modelReceiptItems[0];

        this.view = view;
        initView();
        initController();
    }


    public void initController(){
        //add action listeners here

    }

    public void initView(){
        view.getTXTItemsAdded().setFont(new Font("New Times Roman", Font.BOLD, 20));

    }

}
