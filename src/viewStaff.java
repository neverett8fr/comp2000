import java.awt.*;
import javax.swing.*;

public class viewStaff {

    //view uses swing framework to display UI to user
    private JFrame frame;
    private JLabel LBLStaffName;
    private JLabel LBLStaffID;
    private JTextArea TXTStaffInfo;
    private JTextArea TXTItemInfo;
    private JButton BTNAddStaff;
    private JButton BTNRemoveStaff;
    private JButton BTNAddStock;
    private JButton BTNAddNewItem;

    private JPanel panelOne;
    private JPanel panelTwo;
    private JPanel panelThree;


    public viewStaff(){
        frame = new JFrame("Staff View");
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(1000,750);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        //UI elements
        LBLStaffName = new JLabel("Name: ");
        LBLStaffID = new JLabel("Staff ID: ");
        TXTStaffInfo = new JTextArea("Staff Info: ");
        TXTItemInfo = new JTextArea("Item Info: ");
        BTNAddStaff = new JButton("Add Staff");
        BTNRemoveStaff = new JButton("Remove Staff");
        BTNAddStock = new JButton("Add Stock");
        BTNAddNewItem = new JButton("Add New Item");

        panelOne = new JPanel();
        panelTwo = new JPanel();
        panelThree = new JPanel();


        //add UI element to frame
        //create JPanel

        panelOne.add(LBLStaffName);
        panelOne.add(LBLStaffID);

        panelTwo.add(TXTStaffInfo, BorderLayout.WEST);
        panelTwo.add(BTNAddStaff);
        panelTwo.add(BTNRemoveStaff);


        panelThree.add(BTNAddStock);
        panelThree.add(BTNAddNewItem);
        panelThree.add(TXTItemInfo, BorderLayout.EAST);

        frame.getContentPane().add(BorderLayout.PAGE_START, panelOne);
        frame.getContentPane().add(BorderLayout.LINE_START, panelTwo);
        frame.getContentPane().add(BorderLayout.LINE_END, panelThree);


    }

    public JFrame getFrame(){
        return frame;
    }
    public JLabel getLBLStaffID(){return LBLStaffID;}
    public JLabel getLBLStaffName(){return LBLStaffName;}
    public JTextArea getTXTStaffInfo(){return TXTStaffInfo;}
    public JTextArea getTXTItemInfo(){return TXTItemInfo;}

    public JButton getBTNAddStaff(){return BTNAddStaff;};
    public JButton getBTNRemoveStaff(){return BTNRemoveStaff;};
    public JButton getBTNAddStock(){return BTNAddStock;};
    public JButton getBTNAddNewItem(){return BTNAddNewItem;};




}
