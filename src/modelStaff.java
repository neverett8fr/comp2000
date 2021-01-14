import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.EventListener;

public class modelStaff {
    private int staffID;
    private String staffName;
    private String staffUsername;
    private String staffPasswordHash;

    //parse in hash, check locally with subroutine then allow change

    public int getStaffID(){
        return staffID;
    }
    public void setStaffID(int staffID){
        this.staffID = staffID;
    }
    public String getStaffName(){
        return staffName;
    }
    public void setStaffName(String staffName){
        this.staffName = staffName;
    }
    public String getStaffUsername(){
        return staffUsername;
    }
    public void setStaffUsername(String staffUsername){
        this.staffUsername = staffUsername;
    }
    public String getStaffPasswordHash(){
        return staffPasswordHash;
    }
    public void setStaffPasswordHash(String staffPasswordHash){
        this.staffPasswordHash = staffPasswordHash;
    }

    public modelStaff(){

    }

    public modelStaff(int staffID, String staffName,
                      String staffUsername,
                      String staffPasswordHash)
    {
        this.staffID = staffID;
        this.staffName = staffName;
        this.staffUsername = staffUsername;
        this.staffPasswordHash = staffPasswordHash;


    }



    //method to load in data from csv
    public void loadStaffCSV(String address, int position)
    {

        int whileCount = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(address))) {
            String row;
            BufferedReader csvReader = new BufferedReader(new FileReader(address));
            //csvReader.readLine(); //skips headers (first line)
            while ((row = csvReader.readLine()) != null) {

                String[] data = row.split(",");
                // do something with the data
                int staffID = Integer.parseInt(data[0]);
                String staffName = data[1];
                String staffUsername = data[2];
                String staffPasswordHash = data[3];


                if (whileCount == position){
                    this.staffID = staffID;
                    this.staffName = staffName;
                    this.staffUsername = staffUsername;
                    this.staffPasswordHash = staffPasswordHash;
                }
                whileCount +=1;


                //below resizes array and adds newly created model in;
                //modelStaff[] b = new modelStaff[outputArray.length + 1];
                //for (int i=0; i < outputArray.length; ++i) {
                //    b[i] = outputArray[i];
                //}
                //outputArray = b;

                //outputArray[outputArray.length - 1] = constructor;

            }
            csvReader.close();
        }
        catch (Exception e) {
            System.out.println("error");
        }

    }


}
