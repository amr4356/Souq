package restaurant;

public class Payment {

    public static void processPayment(double totalPrice, int paymentMethod) {
        System.out.println("\nProcessing payment...");
        // Implement payment processing based on payment method
        switch (paymentMethod) {
            case 1:
                System.out.println("Paid with Credit card.");
                break;
            case 2:
                System.out.println("Paid with Debit card.");
                break;
            case 3:
                System.out.println("Paid with Benefitpay.");
                break;
            default:
                System.out.println("Invalid payment method.");
                return;
        }
        System.out.println("Payment processed successfully.");
    }
}