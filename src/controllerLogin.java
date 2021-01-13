public class controllerLogin {
    private modelStaff[] model;
    private viewLogin view;

    private String usernameInput;
    private String passHashInput;

    public controllerLogin(modelStaff[] model, viewLogin view){
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
        passHashInput = view.getPassword(); //could hash it here -- thought it better to only give controller the hashed and not plaintext

        for (int i = 0; i < model.length ; i++) {


            if (usernameInput.equals(model[i].getStaffUsername()) &&
                    passHashInput.equals(model[i].getStaffPasswordHash())) //try login -- search for username in db & compare hashes
            {
                //& passHashInput == model[i].getStaffPasswordHash()

                openStaff(i);
                break;
            }
        }


        //System.out.println(usernameInput);
        //System.out.println(passHashInput);

    }

    private void openStaff(int staffPosition){

        viewStaff staffView = new viewStaff();
        controllerStaff staffController = new controllerStaff(model[staffPosition], staffView);
        //staffController.initView();
        //staffController.initController();
    }

}
