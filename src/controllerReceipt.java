import java.awt.*;

public class controllerReceipt {
    private viewStaff staffView;
    private modelReceipt[] modelReceiptCollection;
    private modelReceiptItems[] modelReceiptItemsCollection;
    private modelItems[] itemsModelCollection;

    public controllerReceipt(modelReceipt[] receiptModel, modelReceiptItems[] receiptItemsModel, viewStaff view, modelItems[] itemsModelCollection){
        this.itemsModelCollection = itemsModelCollection;
        this.modelReceiptCollection = receiptModel;
        this.modelReceiptItemsCollection = receiptItemsModel;
        this.staffView = view;
        initView(view);
        initController(view);
    }

    public void initView(viewStaff view){
        view.getTXTReceiptInfo().setFont(new Font("New Times Roman", Font.BOLD, 10));
        view.getTXTReceiptInfo().append("\n");
        for (int i = 0; i <= modelReceiptCollection.length - 1; i++) {
            view.getTXTReceiptInfo().append("\n");
            view.getTXTReceiptInfo().append("Receipt ID: " + String.valueOf(modelReceiptCollection[i].getReceiptID()));
            view.getTXTReceiptInfo().append("\n");
            view.getTXTReceiptInfo().append("Payment Method: " + modelReceiptCollection[i].getPaymentMethod());
            view.getTXTReceiptInfo().append("\n");
            view.getTXTReceiptInfo().append("Amount Paid: "+ modelReceiptCollection[i].getAmountPaid());
            view.getTXTReceiptInfo().append("\n");
            view.getTXTReceiptInfo().append("Total Price: "+ modelReceiptCollection[i].getTotalPrice());
            view.getTXTReceiptInfo().append("\n");
            view.getTXTReceiptInfo().append("Change Given: "+ modelReceiptCollection[i].calculateChange());
            view.getTXTReceiptInfo().append("\n");

            String output = "";
            for (int j = 0; j <= modelReceiptItemsCollection.length - 1; j++) {
                if (modelReceiptCollection[i].getReceiptID() == modelReceiptItemsCollection[j].getReceiptID())
                {
                    String itemOutput = "";
                    for (int k = 0; k <= itemsModelCollection.length - 1; k++) {
                        if (itemsModelCollection[k].getItemID() ==
                                modelReceiptItemsCollection[j].getItemID()){
                            itemOutput = itemsModelCollection[k].getItemName()
                            + " " + itemsModelCollection[k].getItemPrice();
                        }
                    }
                    output += "\n" + itemOutput;

                }

            }
            view.getTXTReceiptInfo().append("Items: "+ output);
            view.getTXTReceiptInfo().append("\n");

        }

    }
    public void initController(viewCustomer view){
        //add action listeners here

    }
    public void initController(viewStaff view){
        //add action listeners here

    }
}
