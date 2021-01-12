public class modelStaff {
    private int staffID;
    private String staffName;
    private String staffUsername;
    private int staffPasswordHash;

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
    public int getStaffPasswordHash(){
        return staffPasswordHash;
    }
    public void setStaffPasswordHash(int staffPasswordHash){
        this.staffPasswordHash = staffPasswordHash;
    }

}
