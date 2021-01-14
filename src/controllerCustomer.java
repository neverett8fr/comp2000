import javax.swing.*;
import java.awt.*;
import java.io.FileWriter;

public class controllerCustomer {
    private viewCustomer view;
    private modelItems[] itemsModel;

    private modelReceipt receiptModel; //ones to create
    private modelReceiptItems[] receiptItemsModel; //ones to create

    private int newID;
    private float runningTotal;

    private modelReceipt[] receiptModelCollection;

    public controllerCustomer(modelItems[] itemsModel
            , viewCustomer view, modelReceipt[] receiptModelCollection){
        this.itemsModel = itemsModel;
        receiptModel = new modelReceipt();
        receiptItemsModel = new modelReceiptItems[0];

        runningTotal = 0;

        this.receiptModelCollection = receiptModelCollection;

        this.newID = 0;

        this.view = view;
        initView();
        initController();
    }


    public void initController(){
        //add action listeners here
        view.getBTNAddItem().addActionListener(e -> addItem());
        view.getBTNCheckout().addActionListener(e -> checkout());
    }
    private void addItem()
    {
        if (this.newID == 0)
        {
            this.newID = 1;
            boolean available = false;
            while( !available ) //searches csv for mentions of id, if exists add one to it and try again
            {
                for (int i = 0; i < receiptModelCollection.length; i++) {
                    if( (receiptModelCollection[i].getReceiptID() == this.newID) )
                    {
                        available = false;
                        this.newID +=1;
                        break;
                    }
                    else {
                        available = true;
                    }
                }
            }
        }

        receiptModel.setReceiptID(newID);

        int itemCode = Integer.parseInt(JOptionPane.showInputDialog("Enter Item Code"));
        boolean itemExist = false;
        for (int i = 0; i < itemsModel.length; i++) {
            if (itemsModel[i].getItemID() == itemCode)
            {
                itemExist = true;
                break;
            }
        }
        if (itemExist)
        {
            //below resizes array and adds newly created model in;
            modelReceiptItems[] b = new modelReceiptItems[receiptItemsModel.length + 1];
            for (int i=0; i < receiptItemsModel.length; ++i) {
                b[i] = receiptItemsModel[i];
            }
            receiptItemsModel = b;
            receiptItemsModel[receiptItemsModel.length - 1] = new modelReceiptItems();
        }


        int newItemID = 0;
        if (newItemID == 0)
        {
            newItemID = 1;
            boolean available = false;
            while( !available ) //searches csv for mentions of id, if exists add one to it and try again
            {

                for (int i = 0; i < receiptItemsModel.length; i++) {


                        if ((receiptItemsModel[i].getReceiptItemID() == newItemID)) {
                            available = false;
                            newItemID += 1;
                            break;
                        } else {
                            available = true;
                        }
                }

            }
        }

        receiptItemsModel[receiptItemsModel.length - 1] = new modelReceiptItems();
        receiptItemsModel[receiptItemsModel.length - 1].setItemID(itemCode);
        receiptItemsModel[receiptItemsModel.length - 1].setReceiptID(newID);
        receiptItemsModel[receiptItemsModel.length - 1].setReceiptItemID(newItemID);

        String itemName = "";
        float itemPrice = 0;
        for (int i = 0; i < itemsModel.length; i++) {
            if (itemsModel[i].getItemID() == itemCode){
                itemName = itemsModel[i].getItemName();
                itemPrice = itemsModel[i].getItemPrice();
                break;
            }
        }

        view.getTXTItemsAdded().append(itemName + " £" + itemPrice);
        view.getTXTItemsAdded().append("\n");

        runningTotal += itemPrice;

        view.getLBLRunningTotal().setText("Total: £" + runningTotal);


    }
    private void checkout()
    {
        float price = 0;
        for (int i = 0; i < receiptItemsModel.length; i++) {
            float itemPrice = 0;
            for (int j = 0; j < itemsModel.length; j++) {
                if (receiptItemsModel[i].getItemID() == itemsModel[j].getItemID()){
                    itemPrice = itemsModel[j].getItemPrice();

                }
            }

            price += itemPrice;
        }
        receiptModel.setTotalPrice(price);
        receiptModel.setAmountPaid(Float.parseFloat(JOptionPane.showInputDialog("Enter Amount Paid")));
        receiptModel.setPaymentMethod(JOptionPane.showInputDialog("Enter 'Cash' or 'Card''"));

        receiptModel.setModelCSV("modelReceipt.csv");
        for (int i = 0; i < receiptItemsModel.length; i++) {
            receiptItemsModel[i].setModelCSV("modelReceiptItems.csv");

            for (int j = 0; j < itemsModel.length; j++) {
                if (itemsModel[j].getItemID() == receiptItemsModel[i].getItemID()){
                    itemsModel[j].itemPurchase();
                }
            }
        }

        try{
            FileWriter writer = new FileWriter("modelItems.csv", false);
            writer.write("");
            writer.close();
        }
        catch (Exception e){}
        for (int i = 0; i < itemsModel.length; i++) {
            itemsModel[i].setModelCSV("modelItems.csv");
        }

        view.getFrame().dispose();
    }
    private void startAgain()
    {

    }

    public void initView(){
        view.getTXTItemsAdded().setFont(new Font("New Times Roman", Font.BOLD, 20));
        view.getLBLRunningTotal().setFont(new Font("New Times Roman", Font.BOLD, 20));
        view.getTXTItemsAdded().append("\n");
    }

}
