public class PaymentApp {
    public static void main(String[] args){
        Order app = new Order("Keyboard", 10, 300.0, new Gcash());
        System.out.println("Order item is " + app.getItem() + ".");
        System.out.println("Unit price is " + app.getUnitPrice());
        System.out.println("Quantity is " + app.getQuantity());

        System.out.println("\nPayment order details if " + app.getMode().getClass().getSimpleName());
        System.out.println("Discount Rate is " + app.getMode().determineDiscountRate());
        System.out.println("Payment amount is " + app.getTotalAmount());

        app.setMode(new Maya());
        app.setTotalAmount();
        System.out.println("\nPayment order details if " + app.getMode().getClass().getSimpleName());
        System.out.println("Discount Rate is " + app.getMode().determineDiscountRate());
        System.out.println("Payment amount is " + app.getTotalAmount());

        app.setMode(new ShopeePay());
        app.setTotalAmount();
        System.out.println("\nPayment order details if " + app.getMode().getClass().getSimpleName());
        System.out.println("Discount Rate is " + app.getMode().determineDiscountRate());
        System.out.println("Payment amount is " + app.getTotalAmount());
    }
}
