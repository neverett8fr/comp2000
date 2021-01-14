import java.awt.*;

public class controllerItems {
    private viewStaff view;
    private modelItems[] modelItemsCollection;

    public controllerItems(modelItems[] modelItemsCollection, viewStaff view){
        this.view = view;
        this.modelItemsCollection = modelItemsCollection;
        initView();
        initController();
    }

    public void initView(){
        view.getTXTItemInfo().setFont(new Font("New Times Roman", Font.BOLD, 20));
        view.getTXTItemInfo().append("\n");
        for (int i = 0; i <= modelItemsCollection.length - 1; i++) {
            view.getTXTItemInfo().append("\n");
            view.getTXTItemInfo().append("Item ID: " + String.valueOf(modelItemsCollection[i].getItemID()));
            view.getTXTItemInfo().append("\n");
            view.getTXTItemInfo().append("Item Name: " + modelItemsCollection[i].getItemName());
            view.getTXTItemInfo().append("\n");
            view.getTXTItemInfo().append("Item Price: "+ modelItemsCollection[i].getItemPrice());
            view.getTXTItemInfo().append("\n");
            view.getTXTItemInfo().append("Item Quantity: "+ modelItemsCollection[i].getQuantityStock());
            view.getTXTItemInfo().append("\n");
        }

    }
    public void initController(){
        //add action listeners here
        //view.getBTNAddStaff().addActionListener(e -> addStaff("modelStaff.csv"));

    }
}
