public class controllerLogin {
    private modelStaff model;
    private viewLogin view;

    private String usernameInput;
    private String passHashInput;

    public controllerLogin(modelStaff model, viewLogin view){
        this.model = model;
        this.view = view;
        initView();
        initController();
    }

    public void initView(){

    }
    public void initController(){
        //add action listeners here
        view.getBTNSubmit().addActionListener(e -> getLoginDetails(view));

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

    private void openStaff(){

        viewStaff staffView = new viewStaff();
        controllerStaff staffController = new controllerStaff(model, staffView);
        //staffController.initView();
        //staffController.initController();
    }

}
