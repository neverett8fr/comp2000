import java.awt.event.ActionListener;
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

    public modelStaff(int staffID, String staffName,
                      String staffUsername,
                      String staffPasswordHash)
    {
        this.staffID = staffID;
        this.staffName = staffName;
        this.staffUsername = staffUsername;
        this.staffPasswordHash = staffPasswordHash;


    }



    //method to return hash


}
