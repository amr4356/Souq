
import org.junit.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PaymentTest {

    private ByteArrayOutputStream outContent;
    private Payment payment;

    @Before
    public void setUp() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        payment = new Payment();
    }

    @Test
    public void testProcessPayment_CreditCard() {

        // Act
        Payment.processPayment(100.0, 1);

        // Assert
        String actualOutput = outContent.toString();
        Assert.assertTrue(actualOutput.contains("Processing payment..."));
        Assert.assertTrue(actualOutput.contains("Paid with Credit card."));
        Assert.assertTrue(actualOutput.contains("Payment processed successfully."));
    }

    @Test
    public void testProcessPayment_DebitCard() {

        // Act
        Payment.processPayment(100.0, 2);

        // Assert
        String actualOutput = outContent.toString();
        Assert.assertTrue(actualOutput.contains("Processing payment..."));
        Assert.assertTrue(actualOutput.contains("Paid with Debit card."));
        Assert.assertTrue(actualOutput.contains("Payment processed successfully."));
    }

    @Test
    public void testProcessPayment_BenefitPay() {

        // Act
        Payment.processPayment(100.0, 3);

        // Assert
        String actualOutput = outContent.toString();
        Assert.assertTrue(actualOutput.contains("Processing payment..."));
        Assert.assertTrue(actualOutput.contains("Paid with Benefitpay."));
        Assert.assertTrue(actualOutput.contains("Payment processed successfully."));
    }

    @Test
    public void testProcessPayment_InvalidMethod() {

        // Act
        Payment.processPayment(100.0, 4);

        // Assert
        String actualOutput = outContent.toString();
        Assert.assertTrue(actualOutput.contains("Processing payment..."));
        Assert.assertTrue(actualOutput.contains("Invalid payment method."));
    }

    @Test
    public void testProcessPaymentValidMethod() {
        Payment.processPayment(50.0, 1);
        assertTrue(payment.isPaid(), "Payment should be marked as paid");
        assertEquals(50.0, payment.getTotalPrice(), "Total price should be 50.0");
        assertEquals(1, payment.getPaymentMethod(), "Payment method should be 1");
    }

    @Test
    public void testProcessPaymentInvalidMethod() {
        Payment.processPayment(60.0, 5);
        assertFalse(payment.isPaid(), "Payment should not be marked as paid for invalid payment method");
        assertEquals(0.0, payment.getTotalPrice(), "Total price should be 0.0 for invalid payment method");
        assertEquals(5, payment.getPaymentMethod(), "Payment method should be 5 for invalid payment method");
    }

    @Test
    public void testProcessPaymentAgain() {
        Payment.processPayment(70.0, 2);
        assertTrue(payment.isPaid(), "Payment should be marked as paid again");
        assertEquals(70.0, payment.getTotalPrice(), "Total price should be updated to 70.0");
        assertEquals(2, payment.getPaymentMethod(), "Payment method should be updated to 2");
    }

}