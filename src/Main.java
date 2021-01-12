public class Main {

    public static void main(String[] args) {
	// write your code here

        //fetch from DB
        modelStaff model = retrieveStaffFromDatabase();
        //--

        //create a view: write details down
        viewStaff view = new viewStaff("Staff View");
        controllerStaff controller = new controllerStaff(model, view);
        controller.updateView();
        //--

        //update model data
        controller.setStaffName("Nathan");
        controller.updateView();
        //--

    }

    private static modelStaff retrieveStaffFromDatabase(){
        modelStaff staff = new modelStaff();
        staff.setName("Nathan");

        return staff;

    }
}
