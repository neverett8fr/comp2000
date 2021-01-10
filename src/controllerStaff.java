public class controllerStaff {
    private modelStaff model;
    private viewStaff view;

    public controllerStaff(modelStaff model, viewStaff view){
        this.model = model;
        this.view = view;
    }

    public void setStaffName(String name){
        model.setName(name);

    }

    public String getStaffName(){
        return  model.getName();
    }

    public void updateView(){
        view.printStaffDetails(model.getName());
    }

}
