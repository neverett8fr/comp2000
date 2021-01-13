import javax.swing.*;
import java.awt.*;


public class viewLogin {
    private JFrame frame;
    private JButton BTNSubmit;
    private JLabel LBLUsername;
    private JLabel LBLPassword;
    private JTextField TXTUsername;
    private JTextField TXTPassword;

    public JFrame getFrame(){
        return frame;
    }
    public JButton getBTNSubmit(){ return BTNSubmit; }
    public String getUsername(){return TXTUsername.getText();}
    public String getPassword()
    {
        String hashToReturn = "";
        hashSHA256 hash = new hashSHA256();
        hashToReturn = hash.returnHash(TXTPassword.getText());

        return hashToReturn;
    }


    public viewLogin(){
        frame = new JFrame("Login View");
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(500,120);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        //UI Elements
        BTNSubmit = new JButton("Submit");
        LBLUsername = new JLabel("Username: ");
        LBLPassword = new JLabel("Password: ");
        TXTUsername = new JTextField("Enter Username");
        TXTPassword = new JTextField("Enter Password");

        //add UI to frame
        frame.getContentPane().add(LBLUsername, BorderLayout.PAGE_START);
        frame.getContentPane().add(TXTUsername, BorderLayout.LINE_START);
        frame.getContentPane().add(LBLPassword, BorderLayout.CENTER);
        frame.getContentPane().add(TXTPassword, BorderLayout.LINE_END);
        frame.getContentPane().add(BTNSubmit, BorderLayout.PAGE_END);

        BTNSubmit.addActionListener(e -> frame.dispose());


    }



}
