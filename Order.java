public class Order {
    private String item;
    private Integer quantity;
    private Double unitPrice;
    private Double totalAmount;
    private PaymentMode mode;
    public Order(){

    }
    public Order(String item, Integer quantity, Double unitPrice, PaymentMode mode) {
        this.item = item;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.mode = mode;
        setTotalAmount();
    }
    public PaymentMode getMode() {
        return mode;
    }

    public void setMode(PaymentMode mode) {
        this.mode = mode;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getTotalAmount(){
        return totalAmount;
    }

    public void setTotalAmount() {
        this.totalAmount = this.unitPrice * this.quantity * (1 - mode.determineDiscountRate());
    }


}