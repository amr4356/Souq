package project;

public class Payment {
    private static double totalPrice;
    private static int paymentMethod;
    private static boolean isPaid;

    public Payment() {
        this.totalPrice = 0.0;
        this.paymentMethod = 0;
        this.isPaid = false;
    }

    public static void processPayment(double tPrice, int pMethod) {
        paymentMethod = pMethod;

        if (!isPaid) {
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
            isPaid = true;
            totalPrice = tPrice;
        } else {
            System.out.println("Payment has already been processed.");
        }
    }

    // Method to get the total price of the payment
    public double getTotalPrice() {
        return totalPrice;
    }

    // Method to get the payment method
    public int getPaymentMethod() {
        return paymentMethod;
    }

    // Method to check if payment has been made
    public boolean isPaid() {
        return isPaid;
    }
}