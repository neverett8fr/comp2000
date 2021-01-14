import java.io.*;

public class modelReceipt {
    private int receiptID;
    private String paymentMethod;
    private float amountPaid;
    private float totalPrice;

    public int getReceiptID(){
        return receiptID;
    }
    public String getPaymentMethod(){
        return paymentMethod;
    }
    public float getAmountPaid(){
        return amountPaid;
    }
    public float getTotalPrice(){
        return totalPrice;
    }

    public float calculateChange(){
        return (amountPaid - totalPrice);
    }

    public void setReceiptID(int receiptID) { this.receiptID = receiptID; }
    public void setPaymentMethod(String paymentMethod) { this.paymentMethod = paymentMethod; }
    public void setAmountPaid(float amountPaid) { this.amountPaid = amountPaid; }
    public void setTotalPrice(float totalPrice) { this.totalPrice = totalPrice; }

    public modelReceipt(){

    }


    public void setModelCSV(String address)
    {
        try{
            FileWriter writer = new FileWriter(address, true);
            writer.write(receiptID + "," +paymentMethod +
                    ","+amountPaid+","+totalPrice+"\n");
            writer.close();
        }
        catch (Exception e){}

    }

    public void loadModelCSV(String address, int position)
    {
        int whileCount = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(address))) {
            String row;
            BufferedReader csvReader = new BufferedReader(new FileReader(address));
            //csvReader.readLine(); //skips headers (first line)
            while ((row = csvReader.readLine()) != null) {

                String[] data = row.split(",");
                // do something with the data
                int receiptID = Integer.parseInt(data[0]);
                String paymentMethod = data[1];
                float amountPaid = Float.parseFloat(data[2]);
                float totalPrice = Float.parseFloat(data[3]);


                if (whileCount == position){
                    this.receiptID = receiptID;
                    this.paymentMethod = paymentMethod;
                    this.amountPaid = amountPaid;
                    this.totalPrice = totalPrice;

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
