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
}
