import java.awt.BorderLayout;
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


    public viewStaff(){
        frame = new JFrame("Staff View");
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(500,120);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        //UI elements
        LBLStaffName = new JLabel("Name: ");
        LBLStaffID = new JLabel("ID: ");
        TXTStaffInfo = new JTextArea("Staff Info: ");
        TXTItemInfo = new JTextArea("Item Info: ");
        BTNAddStaff = new JButton("Add Staff");
        BTNRemoveStaff = new JButton("Remove Staff");
        BTNAddStock = new JButton("Add Stock");
        BTNAddNewItem = new JButton("Add New Item");

        //add UI element to frame
        frame.getContentPane().add(LBLStaffName, BorderLayout.PAGE_START);
        frame.getContentPane().add(LBLStaffID, BorderLayout.SOUTH);
        frame.getContentPane().add(TXTStaffInfo, BorderLayout.WEST);
        frame.getContentPane().add(TXTItemInfo, BorderLayout.EAST);
        frame.getContentPane().add(BTNAddStaff, BorderLayout.PAGE_END);
        frame.getContentPane().add(BTNRemoveStaff, BorderLayout.PAGE_END);
        frame.getContentPane().add(BTNAddStock, BorderLayout.PAGE_END);
        frame.getContentPane().add(BTNAddNewItem, BorderLayout.PAGE_END);

    }

    public JFrame getFrame(){
        return frame;
    }
    public JLabel getLBLStaffName(){return LBLStaffName;}



}
