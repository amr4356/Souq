package restaurantTest;

import org.junit.*;

import restaurant.Payment;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PaymentTest {

    private ByteArrayOutputStream outContent;

    @Before
    public void setUp() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
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
}
