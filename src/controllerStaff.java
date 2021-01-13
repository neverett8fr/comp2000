import javax.swing.JOptionPane;
import java.awt.*;

public class controllerStaff {
    private int staffPosition;
    private viewStaff view;
    private modelStaff[] modelStaffCollection;

    public controllerStaff(modelStaff[] modelStaffCollection, int staffPosition, viewStaff view){
        this.staffPosition = staffPosition;
        this.view = view;
        this.modelStaffCollection = modelStaffCollection;
        initView();
        initController();
    }

    public void initView(){
        view.getLBLStaffName().setText("Name: "+modelStaffCollection[staffPosition].getStaffName());
        view.getLBLStaffID().setText("Staff ID: "+String.valueOf(modelStaffCollection[staffPosition].getStaffID()));

        view.getTXTStaffInfo().setFont(new Font("New Times Roman", Font.BOLD, 20));
        for (int i = 0; i <= modelStaffCollection.length - 1; i++) {
            view.getTXTStaffInfo().append("\n");
            view.getTXTStaffInfo().append("Staff ID: " + String.valueOf(modelStaffCollection[i].getStaffID()));
            view.getTXTStaffInfo().append("\n");
            view.getTXTStaffInfo().append("Staff Name: " + modelStaffCollection[i].getStaffName());
            view.getTXTStaffInfo().append("\n");
            view.getTXTStaffInfo().append("Staff Username: "+ modelStaffCollection[i].getStaffUsername());

        }


        view.getTXTItemInfo().setFont(new Font("New Times Roman", Font.BOLD, 20));
        }
    public void initController(){
        //add action listeners here
        view.getBTNAddStaff().addActionListener(e -> addStaff("modelStaff.csv"));

    }

    private void addStaff(String address){

    }

    public void setStaffName(String name){
        modelStaffCollection[staffPosition].setStaffName(name);
        JOptionPane.showMessageDialog(null, "Done"
                , "Info", JOptionPane.INFORMATION_MESSAGE);
    }

    public String getStaffName(){
        return  modelStaffCollection[staffPosition].getStaffName();
    }

    public void updateView(){

        //view.printStaffDetails(model.getStaffName());
    }

}
