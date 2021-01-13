import javax.swing.JOptionPane;
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
        view.getLBLStaffName().setText(model.getStaffName());
    }
    public void initController(){
        //add action listeners here

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
