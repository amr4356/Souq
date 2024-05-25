
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }

    Menu menu0 = new Menu();
    menu0.addMenuItem("hi!", (double)1);
    java.util.ArrayList<java.lang.String> arraylist_str4 = menu0.getItemNames();
    java.util.ArrayList<java.lang.String> arraylist_str5 = menu0.getItemNames();
    java.util.ArrayList<java.lang.String> arraylist_str6 = menu0.getItemNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str6);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }

    Menu menu0 = new Menu();
    menu0.addMenuItem("hi!", (double)1);
    java.util.ArrayList<java.lang.String> arraylist_str4 = menu0.getItemNames();
    java.util.ArrayList<java.lang.String> arraylist_str5 = menu0.getItemNames();
    java.util.ArrayList<java.lang.Double> arraylist_d6 = menu0.getPrices();
    int i7 = menu0.getMenuSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }

    Menu menu0 = new Menu();
    menu0.addMenuItem("hi!", (double)1);
    java.util.ArrayList<java.lang.String> arraylist_str4 = menu0.getItemNames();
    int i5 = menu0.getMenuSize();
    java.util.ArrayList<java.lang.Double> arraylist_d6 = menu0.getPrices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d6);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }

    Menu menu0 = new Menu();
    menu0.addMenuItem("hi!", (double)1);
    java.util.ArrayList<java.lang.String> arraylist_str4 = menu0.getItemNames();
    menu0.addMenuItem("hi!", (double)'a');
    int i8 = menu0.getMenuSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }

    Menu menu0 = new Menu();
    menu0.addMenuItem("hi!", (double)1);
    java.util.ArrayList<java.lang.String> arraylist_str4 = menu0.getItemNames();
    menu0.addMenuItem("hi!", (double)'a');
    menu0.addMenuItem("hi!", 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str4);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }

    Menu menu0 = new Menu();
    java.util.ArrayList<java.lang.String> arraylist_str1 = menu0.getItemNames();
    menu0.addMenuItem("", (double)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str1);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }

    Menu menu0 = new Menu();
    menu0.addMenuItem("hi!", (double)1);
    java.util.ArrayList<java.lang.String> arraylist_str4 = menu0.getItemNames();
    java.util.ArrayList<java.lang.String> arraylist_str5 = menu0.getItemNames();
    java.util.ArrayList<java.lang.Double> arraylist_d6 = menu0.getPrices();
    java.util.ArrayList<java.lang.Double> arraylist_d7 = menu0.getPrices();
    java.util.ArrayList<java.lang.String> arraylist_str8 = menu0.getItemNames();
    java.util.ArrayList<java.lang.String> arraylist_str9 = menu0.getItemNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str9);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }

    Menu menu0 = new Menu();
    menu0.addMenuItem("hi!", (double)1);
    java.util.ArrayList<java.lang.String> arraylist_str4 = menu0.getItemNames();
    int i5 = menu0.getMenuSize();
    int i6 = menu0.getMenuSize();
    java.util.ArrayList<java.lang.Double> arraylist_d7 = menu0.getPrices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d7);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }

    Menu menu0 = new Menu();
    menu0.addMenuItem("hi!", (double)1);
    java.util.ArrayList<java.lang.String> arraylist_str4 = menu0.getItemNames();
    java.util.ArrayList<java.lang.String> arraylist_str5 = menu0.getItemNames();
    java.util.ArrayList<java.lang.Double> arraylist_d6 = menu0.getPrices();
    java.util.ArrayList<java.lang.Double> arraylist_d7 = menu0.getPrices();
    menu0.addMenuItem("", 10.0d);
    menu0.addMenuItem("hi!", (double)100.0f);
    int i14 = menu0.getMenuSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 3);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }

    Menu menu0 = new Menu();
    menu0.addMenuItem("hi!", (double)1);
    java.util.ArrayList<java.lang.Double> arraylist_d4 = menu0.getPrices();
    java.util.ArrayList<java.lang.Double> arraylist_d5 = menu0.getPrices();
    java.util.ArrayList<java.lang.Double> arraylist_d6 = menu0.getPrices();
    java.util.ArrayList<java.lang.Double> arraylist_d7 = menu0.getPrices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d7);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }

    Menu menu0 = new Menu();
    java.util.ArrayList<java.lang.String> arraylist_str1 = menu0.getItemNames();
    java.util.ArrayList<java.lang.String> arraylist_str2 = menu0.getItemNames();
    menu0.addMenuItem("hi!", (double)0);
    java.util.ArrayList<java.lang.String> arraylist_str6 = menu0.getItemNames();
    int i7 = menu0.getMenuSize();
    int i8 = menu0.getMenuSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }

    Menu menu0 = new Menu();
    menu0.addMenuItem("", (-1.0d));
    menu0.addMenuItem("", 0.0d);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }

    Menu menu0 = new Menu();
    java.util.ArrayList<java.lang.Double> arraylist_d1 = menu0.getPrices();
    int i2 = menu0.getMenuSize();
    int i3 = menu0.getMenuSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }

    Menu menu0 = new Menu();
    java.util.ArrayList<java.lang.String> arraylist_str1 = menu0.getItemNames();
    java.util.ArrayList<java.lang.String> arraylist_str2 = menu0.getItemNames();
    menu0.addMenuItem("hi!", (double)0);
    java.util.ArrayList<java.lang.String> arraylist_str6 = menu0.getItemNames();
    menu0.addMenuItem("hi!", (double)1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str6);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }

    Menu menu0 = new Menu();
    menu0.addMenuItem("hi!", (double)1);
    java.util.ArrayList<java.lang.Double> arraylist_d4 = menu0.getPrices();
    java.util.ArrayList<java.lang.Double> arraylist_d5 = menu0.getPrices();
    menu0.addMenuItem("", (double)(byte)1);
    java.util.ArrayList<java.lang.Double> arraylist_d9 = menu0.getPrices();
    menu0.addMenuItem("", (double)'4');
    int i13 = menu0.getMenuSize();
    menu0.addMenuItem("", (double)100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 3);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }

    Menu menu0 = new Menu();
    java.util.ArrayList<java.lang.String> arraylist_str1 = menu0.getItemNames();
    java.util.ArrayList<java.lang.String> arraylist_str2 = menu0.getItemNames();
    java.util.ArrayList<java.lang.Double> arraylist_d3 = menu0.getPrices();
    int i4 = menu0.getMenuSize();
    java.util.ArrayList<java.lang.Double> arraylist_d5 = menu0.getPrices();
    java.util.ArrayList<java.lang.Double> arraylist_d6 = menu0.getPrices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d6);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }

    Menu menu0 = new Menu();
    menu0.addMenuItem("hi!", (double)1);
    java.util.ArrayList<java.lang.String> arraylist_str4 = menu0.getItemNames();
    java.util.ArrayList<java.lang.Double> arraylist_d5 = menu0.getPrices();
    int i6 = menu0.getMenuSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }

    Menu menu0 = new Menu();
    int i1 = menu0.getMenuSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }

    Menu menu0 = new Menu();
    menu0.addMenuItem("hi!", (double)1);
    java.util.ArrayList<java.lang.String> arraylist_str4 = menu0.getItemNames();
    java.util.ArrayList<java.lang.String> arraylist_str5 = menu0.getItemNames();
    java.util.ArrayList<java.lang.Double> arraylist_d6 = menu0.getPrices();
    java.util.ArrayList<java.lang.Double> arraylist_d7 = menu0.getPrices();
    menu0.addMenuItem("", (double)0);
    java.util.ArrayList<java.lang.Double> arraylist_d11 = menu0.getPrices();
    menu0.addMenuItem("", (-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d11);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }

    Menu menu0 = new Menu();
    java.util.ArrayList<java.lang.Double> arraylist_d1 = menu0.getPrices();
    menu0.addMenuItem("", (double)(byte)1);
    java.util.ArrayList<java.lang.Double> arraylist_d5 = menu0.getPrices();
    java.util.ArrayList<java.lang.Double> arraylist_d6 = menu0.getPrices();
    menu0.addMenuItem("", (double)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d6);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }

    Menu menu0 = new Menu();
    menu0.addMenuItem("hi!", (double)1);
    java.util.ArrayList<java.lang.String> arraylist_str4 = menu0.getItemNames();
    java.util.ArrayList<java.lang.String> arraylist_str5 = menu0.getItemNames();
    java.util.ArrayList<java.lang.Double> arraylist_d6 = menu0.getPrices();
    java.util.ArrayList<java.lang.Double> arraylist_d7 = menu0.getPrices();
    menu0.addMenuItem("", (double)0);
    java.util.ArrayList<java.lang.Double> arraylist_d11 = menu0.getPrices();
    java.util.ArrayList<java.lang.Double> arraylist_d12 = menu0.getPrices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d12);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }

    Menu menu0 = new Menu();
    menu0.addMenuItem("hi!", (double)1);
    java.util.ArrayList<java.lang.Double> arraylist_d4 = menu0.getPrices();
    menu0.addMenuItem("", (double)1.0f);
    java.util.ArrayList<java.lang.String> arraylist_str8 = menu0.getItemNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str8);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }

    Menu menu0 = new Menu();
    menu0.addMenuItem("hi!", (double)1);
    int i4 = menu0.getMenuSize();
    int i5 = menu0.getMenuSize();
    java.util.ArrayList<java.lang.Double> arraylist_d6 = menu0.getPrices();
    java.util.ArrayList<java.lang.Double> arraylist_d7 = menu0.getPrices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d7);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }

    Menu menu0 = new Menu();
    menu0.addMenuItem("hi!", (double)1);
    int i4 = menu0.getMenuSize();
    int i5 = menu0.getMenuSize();
    int i6 = menu0.getMenuSize();
    java.util.ArrayList<java.lang.Double> arraylist_d7 = menu0.getPrices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d7);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }

    Menu menu0 = new Menu();
    menu0.addMenuItem("hi!", (double)1);
    java.util.ArrayList<java.lang.String> arraylist_str4 = menu0.getItemNames();
    java.util.ArrayList<java.lang.Double> arraylist_d5 = menu0.getPrices();
    menu0.addMenuItem("hi!", (double)(byte)100);
    java.util.ArrayList<java.lang.String> arraylist_str9 = menu0.getItemNames();
    java.util.ArrayList<java.lang.String> arraylist_str10 = menu0.getItemNames();
    java.util.ArrayList<java.lang.String> arraylist_str11 = menu0.getItemNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str11);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }

    Menu menu0 = new Menu();
    java.util.ArrayList<java.lang.Double> arraylist_d1 = menu0.getPrices();
    menu0.addMenuItem("", (double)(byte)1);
    int i5 = menu0.getMenuSize();
    int i6 = menu0.getMenuSize();
    java.util.ArrayList<java.lang.Double> arraylist_d7 = menu0.getPrices();
    java.util.ArrayList<java.lang.String> arraylist_str8 = menu0.getItemNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str8);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }

    Menu menu0 = new Menu();
    java.util.ArrayList<java.lang.String> arraylist_str1 = menu0.getItemNames();
    java.util.ArrayList<java.lang.String> arraylist_str2 = menu0.getItemNames();
    java.util.ArrayList<java.lang.Double> arraylist_d3 = menu0.getPrices();
    int i4 = menu0.getMenuSize();
    menu0.addMenuItem("hi!", (double)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }

    Menu menu0 = new Menu();
    menu0.addMenuItem("hi!", (double)1);
    java.util.ArrayList<java.lang.Double> arraylist_d4 = menu0.getPrices();
    java.util.ArrayList<java.lang.Double> arraylist_d5 = menu0.getPrices();
    int i6 = menu0.getMenuSize();
    java.util.ArrayList<java.lang.Double> arraylist_d7 = menu0.getPrices();
    java.util.ArrayList<java.lang.String> arraylist_str8 = menu0.getItemNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str8);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }

    Menu menu0 = new Menu();
    menu0.addMenuItem("hi!", (double)1);
    java.util.ArrayList<java.lang.String> arraylist_str4 = menu0.getItemNames();
    java.util.ArrayList<java.lang.String> arraylist_str5 = menu0.getItemNames();
    java.util.ArrayList<java.lang.Double> arraylist_d6 = menu0.getPrices();
    java.util.ArrayList<java.lang.Double> arraylist_d7 = menu0.getPrices();
    menu0.addMenuItem("", 10.0d);
    menu0.addMenuItem("hi!", (double)100.0f);
    menu0.addMenuItem("", (double)(byte)10);
    java.util.ArrayList<java.lang.String> arraylist_str17 = menu0.getItemNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str17);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }

    Menu menu0 = new Menu();
    menu0.addMenuItem("hi!", (double)1);
    java.util.ArrayList<java.lang.String> arraylist_str4 = menu0.getItemNames();
    java.util.ArrayList<java.lang.Double> arraylist_d5 = menu0.getPrices();
    java.util.ArrayList<java.lang.String> arraylist_str6 = menu0.getItemNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str6);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }

    Menu menu0 = new Menu();
    java.util.ArrayList<java.lang.String> arraylist_str1 = menu0.getItemNames();
    java.util.ArrayList<java.lang.String> arraylist_str2 = menu0.getItemNames();
    java.util.ArrayList<java.lang.String> arraylist_str3 = menu0.getItemNames();
    int i4 = menu0.getMenuSize();
    java.util.ArrayList<java.lang.Double> arraylist_d5 = menu0.getPrices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d5);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test32"); }

    Menu menu0 = new Menu();
    menu0.addMenuItem("hi!", (double)1);
    java.util.ArrayList<java.lang.String> arraylist_str4 = menu0.getItemNames();
    int i5 = menu0.getMenuSize();
    java.util.ArrayList<java.lang.String> arraylist_str6 = menu0.getItemNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str6);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }

    Menu menu0 = new Menu();
    menu0.addMenuItem("hi!", (double)1);
    java.util.ArrayList<java.lang.String> arraylist_str4 = menu0.getItemNames();
    java.util.ArrayList<java.lang.String> arraylist_str5 = menu0.getItemNames();
    java.util.ArrayList<java.lang.Double> arraylist_d6 = menu0.getPrices();
    java.util.ArrayList<java.lang.Double> arraylist_d7 = menu0.getPrices();
    java.util.ArrayList<java.lang.String> arraylist_str8 = menu0.getItemNames();
    int i9 = menu0.getMenuSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test34"); }

    Menu menu0 = new Menu();
    menu0.addMenuItem("hi!", (double)1);
    java.util.ArrayList<java.lang.String> arraylist_str4 = menu0.getItemNames();
    java.util.ArrayList<java.lang.Double> arraylist_d5 = menu0.getPrices();
    menu0.addMenuItem("hi!", (double)(byte)100);
    java.util.ArrayList<java.lang.String> arraylist_str9 = menu0.getItemNames();
    java.util.ArrayList<java.lang.String> arraylist_str10 = menu0.getItemNames();
    menu0.addMenuItem("hi!", (double)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str10);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test35"); }

    Menu menu0 = new Menu();
    menu0.addMenuItem("hi!", (double)1);
    java.util.ArrayList<java.lang.Double> arraylist_d4 = menu0.getPrices();
    menu0.addMenuItem("hi!", (double)(byte)-1);
    java.util.ArrayList<java.lang.String> arraylist_str8 = menu0.getItemNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str8);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test36"); }

    Menu menu0 = new Menu();
    menu0.addMenuItem("hi!", (double)1);
    int i4 = menu0.getMenuSize();
    int i5 = menu0.getMenuSize();
    java.util.ArrayList<java.lang.Double> arraylist_d6 = menu0.getPrices();
    int i7 = menu0.getMenuSize();
    java.util.ArrayList<java.lang.Double> arraylist_d8 = menu0.getPrices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d8);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test37"); }

    Menu menu0 = new Menu();
    menu0.addMenuItem("hi!", (double)1);
    java.util.ArrayList<java.lang.Double> arraylist_d4 = menu0.getPrices();
    java.util.ArrayList<java.lang.String> arraylist_str5 = menu0.getItemNames();
    int i6 = menu0.getMenuSize();
    int i7 = menu0.getMenuSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test38"); }

    Menu menu0 = new Menu();
    menu0.addMenuItem("hi!", (double)1);
    java.util.ArrayList<java.lang.Double> arraylist_d4 = menu0.getPrices();
    java.util.ArrayList<java.lang.String> arraylist_str5 = menu0.getItemNames();
    int i6 = menu0.getMenuSize();
    java.util.ArrayList<java.lang.String> arraylist_str7 = menu0.getItemNames();
    java.util.ArrayList<java.lang.String> arraylist_str8 = menu0.getItemNames();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str8);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test39"); }

    Menu menu0 = new Menu();
    menu0.addMenuItem("hi!", (double)1);
    java.util.ArrayList<java.lang.String> arraylist_str4 = menu0.getItemNames();
    java.util.ArrayList<java.lang.Double> arraylist_d5 = menu0.getPrices();
    menu0.addMenuItem("", (double)0L);
    menu0.addMenuItem("", (double)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d5);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test40"); }

    Menu menu0 = new Menu();
    java.util.ArrayList<java.lang.String> arraylist_str1 = menu0.getItemNames();
    int i2 = menu0.getMenuSize();
    java.util.ArrayList<java.lang.Double> arraylist_d3 = menu0.getPrices();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_d3);

  }

}
