
public class controllerHome {
    private viewHome view;



    public controllerHome(viewHome view){
        this.view = view;
        loadData();
        initController();
    }

    public void loadData(){

    }

    public void initController(){
        //button listeners
        view.getBTNStaff().addActionListener(e -> openLogin());
        view.getBTNCustomer().addActionListener(e -> openCustomerView());

    }
    private void openLogin(){
        //viewStaff staffView = new viewStaff();

        modelStaff staffModel= new modelStaff();

        viewLogin loginView = new viewLogin();
        controllerLogin loginController = new controllerLogin(staffModel, loginView);





    }





    private void openCustomerView(){

    }

}
