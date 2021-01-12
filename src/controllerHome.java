public class controllerHome {
    private viewHome view;
    public controllerHome(viewHome view){
        this.view = view;
    }

    public void initController(){
        //button listeners
        view.getBTNStaff().addActionListener(e -> openLoginView());
        view.getBTNCustomer().addActionListener(e -> openCustomerView());
    }
    private void openLoginView(){
        //viewStaff staffView = new viewStaff();


    }
    private void openCustomerView(){

    }

}
