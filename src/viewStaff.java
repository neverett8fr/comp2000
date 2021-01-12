import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class viewStaff {

    //view uses swing framework to display UI to user
    private JFrame frame;
    private JLabel LBLName;

    public viewStaff(String title){
        frame = new JFrame(title);
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,120);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        //UI elements
        LBLName = new JLabel("Name: ");

        //add UI element to frame
        GroupLayout layout = new GroupLayout(frame.getContentPane());
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        layout.setHorizontalGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        .addComponent(LBLName)));

        frame.getContentPane().setLayout(layout);
    }

    public JFrame getFrame(){
        return frame;
    }

    public void setFrame(JFrame frame){
        this.frame = frame;
    }

    public JLabel getLBLName(){
        return LBLName;
    }

    public void setLBLName(JLabel LBLName){
        this.LBLName = LBLName;
    }



    public void printStaffDetails(String staffName){
        //System.out.println("Staff: " + staffName);


    }

}
