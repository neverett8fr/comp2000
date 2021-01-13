import javax.swing.JOptionPane;
import java.awt.*;

public class controllerStaff {
    private modelStaff model;
    private viewStaff view;

    public controllerStaff(modelStaff model, viewStaff view){
        this.model = model;
        this.view = view;
        initView();
        initController();
    }

    public void initView(){
        view.getLBLStaffName().setText("Name: "+model.getStaffName());
        view.getLBLStaffID().setText("Staff ID: "+String.valueOf(model.getStaffID()));

        view.getTXTStaffInfo().setFont(new Font("New Times Roman", Font.BOLD, 20));
        view.getTXTStaffInfo().append("\n");
        view.getTXTStaffInfo().append("Staff ID: " + String.valueOf(model.getStaffID()));
        view.getTXTStaffInfo().append("\n");
        view.getTXTStaffInfo().append("Staff Name: " + model.getStaffName());
        view.getTXTStaffInfo().append("\n");
        view.getTXTStaffInfo().append("Staff Username: "+ model.getStaffUsername());

        view.getTXTItemInfo().setFont(new Font("New Times Roman", Font.BOLD, 20));
        }
    public void initController(){
        //add action listeners here
        view.getBTNAddStaff().addActionListener(e -> addStaff("modelStaff.csv"));

    }

    private void addStaff(String address){

    }

    public void setStaffName(String name){
        model.setStaffName(name);
        JOptionPane.showMessageDialog(null, "Done"
                , "Info", JOptionPane.INFORMATION_MESSAGE);
    }

    public String getStaffName(){
        return  model.getStaffName();
    }

    public void updateView(){

        //view.printStaffDetails(model.getStaffName());
    }

}
