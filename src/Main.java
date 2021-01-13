public class Main {
    private String usernameInput;
    private String passHashInput;

    public static void main(String[] args) {
	// write your code here

        //fetch from DB
        //modelStaff model = retrieveStaffFromDatabase();
        //--

        //create a view: write details down
        //viewStaff view = new viewStaff("Staff View");
        //controllerStaff controller = new controllerStaff(model, view);
        //controller.updateView();
        //--

        //update model data
        //controller.setStaffName("Nathan");
        //controller.updateView();
        //--


        viewHome homeView = new viewHome();
        controllerHome homeController = new controllerHome(homeView);








    }


}
