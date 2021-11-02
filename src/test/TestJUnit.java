package test;

import businessLogic.calculadoraPrincipal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class TestJUnit {
   @Test
   public void testSetup() {
      String str= "I am done with Junit setup";
      assertEquals("I am done with Junit setup",str);
   }
   
   
   @BeforeClass
   public static void setUpClass() {
   }
   
   @AfterClass
   public static void tearDownClass() {
   }
   
   @Before
   public void setUp() {
   }
   
   @After
   public void tearDown() {
   }

   /**
    * Test of add method, of class Calculadora.
    */
   @Test
   public void testAdd() {
       System.out.println("add");
       float a = 3F;	
       float b = 5F;
       float expResult = 8F;
       float result = calculadoraPrincipal.add(a, b);
       assertEquals(expResult, result, 0.0);
   }

   /**
    * Test of substract method, of class Calculadora.
    */
   @Test
   public void testSubstract() {
       System.out.println("substract");
       float a = 10F;
       float b = 5F;
       float expResult = 5F;
       float result = calculadoraPrincipal.substract(a, b);
       assertEquals(expResult, result, 0.0);
       
   }

   /**
    * Test of multiply method, of class Calculadora.
    */
   @Test
   public void testMultiply() {
       System.out.println("multiply");
       float a = 7F;
       float b = 2F;
       float expResult = 14F;
       float result = calculadoraPrincipal.multiply(a, b);
       assertEquals(expResult, result, 0.0);
       
   }

   /**
    * Test of div method, of class Calculadora.
    */
   @Test
   public void testDiv() {
       System.out.println("div");
       float a = 20F;
       float b = 5F;
       float expResult = 4F;
       float result =calculadoraPrincipal.div(a, b);
       assertEquals(expResult, result, 0.0);
       
   }
   

}