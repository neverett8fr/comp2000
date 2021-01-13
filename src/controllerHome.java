
public class controllerHome {
    private viewHome view;
    private String usernameInput;
    private String passHashInput;

    public controllerHome(viewHome view){
        this.view = view;
        initController();
    }

    public void initController(){
        //button listeners
        view.getBTNStaff().addActionListener(e -> openLogin());
        view.getBTNCustomer().addActionListener(e -> openCustomerView());

    }
    private void openLogin(){
        //viewStaff staffView = new viewStaff();


        viewLogin loginView = new viewLogin();
        loginView.getBTNSubmit().addActionListener(e -> getLoginDetails(loginView));




    }

    private void openStaff(){

        viewStaff staffView = new viewStaff();

        controllerStaff staffController = new controllerStaff(new modelStaff(), staffView);
        //staffController.initView();
        //staffController.initController();
    }

    private void getLoginDetails(viewLogin view){
        usernameInput = view.getUsername();
        passHashInput = view.getPassword();

        modelStaff staffModel = new modelStaff();
        if (passHashInput == staffModel.getStaffPasswordHash()) //try login -- search for username in db & compare hashes
        {
            openStaff();
        }
        //System.out.println(usernameInput);
        //System.out.println(passHashInput);

    }

    private void openCustomerView(){

    }

}
