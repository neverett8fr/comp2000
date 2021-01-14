import java.io.BufferedReader;
import java.io.FileReader;

public class modelItems {
    private int itemID;
    private String itemName;
    private float itemPrice;
    private int quantityStock;

    public int getItemID(){
        return itemID;
    }
    public String getItemName() { return itemName; }
    public float getItemPrice() { return itemPrice; }
    public int getQuantityStock() { return quantityStock; }

    public void setItemPrice(float itemPrice) { this.itemPrice = itemPrice; }

    public void itemPurchase(){
        this.quantityStock -=1;
    }
    public void addStock(int quantity) { this.quantityStock += quantity; }



    public modelItems(){

    }

    public modelItems(int itemID, String itemName,
                      float itemPrice,
                      int quantityStock)
    {
        this.itemID = itemID;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.quantityStock = quantityStock;


    }



    //method to load in data from csv
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
                int itemID = Integer.parseInt(data[0]);
                String itemName = data[1];
                float itemPrice = Float.parseFloat(data[2]);
                int quantityStock = Integer.parseInt(data[3]);


                if (whileCount == position){
                    this.itemID = itemID;
                    this.itemName = itemName;
                    this.itemPrice = itemPrice;
                    this.quantityStock = quantityStock;
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
