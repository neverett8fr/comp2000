import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class viewHome {
    //view uses swing framework to display UI to user
    private JFrame frame;
    private JLabel LBLTitle;
    private JButton BTNStaff;
    private JButton BTNCustomer;

    public JFrame getFrame(){
        return frame;
    }
    public JButton getBTNStaff(){ return BTNStaff; }
    public JButton getBTNCustomer(){ return BTNCustomer; }

    public viewHome(){
        frame = new JFrame("Home Menu");
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,750);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        //UI elements
        LBLTitle = new JLabel("Home Menu");
        BTNStaff = new JButton("Staff Login");
        BTNCustomer = new JButton("Scan Items");

        //add UI element to frame
        frame.getContentPane().add(LBLTitle, BorderLayout.PAGE_START);
        frame.getContentPane().add(BTNStaff, BorderLayout.PAGE_END);
        frame.getContentPane().add(BTNCustomer, BorderLayout.CENTER);
    }

}
