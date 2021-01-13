import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class controllerHome {
    private viewHome view;



    public controllerHome(viewHome view){
        this.view = view;
        initController();
    }


    public modelStaff[] loadModelStaffCSV(String address){

        modelStaff[] outputArray = new modelStaff[0];
        int whileCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(address))) {
            String row;
            BufferedReader csvReader = new BufferedReader(new FileReader(address));
            csvReader.readLine(); //skips headers (first line)
            while ((row = csvReader.readLine()) != null) {

                String[] data = row.split(",");
                // do something with the data
                int staffID = Integer.parseInt(data[0]);
                String staffName = data[1];
                String staffUsername = data[2];
                String staffPasswordHash = data[3];

                modelStaff constructor = new modelStaff(staffID,
                        staffName, staffUsername, staffPasswordHash);


                //below resizes array and adds newly created model in;
                modelStaff[] b = new modelStaff[outputArray.length + 1];
                for (int i=0; i < outputArray.length; ++i) {
                    b[i] = outputArray[i];
                }
                outputArray = b;

                outputArray[outputArray.length - 1] = constructor;

            }
            csvReader.close();
        }
        catch (Exception e) {
            System.out.println("error");
        }

        return outputArray;
    }

    public void initController(){
        //button listeners
        view.getBTNStaff().addActionListener(e -> openLogin());
        view.getBTNCustomer().addActionListener(e -> openCustomerView());

    }
    private void openLogin(){
        //viewStaff staffView = new viewStaff();

        modelStaff[] staffModel = loadModelStaffCSV("modelStaff.csv");

        viewLogin loginView = new viewLogin();
        controllerLogin loginController = new controllerLogin(staffModel, loginView);



    }





    private void openCustomerView(){

    }

}
