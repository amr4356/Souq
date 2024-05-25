
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }

    Payment payment0 = new Payment();
    double d1 = payment0.getTotalPrice();
    boolean b2 = payment0.isPaid();
    boolean b3 = payment0.isPaid();
    double d4 = payment0.getTotalPrice();
    int i5 = payment0.getPaymentMethod();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }

    Payment payment0 = new Payment();
    double d1 = payment0.getTotalPrice();
    boolean b2 = payment0.isPaid();
    int i3 = payment0.getPaymentMethod();
    double d4 = payment0.getTotalPrice();
    double d5 = payment0.getTotalPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }

    Payment payment0 = new Payment();
    double d1 = payment0.getTotalPrice();
    int i2 = payment0.getPaymentMethod();
    int i3 = payment0.getPaymentMethod();
    double d4 = payment0.getTotalPrice();
    int i5 = payment0.getPaymentMethod();
    boolean b6 = payment0.isPaid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }

    Payment payment0 = new Payment();
    double d1 = payment0.getTotalPrice();
    boolean b2 = payment0.isPaid();
    int i3 = payment0.getPaymentMethod();
    double d4 = payment0.getTotalPrice();
    int i5 = payment0.getPaymentMethod();
    int i6 = payment0.getPaymentMethod();
    boolean b7 = payment0.isPaid();
    int i8 = payment0.getPaymentMethod();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }

    Payment payment0 = new Payment();
    int i1 = payment0.getPaymentMethod();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }

    Payment payment0 = new Payment();
    double d1 = payment0.getTotalPrice();
    double d2 = payment0.getTotalPrice();
    double d3 = payment0.getTotalPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }

    Payment payment0 = new Payment();
    double d1 = payment0.getTotalPrice();
    boolean b2 = payment0.isPaid();
    double d3 = payment0.getTotalPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }

    Payment payment0 = new Payment();
    double d1 = payment0.getTotalPrice();
    int i2 = payment0.getPaymentMethod();
    int i3 = payment0.getPaymentMethod();
    double d4 = payment0.getTotalPrice();
    int i5 = payment0.getPaymentMethod();
    int i6 = payment0.getPaymentMethod();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }

    Payment payment0 = new Payment();
    double d1 = payment0.getTotalPrice();
    boolean b2 = payment0.isPaid();
    int i3 = payment0.getPaymentMethod();
    int i4 = payment0.getPaymentMethod();
    double d5 = payment0.getTotalPrice();
    double d6 = payment0.getTotalPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }

    Payment payment0 = new Payment();
    double d1 = payment0.getTotalPrice();
    boolean b2 = payment0.isPaid();
    int i3 = payment0.getPaymentMethod();
    double d4 = payment0.getTotalPrice();
    int i5 = payment0.getPaymentMethod();
    int i6 = payment0.getPaymentMethod();
    boolean b7 = payment0.isPaid();
    boolean b8 = payment0.isPaid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }

    Payment payment0 = new Payment();
    double d1 = payment0.getTotalPrice();
    double d2 = payment0.getTotalPrice();
    boolean b3 = payment0.isPaid();
    boolean b4 = payment0.isPaid();
    int i5 = payment0.getPaymentMethod();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }

    Payment payment0 = new Payment();
    double d1 = payment0.getTotalPrice();
    boolean b2 = payment0.isPaid();
    int i3 = payment0.getPaymentMethod();
    double d4 = payment0.getTotalPrice();
    int i5 = payment0.getPaymentMethod();
    int i6 = payment0.getPaymentMethod();
    double d7 = payment0.getTotalPrice();
    double d8 = payment0.getTotalPrice();
    boolean b9 = payment0.isPaid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }

    Payment payment0 = new Payment();
    double d1 = payment0.getTotalPrice();
    boolean b2 = payment0.isPaid();
    int i3 = payment0.getPaymentMethod();
    boolean b4 = payment0.isPaid();
    int i5 = payment0.getPaymentMethod();
    double d6 = payment0.getTotalPrice();
    int i7 = payment0.getPaymentMethod();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }

    Payment payment0 = new Payment();
    double d1 = payment0.getTotalPrice();
    int i2 = payment0.getPaymentMethod();
    double d3 = payment0.getTotalPrice();
    int i4 = payment0.getPaymentMethod();
    double d5 = payment0.getTotalPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }

    Payment payment0 = new Payment();
    double d1 = payment0.getTotalPrice();
    boolean b2 = payment0.isPaid();
    int i3 = payment0.getPaymentMethod();
    double d4 = payment0.getTotalPrice();
    int i5 = payment0.getPaymentMethod();
    int i6 = payment0.getPaymentMethod();
    double d7 = payment0.getTotalPrice();
    int i8 = payment0.getPaymentMethod();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }

    Payment payment0 = new Payment();
    double d1 = payment0.getTotalPrice();
    boolean b2 = payment0.isPaid();
    int i3 = payment0.getPaymentMethod();
    boolean b4 = payment0.isPaid();
    boolean b5 = payment0.isPaid();
    double d6 = payment0.getTotalPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }

    Payment payment0 = new Payment();
    double d1 = payment0.getTotalPrice();
    boolean b2 = payment0.isPaid();
    int i3 = payment0.getPaymentMethod();
    double d4 = payment0.getTotalPrice();
    int i5 = payment0.getPaymentMethod();
    int i6 = payment0.getPaymentMethod();
    double d7 = payment0.getTotalPrice();
    double d8 = payment0.getTotalPrice();
    int i9 = payment0.getPaymentMethod();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }

    Payment payment0 = new Payment();
    double d1 = payment0.getTotalPrice();
    boolean b2 = payment0.isPaid();
    int i3 = payment0.getPaymentMethod();
    double d4 = payment0.getTotalPrice();
    int i5 = payment0.getPaymentMethod();
    boolean b6 = payment0.isPaid();
    int i7 = payment0.getPaymentMethod();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }

    Payment payment0 = new Payment();
    double d1 = payment0.getTotalPrice();
    double d2 = payment0.getTotalPrice();
    int i3 = payment0.getPaymentMethod();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }

    Payment payment0 = new Payment();
    double d1 = payment0.getTotalPrice();
    boolean b2 = payment0.isPaid();
    boolean b3 = payment0.isPaid();
    boolean b4 = payment0.isPaid();
    boolean b5 = payment0.isPaid();
    int i6 = payment0.getPaymentMethod();
    double d7 = payment0.getTotalPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }

    Payment payment0 = new Payment();
    double d1 = payment0.getTotalPrice();
    boolean b2 = payment0.isPaid();
    int i3 = payment0.getPaymentMethod();
    double d4 = payment0.getTotalPrice();
    int i5 = payment0.getPaymentMethod();
    int i6 = payment0.getPaymentMethod();
    double d7 = payment0.getTotalPrice();
    boolean b8 = payment0.isPaid();
    double d9 = payment0.getTotalPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }

    Payment payment0 = new Payment();
    double d1 = payment0.getTotalPrice();
    boolean b2 = payment0.isPaid();
    int i3 = payment0.getPaymentMethod();
    boolean b4 = payment0.isPaid();
    boolean b5 = payment0.isPaid();
    int i6 = payment0.getPaymentMethod();
    double d7 = payment0.getTotalPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }

    Payment payment0 = new Payment();
    double d1 = payment0.getTotalPrice();
    boolean b2 = payment0.isPaid();
    int i3 = payment0.getPaymentMethod();
    double d4 = payment0.getTotalPrice();
    int i5 = payment0.getPaymentMethod();
    int i6 = payment0.getPaymentMethod();
    double d7 = payment0.getTotalPrice();
    boolean b8 = payment0.isPaid();
    boolean b9 = payment0.isPaid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }

    Payment payment0 = new Payment();
    double d1 = payment0.getTotalPrice();
    double d2 = payment0.getTotalPrice();
    boolean b3 = payment0.isPaid();
    boolean b4 = payment0.isPaid();
    double d5 = payment0.getTotalPrice();
    double d6 = payment0.getTotalPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }

    Payment payment0 = new Payment();
    double d1 = payment0.getTotalPrice();
    boolean b2 = payment0.isPaid();
    int i3 = payment0.getPaymentMethod();
    double d4 = payment0.getTotalPrice();
    int i5 = payment0.getPaymentMethod();
    boolean b6 = payment0.isPaid();
    boolean b7 = payment0.isPaid();
    double d8 = payment0.getTotalPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }

    Payment payment0 = new Payment();
    double d1 = payment0.getTotalPrice();
    boolean b2 = payment0.isPaid();
    boolean b3 = payment0.isPaid();
    double d4 = payment0.getTotalPrice();
    double d5 = payment0.getTotalPrice();
    double d6 = payment0.getTotalPrice();
    int i7 = payment0.getPaymentMethod();
    double d8 = payment0.getTotalPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }

    Payment payment0 = new Payment();
    double d1 = payment0.getTotalPrice();
    boolean b2 = payment0.isPaid();
    int i3 = payment0.getPaymentMethod();
    int i4 = payment0.getPaymentMethod();
    double d5 = payment0.getTotalPrice();
    int i6 = payment0.getPaymentMethod();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }

    Payment payment0 = new Payment();
    double d1 = payment0.getTotalPrice();
    int i2 = payment0.getPaymentMethod();
    boolean b3 = payment0.isPaid();
    double d4 = payment0.getTotalPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }

    Payment payment0 = new Payment();
    double d1 = payment0.getTotalPrice();
    int i2 = payment0.getPaymentMethod();
    int i3 = payment0.getPaymentMethod();
    boolean b4 = payment0.isPaid();
    boolean b5 = payment0.isPaid();
    double d6 = payment0.getTotalPrice();
    boolean b7 = payment0.isPaid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }

    Payment payment0 = new Payment();
    double d1 = payment0.getTotalPrice();
    boolean b2 = payment0.isPaid();
    int i3 = payment0.getPaymentMethod();
    boolean b4 = payment0.isPaid();
    double d5 = payment0.getTotalPrice();
    int i6 = payment0.getPaymentMethod();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }

    Payment payment0 = new Payment();
    double d1 = payment0.getTotalPrice();
    double d2 = payment0.getTotalPrice();
    boolean b3 = payment0.isPaid();
    boolean b4 = payment0.isPaid();
    double d5 = payment0.getTotalPrice();
    int i6 = payment0.getPaymentMethod();
    int i7 = payment0.getPaymentMethod();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test32"); }

    Payment payment0 = new Payment();
    double d1 = payment0.getTotalPrice();
    int i2 = payment0.getPaymentMethod();
    boolean b3 = payment0.isPaid();
    int i4 = payment0.getPaymentMethod();
    double d5 = payment0.getTotalPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }

    Payment payment0 = new Payment();
    double d1 = payment0.getTotalPrice();
    int i2 = payment0.getPaymentMethod();
    int i3 = payment0.getPaymentMethod();
    boolean b4 = payment0.isPaid();
    double d5 = payment0.getTotalPrice();
    int i6 = payment0.getPaymentMethod();
    double d7 = payment0.getTotalPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test34"); }

    Payment payment0 = new Payment();
    double d1 = payment0.getTotalPrice();
    boolean b2 = payment0.isPaid();
    boolean b3 = payment0.isPaid();
    boolean b4 = payment0.isPaid();
    int i5 = payment0.getPaymentMethod();
    double d6 = payment0.getTotalPrice();
    double d7 = payment0.getTotalPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test35"); }

    Payment payment0 = new Payment();
    double d1 = payment0.getTotalPrice();
    int i2 = payment0.getPaymentMethod();
    int i3 = payment0.getPaymentMethod();
    boolean b4 = payment0.isPaid();
    double d5 = payment0.getTotalPrice();
    double d6 = payment0.getTotalPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test36"); }

    Payment payment0 = new Payment();
    double d1 = payment0.getTotalPrice();
    boolean b2 = payment0.isPaid();
    int i3 = payment0.getPaymentMethod();
    boolean b4 = payment0.isPaid();
    int i5 = payment0.getPaymentMethod();
    int i6 = payment0.getPaymentMethod();
    int i7 = payment0.getPaymentMethod();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test37"); }

    Payment payment0 = new Payment();
    double d1 = payment0.getTotalPrice();
    boolean b2 = payment0.isPaid();
    boolean b3 = payment0.isPaid();
    boolean b4 = payment0.isPaid();
    double d5 = payment0.getTotalPrice();
    double d6 = payment0.getTotalPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test38"); }

    Payment payment0 = new Payment();
    double d1 = payment0.getTotalPrice();
    boolean b2 = payment0.isPaid();
    boolean b3 = payment0.isPaid();
    double d4 = payment0.getTotalPrice();
    double d5 = payment0.getTotalPrice();
    int i6 = payment0.getPaymentMethod();
    int i7 = payment0.getPaymentMethod();
    int i8 = payment0.getPaymentMethod();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test39"); }

    Payment payment0 = new Payment();
    double d1 = payment0.getTotalPrice();
    int i2 = payment0.getPaymentMethod();
    int i3 = payment0.getPaymentMethod();
    double d4 = payment0.getTotalPrice();
    boolean b5 = payment0.isPaid();
    double d6 = payment0.getTotalPrice();
    double d7 = payment0.getTotalPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test40"); }

    Payment payment0 = new Payment();
    double d1 = payment0.getTotalPrice();
    double d2 = payment0.getTotalPrice();
    boolean b3 = payment0.isPaid();
    int i4 = payment0.getPaymentMethod();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test41"); }

    Payment payment0 = new Payment();
    double d1 = payment0.getTotalPrice();
    boolean b2 = payment0.isPaid();
    boolean b3 = payment0.isPaid();
    double d4 = payment0.getTotalPrice();
    double d5 = payment0.getTotalPrice();
    int i6 = payment0.getPaymentMethod();
    int i7 = payment0.getPaymentMethod();
    boolean b8 = payment0.isPaid();
    boolean b9 = payment0.isPaid();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test42"); }

    Payment payment0 = new Payment();
    double d1 = payment0.getTotalPrice();
    boolean b2 = payment0.isPaid();
    boolean b3 = payment0.isPaid();
    int i4 = payment0.getPaymentMethod();
    int i5 = payment0.getPaymentMethod();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

}
