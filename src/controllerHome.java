import java.io.*;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.nio.*;

public class controllerHome {
    private viewHome view;



    public controllerHome(viewHome view){
        this.view = view;
        initController();
    }



    public void initController(){
        //button listeners
        view.getBTNStaff().addActionListener(e -> openLogin("modelStaff.csv"));
        view.getBTNCustomer().addActionListener(e -> openCustomerView());

    }
    private void openLogin(String address){
        //viewStaff staffView = new viewStaff();


        //modelStaff[] staffModel = loadModelStaffCSV("modelStaff.csv");

        int linesNumber = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(address))) {
            while (reader.readLine() != null) linesNumber++;
        } catch (IOException e) {
            e.printStackTrace();
        }
        linesNumber -=1; //-1 to remove header
        modelStaff[] staffModel = new modelStaff[linesNumber];
        for (int i = 0; i <= linesNumber - 1; i++)
        {
            staffModel[i] = new modelStaff();
            staffModel[i].loadStaffCSV(address, i);
        }

        viewLogin loginView = new viewLogin();
        controllerLogin loginController = new controllerLogin(staffModel, loginView);



    }





    private void openCustomerView(){

    }

}
