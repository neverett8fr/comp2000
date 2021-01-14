import javax.swing.JOptionPane;
import java.awt.*;

public class controllerStaff {
    private int staffPosition;
    private viewStaff view;
    private modelStaff[] modelStaffCollection;

    private modelItems[] modelItemsCollection;

    public controllerStaff(modelStaff[] modelStaffCollection, int staffPosition, viewStaff view,
                           modelItems[] modelItemsCollection){
        this.modelItemsCollection = modelItemsCollection;
        this.staffPosition = staffPosition;
        this.view = view;
        this.modelStaffCollection = modelStaffCollection;
        initView();
        initController();
    }

    public void initView(){
        view.getLBLStaffName().setText("Name: "+modelStaffCollection[staffPosition].getStaffName());
        view.getLBLStaffID().setText("Staff ID: "+String.valueOf(modelStaffCollection[staffPosition].getStaffID()));

        view.getTXTStaffInfo().setFont(new Font("New Times Roman", Font.BOLD, 15));
        view.getTXTStaffInfo().append("\n");
        for (int i = 0; i <= modelStaffCollection.length - 1; i++) {
            view.getTXTStaffInfo().append("\n");
            view.getTXTStaffInfo().append("Staff ID: " + String.valueOf(modelStaffCollection[i].getStaffID()));
            view.getTXTStaffInfo().append("\n");
            view.getTXTStaffInfo().append("Staff Name: " + modelStaffCollection[i].getStaffName());
            view.getTXTStaffInfo().append("\n");
            view.getTXTStaffInfo().append("Staff Username: "+ modelStaffCollection[i].getStaffUsername());
            view.getTXTStaffInfo().append("\n");
        }

        view.getTXTItemInfo().setFont(new Font("New Times Roman", Font.BOLD, 15));
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
        view.getBTNAddStaff().addActionListener(e -> addStaff("modelStaff.csv"));
        view.getBTNAddNewItem().addActionListener(e -> addItem("modelItems.csv"));
    }
    private void addItem(String address){
        int newID = 1;
        newID = 1;
        boolean available = false;
        while( !available ) //searches csv for mentions of id, if exists add one to it and try again
        {
            for (int i = 0; i < modelItemsCollection.length; i++) {
                if ((modelItemsCollection[i].getItemID() == newID)) {
                    available = false;
                    newID += 1;
                    break;
                } else {
                    available = true;
                }
            }
        }


        String itemName = JOptionPane.showInputDialog("Enter the Item name");
        float itemPrice = Float.parseFloat(JOptionPane.showInputDialog("Enter the Item price"));
        int quantityStock = Integer.parseInt(JOptionPane.showInputDialog("Enter the amount in stock"));

        modelItems addNewStaff = new modelItems(newID, itemName
                ,itemPrice, quantityStock);

        addNewStaff.setModelCSV(address);

    }

    private void addStaff(String address){

        int newID = 1;
        boolean available = false;
        while( !available ) //searches csv for mentions of id, if exists add one to it and try again
        {
            for (int i = 0; i < modelStaffCollection.length; i++) {
                if ((modelStaffCollection[i].getStaffID() == newID)) {
                    available = false;
                    newID += 1;
                    break;
                } else {
                    available = true;
                }
            }
        }


        String staffName = JOptionPane.showInputDialog("Enter The Staff name");
        String staffUsername = JOptionPane.showInputDialog("Enter the username");
        String staffPassword =
                new hashSHA256().returnHash(
                        (JOptionPane.showInputDialog
                                ("Enter your password")));

        modelStaff addNewStaff = new modelStaff(newID,staffName
                , staffUsername, staffPassword);

        addNewStaff.setModelCSV(address);

    }


}
