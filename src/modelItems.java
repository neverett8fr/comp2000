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
    public void setItemPrice(float itemPrice) { this.itemPrice = itemPrice; }

    public void itemPurchase(){
        this.quantityStock -=1;
    }
    public void addStock(int quantity) { this.quantityStock += quantity; }

}
