
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }

    FoodOrder foodOrder0 = new FoodOrder();
    double d1 = foodOrder0.getTotalPrice();
    double d2 = foodOrder0.getTotalPrice();
    double d3 = foodOrder0.getTotalPrice();
    int i4 = foodOrder0.getOrderSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }

    FoodOrder foodOrder0 = new FoodOrder();
    int i1 = foodOrder0.getOrderSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }

    FoodOrder foodOrder0 = new FoodOrder();
    double d1 = foodOrder0.getTotalPrice();
    foodOrder0.addItemToOrder("", (double)(byte)1);
    double d5 = foodOrder0.getTotalPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 1.0d);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }

    FoodOrder foodOrder0 = new FoodOrder();
    foodOrder0.addItemToOrder("hi!", (double)1);
    int i5 = foodOrder0.getItemQuantity("hi!");
    int i6 = foodOrder0.getOrderSize();
    int i7 = foodOrder0.getOrderSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }

    FoodOrder foodOrder0 = new FoodOrder();
    foodOrder0.addItemToOrder("hi!", (double)1);
    double d4 = foodOrder0.getTotalPrice();
    foodOrder0.addItemToOrder("hi!", (-1.0d));
    double d8 = foodOrder0.getTotalPrice();
    foodOrder0.addItemToOrder("", (double)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }

    FoodOrder foodOrder0 = new FoodOrder();
    foodOrder0.addItemToOrder("hi!", (double)1);
    int i5 = foodOrder0.getItemQuantity("hi!");
    int i6 = foodOrder0.getOrderSize();
    double d7 = foodOrder0.getTotalPrice();
    double d8 = foodOrder0.getTotalPrice();
    int i9 = foodOrder0.getOrderSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }

    FoodOrder foodOrder0 = new FoodOrder();
    foodOrder0.addItemToOrder("hi!", (double)1);
    int i5 = foodOrder0.getItemQuantity("hi!");
    int i6 = foodOrder0.getOrderSize();
    foodOrder0.addItemToOrder("hi!", (double)0.0f);
    int i11 = foodOrder0.getItemQuantity("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 2);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }

    FoodOrder foodOrder0 = new FoodOrder();
    foodOrder0.addItemToOrder("hi!", (double)1);
    int i4 = foodOrder0.getOrderSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }

    FoodOrder foodOrder0 = new FoodOrder();
    foodOrder0.addItemToOrder("hi!", (double)1);
    double d4 = foodOrder0.getTotalPrice();
    foodOrder0.addItemToOrder("", (-1.0d));
    foodOrder0.addItemToOrder("hi!", (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 1.0d);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }

    FoodOrder foodOrder0 = new FoodOrder();
    foodOrder0.addItemToOrder("hi!", (double)1);
    int i5 = foodOrder0.getItemQuantity("hi!");
    int i7 = foodOrder0.getItemQuantity("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }

    FoodOrder foodOrder0 = new FoodOrder();
    double d1 = foodOrder0.getTotalPrice();
    foodOrder0.addItemToOrder("", (double)(byte)1);
    foodOrder0.addItemToOrder("", (double)(byte)1);
    double d8 = foodOrder0.getTotalPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 2.0d);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }

    FoodOrder foodOrder0 = new FoodOrder();
    int i2 = foodOrder0.getItemQuantity("");
    foodOrder0.addItemToOrder("hi!", (double)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }

    FoodOrder foodOrder0 = new FoodOrder();
    double d1 = foodOrder0.getTotalPrice();
    double d2 = foodOrder0.getTotalPrice();
    double d3 = foodOrder0.getTotalPrice();
    double d4 = foodOrder0.getTotalPrice();
    int i5 = foodOrder0.getOrderSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }

    FoodOrder foodOrder0 = new FoodOrder();
    foodOrder0.addItemToOrder("hi!", (double)1);
    int i5 = foodOrder0.getItemQuantity("hi!");
    int i6 = foodOrder0.getOrderSize();
    double d7 = foodOrder0.getTotalPrice();
    double d8 = foodOrder0.getTotalPrice();
    double d9 = foodOrder0.getTotalPrice();
    double d10 = foodOrder0.getTotalPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 1.0d);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }

    FoodOrder foodOrder0 = new FoodOrder();
    double d1 = foodOrder0.getTotalPrice();
    double d2 = foodOrder0.getTotalPrice();
    double d3 = foodOrder0.getTotalPrice();
    double d4 = foodOrder0.getTotalPrice();
    double d5 = foodOrder0.getTotalPrice();
    int i6 = foodOrder0.getOrderSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }

    FoodOrder foodOrder0 = new FoodOrder();
    foodOrder0.addItemToOrder("hi!", (double)1);
    double d4 = foodOrder0.getTotalPrice();
    foodOrder0.addItemToOrder("", (-1.0d));
    int i9 = foodOrder0.getItemQuantity("hi!");
    foodOrder0.addItemToOrder("", (double)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }

    FoodOrder foodOrder0 = new FoodOrder();
    foodOrder0.addItemToOrder("hi!", (double)1);
    int i5 = foodOrder0.getItemQuantity("hi!");
    int i6 = foodOrder0.getOrderSize();
    foodOrder0.addItemToOrder("hi!", (double)0.0f);
    foodOrder0.addItemToOrder("hi!", (double)10.0f);
    int i13 = foodOrder0.getOrderSize();
    foodOrder0.addItemToOrder("hi!", (double)0);
    foodOrder0.addItemToOrder("hi!", (double)(short)100);
    int i21 = foodOrder0.getItemQuantity("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 5);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }

    FoodOrder foodOrder0 = new FoodOrder();
    foodOrder0.addItemToOrder("hi!", (double)1);
    int i5 = foodOrder0.getItemQuantity("hi!");
    int i6 = foodOrder0.getOrderSize();
    foodOrder0.addItemToOrder("hi!", (double)0.0f);
    foodOrder0.addItemToOrder("hi!", (double)10.0f);
    int i13 = foodOrder0.getOrderSize();
    foodOrder0.addItemToOrder("hi!", (double)0);
    foodOrder0.addItemToOrder("", (double)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }

    FoodOrder foodOrder0 = new FoodOrder();
    double d1 = foodOrder0.getTotalPrice();
    foodOrder0.addItemToOrder("", (double)3);
    foodOrder0.addItemToOrder("hi!", 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }

    FoodOrder foodOrder0 = new FoodOrder();
    double d1 = foodOrder0.getTotalPrice();
    foodOrder0.addItemToOrder("", (double)(byte)1);
    foodOrder0.addItemToOrder("", (double)(byte)1);
    foodOrder0.addItemToOrder("", (double)100);
    foodOrder0.addItemToOrder("hi!", (double)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }

    FoodOrder foodOrder0 = new FoodOrder();
    foodOrder0.addItemToOrder("hi!", (double)1);
    foodOrder0.addItemToOrder("hi!", (double)(byte)100);
    foodOrder0.addItemToOrder("", (double)(byte)0);
    int i10 = foodOrder0.getOrderSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 3);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }

    FoodOrder foodOrder0 = new FoodOrder();
    foodOrder0.addItemToOrder("hi!", (double)1);
    double d4 = foodOrder0.getTotalPrice();
    foodOrder0.addItemToOrder("hi!", (-1.0d));
    foodOrder0.addItemToOrder("hi!", (double)'a');
    double d11 = foodOrder0.getTotalPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 97.0d);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }

    FoodOrder foodOrder0 = new FoodOrder();
    double d1 = foodOrder0.getTotalPrice();
    foodOrder0.addItemToOrder("", (double)(byte)1);
    int i6 = foodOrder0.getItemQuantity("");
    foodOrder0.addItemToOrder("", (double)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }

    FoodOrder foodOrder0 = new FoodOrder();
    double d1 = foodOrder0.getTotalPrice();
    foodOrder0.addItemToOrder("", (double)3);
    int i5 = foodOrder0.getOrderSize();
    int i7 = foodOrder0.getItemQuantity("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }

    FoodOrder foodOrder0 = new FoodOrder();
    foodOrder0.addItemToOrder("hi!", (double)1);
    int i5 = foodOrder0.getItemQuantity("hi!");
    int i6 = foodOrder0.getOrderSize();
    foodOrder0.addItemToOrder("hi!", (double)0.0f);
    int i10 = foodOrder0.getOrderSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }

    FoodOrder foodOrder0 = new FoodOrder();
    double d1 = foodOrder0.getTotalPrice();
    foodOrder0.addItemToOrder("", (double)(byte)1);
    int i6 = foodOrder0.getItemQuantity("");
    int i8 = foodOrder0.getItemQuantity("hi!");
    double d9 = foodOrder0.getTotalPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 1.0d);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }

    FoodOrder foodOrder0 = new FoodOrder();
    foodOrder0.addItemToOrder("hi!", (double)1);
    double d4 = foodOrder0.getTotalPrice();
    foodOrder0.addItemToOrder("hi!", (-1.0d));
    double d8 = foodOrder0.getTotalPrice();
    int i10 = foodOrder0.getItemQuantity("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }

    FoodOrder foodOrder0 = new FoodOrder();
    foodOrder0.addItemToOrder("hi!", (double)1);
    foodOrder0.addItemToOrder("hi!", (double)100.0f);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }

    FoodOrder foodOrder0 = new FoodOrder();
    double d1 = foodOrder0.getTotalPrice();
    foodOrder0.addItemToOrder("", (double)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }

    FoodOrder foodOrder0 = new FoodOrder();
    double d1 = foodOrder0.getTotalPrice();
    foodOrder0.addItemToOrder("", (double)(byte)1);
    foodOrder0.addItemToOrder("", (double)(byte)1);
    foodOrder0.addItemToOrder("", (double)100);
    double d11 = foodOrder0.getTotalPrice();
    double d12 = foodOrder0.getTotalPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 102.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 102.0d);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }

    FoodOrder foodOrder0 = new FoodOrder();
    foodOrder0.addItemToOrder("hi!", (double)1);
    double d4 = foodOrder0.getTotalPrice();
    foodOrder0.addItemToOrder("hi!", (-1.0d));
    double d8 = foodOrder0.getTotalPrice();
    double d9 = foodOrder0.getTotalPrice();
    int i10 = foodOrder0.getOrderSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test32"); }

    FoodOrder foodOrder0 = new FoodOrder();
    double d1 = foodOrder0.getTotalPrice();
    foodOrder0.addItemToOrder("", (double)(byte)1);
    int i6 = foodOrder0.getItemQuantity("");
    double d7 = foodOrder0.getTotalPrice();
    int i8 = foodOrder0.getOrderSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }

    FoodOrder foodOrder0 = new FoodOrder();
    double d1 = foodOrder0.getTotalPrice();
    double d2 = foodOrder0.getTotalPrice();
    int i4 = foodOrder0.getItemQuantity("");
    double d5 = foodOrder0.getTotalPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test34"); }

    FoodOrder foodOrder0 = new FoodOrder();
    foodOrder0.addItemToOrder("hi!", (double)1);
    double d4 = foodOrder0.getTotalPrice();
    int i5 = foodOrder0.getOrderSize();
    double d6 = foodOrder0.getTotalPrice();
    foodOrder0.addItemToOrder("hi!", (-1.0d));
    double d10 = foodOrder0.getTotalPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test35"); }

    FoodOrder foodOrder0 = new FoodOrder();
    double d1 = foodOrder0.getTotalPrice();
    foodOrder0.addItemToOrder("", (double)(byte)1);
    int i5 = foodOrder0.getOrderSize();
    foodOrder0.addItemToOrder("hi!", (double)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test36"); }

    FoodOrder foodOrder0 = new FoodOrder();
    foodOrder0.addItemToOrder("hi!", (double)1);
    int i5 = foodOrder0.getItemQuantity("hi!");
    int i6 = foodOrder0.getOrderSize();
    foodOrder0.addItemToOrder("hi!", (double)0.0f);
    foodOrder0.addItemToOrder("hi!", (double)10.0f);
    double d13 = foodOrder0.getTotalPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 11.0d);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test37"); }

    FoodOrder foodOrder0 = new FoodOrder();
    double d1 = foodOrder0.getTotalPrice();
    double d2 = foodOrder0.getTotalPrice();
    double d3 = foodOrder0.getTotalPrice();
    double d4 = foodOrder0.getTotalPrice();
    double d5 = foodOrder0.getTotalPrice();
    double d6 = foodOrder0.getTotalPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test38"); }

    FoodOrder foodOrder0 = new FoodOrder();
    double d1 = foodOrder0.getTotalPrice();
    foodOrder0.addItemToOrder("", (double)(byte)1);
    foodOrder0.addItemToOrder("", (double)(byte)1);
    foodOrder0.addItemToOrder("", (double)100);
    foodOrder0.addItemToOrder("", 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test39"); }

    FoodOrder foodOrder0 = new FoodOrder();
    foodOrder0.addItemToOrder("hi!", (double)1);
    double d4 = foodOrder0.getTotalPrice();
    foodOrder0.addItemToOrder("hi!", (-1.0d));
    foodOrder0.addItemToOrder("hi!", (double)'a');
    int i12 = foodOrder0.getItemQuantity("");
    int i13 = foodOrder0.getOrderSize();
    int i14 = foodOrder0.getOrderSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test40"); }

    FoodOrder foodOrder0 = new FoodOrder();
    foodOrder0.addItemToOrder("hi!", (double)1);
    int i5 = foodOrder0.getItemQuantity("hi!");
    int i6 = foodOrder0.getOrderSize();
    double d7 = foodOrder0.getTotalPrice();
    double d8 = foodOrder0.getTotalPrice();
    double d9 = foodOrder0.getTotalPrice();
    int i11 = foodOrder0.getItemQuantity("");
    int i13 = foodOrder0.getItemQuantity("");
    int i15 = foodOrder0.getItemQuantity("");
    double d16 = foodOrder0.getTotalPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 1.0d);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test41"); }

    FoodOrder foodOrder0 = new FoodOrder();
    foodOrder0.addItemToOrder("hi!", (double)1);
    double d4 = foodOrder0.getTotalPrice();
    int i5 = foodOrder0.getOrderSize();
    int i7 = foodOrder0.getItemQuantity("hi!");
    int i9 = foodOrder0.getItemQuantity("");
    int i11 = foodOrder0.getItemQuantity("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test42"); }

    FoodOrder foodOrder0 = new FoodOrder();
    foodOrder0.addItemToOrder("hi!", (double)1);
    double d4 = foodOrder0.getTotalPrice();
    int i5 = foodOrder0.getOrderSize();
    int i7 = foodOrder0.getItemQuantity("hi!");
    int i9 = foodOrder0.getItemQuantity("");
    int i10 = foodOrder0.getOrderSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test43"); }

    FoodOrder foodOrder0 = new FoodOrder();
    double d1 = foodOrder0.getTotalPrice();
    foodOrder0.addItemToOrder("", (double)(byte)1);
    int i6 = foodOrder0.getItemQuantity("hi!");
    int i7 = foodOrder0.getOrderSize();
    foodOrder0.addItemToOrder("", (double)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test44"); }

    FoodOrder foodOrder0 = new FoodOrder();
    foodOrder0.addItemToOrder("hi!", (double)1);
    int i5 = foodOrder0.getItemQuantity("hi!");
    int i6 = foodOrder0.getOrderSize();
    double d7 = foodOrder0.getTotalPrice();
    double d8 = foodOrder0.getTotalPrice();
    double d9 = foodOrder0.getTotalPrice();
    int i11 = foodOrder0.getItemQuantity("");
    int i13 = foodOrder0.getItemQuantity("");
    foodOrder0.addItemToOrder("hi!", (double)0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test45"); }

    FoodOrder foodOrder0 = new FoodOrder();
    foodOrder0.addItemToOrder("hi!", (double)1);
    double d4 = foodOrder0.getTotalPrice();
    double d5 = foodOrder0.getTotalPrice();
    double d6 = foodOrder0.getTotalPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 1.0d);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test46"); }

    FoodOrder foodOrder0 = new FoodOrder();
    double d1 = foodOrder0.getTotalPrice();
    foodOrder0.addItemToOrder("", (double)(byte)1);
    int i6 = foodOrder0.getItemQuantity("");
    int i7 = foodOrder0.getOrderSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d1 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test47"); }

    FoodOrder foodOrder0 = new FoodOrder();
    foodOrder0.addItemToOrder("hi!", (double)1);
    foodOrder0.addItemToOrder("hi!", (double)(byte)100);
    double d7 = foodOrder0.getTotalPrice();
    int i9 = foodOrder0.getItemQuantity("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 101.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 2);

  }

}
