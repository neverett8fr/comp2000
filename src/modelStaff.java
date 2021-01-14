import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class modelStaff {
    private int staffID;
    private String staffName;
    private String staffUsername;
    private String staffPasswordHash;

    //parse in hash, check locally with subroutine then allow change

    public int getStaffID(){
        return staffID;
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
    public String getStaffPasswordHash(){
        return staffPasswordHash;
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

    public void setModelCSV(String address)
    {
        try{
            FileWriter writer = new FileWriter(address, true);
            writer.write(staffID + "," +staffName +
                    ","+staffUsername+","+staffPasswordHash+"\n");
            writer.close();
        }
        catch (Exception e){}

    }

    public void loadStaffCSV(String address, int position)
    {

        int whileCount = 0;
        try {
            String row;
            BufferedReader csvReader = new BufferedReader(new FileReader(address));

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


            }
            csvReader.close();
        }
        catch (Exception e) {
            System.out.println("error");
        }

    }


}
