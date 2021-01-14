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
    private JButton BTNAddNewItem;
    private JTextArea TXTReceiptInfo;

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
        TXTReceiptInfo = new JTextArea("Receipt Info: ");
        BTNAddStaff = new JButton("Add Staff");
        BTNAddNewItem = new JButton("Add New Item");

        panelOne = new JPanel();
        panelTwo = new JPanel();
        panelThree = new JPanel();


        //add UI element to frame
        //create JPanel

        panelOne.add(LBLStaffName);
        panelOne.add(LBLStaffID);

        panelTwo.add(TXTStaffInfo);
        panelTwo.add(TXTReceiptInfo);
        panelTwo.add(TXTItemInfo);

        panelThree.add(BTNAddStaff);
        panelThree.add(BTNAddNewItem);

        frame.getContentPane().add(BorderLayout.PAGE_START, panelOne);
        frame.getContentPane().add(BorderLayout.CENTER, panelTwo);
        frame.getContentPane().add(BorderLayout.PAGE_END, panelThree);


    }

    public JFrame getFrame(){
        return frame;
    }
    public JLabel getLBLStaffID(){return LBLStaffID;}
    public JLabel getLBLStaffName(){return LBLStaffName;}
    public JTextArea getTXTStaffInfo(){return TXTStaffInfo;}
    public JTextArea getTXTItemInfo(){return TXTItemInfo;}
    public JTextArea getTXTReceiptInfo(){return TXTReceiptInfo;}

    public JButton getBTNAddStaff(){return BTNAddStaff;};
    public JButton getBTNAddNewItem(){return BTNAddNewItem;};




}
