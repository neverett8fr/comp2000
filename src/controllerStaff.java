import javax.swing.JOptionPane;
public class controllerStaff {
    private modelStaff model;
    private viewStaff view;

    public controllerStaff(modelStaff model, viewStaff view){
        this.model = model;
        this.view = view;
        initView();
    }

    public void initView(){

    }
    public void initController(){

    }

    public void setStaffName(String name){
        model.setName(name);
        JOptionPane.showMessageDialog(null, "Done"
                , "Info", JOptionPane.INFORMATION_MESSAGE);
    }

    public String getStaffName(){
        return  model.getName();
    }

    public void updateView(){
        view.printStaffDetails(model.getName());
    }

}
