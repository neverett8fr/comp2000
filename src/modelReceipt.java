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
    public void setChangeGiven(float amountPaid) { this.amountPaid = amountPaid; }
    public void setTotalPrice(float totalPrice) { this.totalPrice = totalPrice; }

}
