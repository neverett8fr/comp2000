import javax.swing.*;
import java.awt.*;

public class viewCustomer {

    private JFrame frame;
    private JPanel panel;
    private JTextArea TXTItemsAdded;
    private JButton BTNAddItem;
    private JButton BTNCheckout;
    private JLabel LBLRunningTotal;

    public viewCustomer(){
        frame = new JFrame("Customer View");
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(1000,750);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        //UI elements
        panel = new JPanel();
        TXTItemsAdded = new JTextArea("Items:");
        BTNAddItem = new JButton("Add Item");
        BTNCheckout = new JButton("Checkout");
        LBLRunningTotal = new JLabel("Total: ");


        //add UI element to frame
        //create JPanel

        panel.add(BTNAddItem, BorderLayout.NORTH);
        panel.add(BTNCheckout, BorderLayout.SOUTH);

        frame.getContentPane().add(BorderLayout.CENTER, TXTItemsAdded);
        frame.getContentPane().add(BorderLayout.PAGE_END, LBLRunningTotal);
        frame.getContentPane().add(BorderLayout.LINE_END, panel);

    }

    public JFrame getFrame(){
        return frame;
    }
    public JTextArea getTXTItemsAdded(){return TXTItemsAdded;}
    public JButton getBTNAddItem(){return BTNAddItem;}
    public JButton getBTNCheckout(){return BTNCheckout;}
    public JLabel getLBLRunningTotal(){return LBLRunningTotal;}
}
