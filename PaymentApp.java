public class PaymentApp {
    public static void main(String[] args){
        Order gcash = new Order("Keyboard", 10, 300.0, new Gcash());
        System.out.println("Order item is " + gcash.getItem() + ".");
        System.out.println("Unit price is " + gcash.getUnitPrice());
        System.out.println("Quantity is " + gcash.getQuantity());

        System.out.println("\nPayment order details if " + gcash.getMode().getClass().getSimpleName());
        System.out.println("Discount Rate is " + gcash.getMode().determineDiscountRate());
        System.out.println("Payment amount is " + gcash.getTotalAmount());

        Order payMaya = new Order();
        payMaya.setItem("Keyboard");
        payMaya.setUnitPrice(300.0);
        payMaya.setQuantity(10);
        payMaya.setMode(new Maya());
        payMaya.setTotalAmount();
        System.out.println("\nPayment order details if " + payMaya.getMode().getClass().getSimpleName());
        System.out.println("Discount Rate is " + payMaya.getMode().determineDiscountRate());
        System.out.println("Payment amount is " + payMaya.getTotalAmount());

        Order shopeePay = new Order("Keyboard", 10, 300.0, new ShopeePay());
        System.out.println("\nPayment order details if " + shopeePay.getMode().getClass().getSimpleName());
        System.out.println("Discount Rate is " + shopeePay.getMode().determineDiscountRate());
        System.out.println("Payment amount is " + shopeePay.getTotalAmount());
    }
}