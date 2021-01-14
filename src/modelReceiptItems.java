import java.io.BufferedReader;
import java.io.FileReader;

public class modelReceiptItems {
    private int receiptItemID;
    private int receiptID;
    private int itemID;

    public int getReceiptItemID(){
        return receiptItemID;
    }
    public int getReceiptID(){
        return receiptID;
    }
    public int getItemID(){
        return itemID;
    }

    public void setReceiptItemID(int receiptItemID) { this.receiptItemID = receiptItemID; }
    public void setReceiptID(int receiptID) { this.receiptID = receiptID; }
    public void setItemID(int itemID) { this.itemID = itemID; }

    public modelReceiptItems(){

    }

    public void loadModelCSV(String address, int position)
    {
        int whileCount = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(address))) {
            String row;
            BufferedReader csvReader = new BufferedReader(new FileReader(address));
            csvReader.readLine(); //skips headers (first line)
            while ((row = csvReader.readLine()) != null) {

                String[] data = row.split(",");
                // do something with the data
                int receiptItemID = Integer.parseInt(data[0]);
                int receiptID = Integer.parseInt(data[1]);
                int itemID = Integer.parseInt(data[2]);


                if (whileCount == position){
                    this.receiptItemID = receiptItemID;
                    this.receiptID = receiptID;
                    this.itemID = itemID;
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
