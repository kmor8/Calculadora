package test;

import businessLogic.calculadoraPrincipal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
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

   
   // Test Add
   /**
    * Test of add method, of class Calculadora.
    */
   @Test
   public void testAdd1() {

       float a = 3F;	
       float b = 5F;
       float expResult = 8F;
       float result = calculadoraPrincipal.add(a, b);
       assertEquals(expResult, result, 0.0);
   }
   
   @Test
   public void testAdd2()
   {
	// System.out.println("CP01");
       float a = 2F;
       float b = 5F;
       float expResult = 7F;
       float result = calculadoraPrincipal.add(a, b);
       assertEquals(expResult, result, 0.0);
   }
   
   @Test
   public void testAdd3()
   {
	  // System.out.println("CP02");
       float a = 2F;
       float b = 0F;
       float expResult = 2F;
       float result = calculadoraPrincipal.add(a, b);
       assertEquals(expResult, result, 0.0);
   }
   
   @Test
   public void testAdd4()
   {
	  // System.out.println("CP03");
       float a = 2F;
       float b = -2F;
       float expResult = 0F;
       float result = calculadoraPrincipal.add(a, b);
       assertEquals(expResult, result, 0.0);
   }
   
   @Test
   public void testAdd5() {
       
        float a = -3F;
        float b = -5F;
        float expResult = 5F;
        float result = calculadoraPrincipal.add(a, b);
        assertNotEquals(expResult, result, 0.0);
 
   }
   // Test Substract
   /**
    * Test of substract method, of class Calculadora.
    */
   @Test
   public void testSubstract1() {
       //System.out.println("substract");
       float a = 10F;
       float b = 5F;
       float expResult = 5F;
       float result = calculadoraPrincipal.substract(a, b);
       assertEquals(expResult, result, 0.0);
       
   }
   
   @Test
   public void testSubstract2() {
     //  System.out.println("CP04");
       float a = 3F;
       float b = 2F;
       float expResult = 1F;
       float result = calculadoraPrincipal.substract(a, b);
       assertEquals(expResult, result, 0.0);
       
   }
   
   @Test
   public void testSubstract3() {
    //   System.out.println("CP05");
       float a = 3F;
       float b = 3F;
       float expResult = 0F;
       float result = calculadoraPrincipal.substract(a, b);
       assertEquals(expResult, result, 0.0);
       
   }
   
   @Test
   public void testSubstract4() {
      // System.out.println("CP06");
       float a = 3F;
       float b = -3F;
       float expResult = 6F;
       float result = calculadoraPrincipal.substract(a, b);
       assertEquals(expResult, result, 0.0);
   }
   
   @Test
   public void testSubstract5(){
       float a=60;
       float b=41;
       float expResult = 19;
       float result = calculadoraPrincipal.substract(a,b);
       assertEquals(expResult,result,0.0);
   }
   
   
   // Test Multiply
   /**
    * Test of multiply method, of class Calculadora.
    */
   @Test
   public void testMultiply1() {
      // System.out.println("multiply");
       float a = 7F;
       float b = 2F;
       float expResult = 14F;
       float result = calculadoraPrincipal.multiply(a, b);
       assertEquals(expResult, result, 0.0);
       
   }
   
   @Test
   public void testMultiply2() {
     //  System.out.println("CP07");
       float a = 3F;
       float b = 3F;
       float expResult = 9F;
       float result = calculadoraPrincipal.multiply(a, b);
       assertEquals(expResult, result, 0.0);
       
   }
  
   @Test
   public void testMultiply3() {
     //  System.out.println("CP08");
       float a = 3F;
       float b = 0F;
       float expResult = 0F;
       float result = calculadoraPrincipal.multiply(a, b);
       assertEquals(expResult, result, 0.0);
       
   }
   
   @Test
   public void testMultiply4() {
    //   System.out.println("CP09");
       float a = 3F;
       float b = -3F;
       float expResult = -9F;
       float result = calculadoraPrincipal.multiply(a, b);
       assertEquals(expResult, result, 0.0);
       
   }
   
   @Test
   public void testMultiply5(){
       float a=60;
       float b=-41;
       float expResult = -2460;
       float result = calculadoraPrincipal.multiply(a,b);
       assertEquals(expResult,result,0.0);
   }
   // Test Div
   /**
    * Test of div method, of class Calculadora.
    */
   
   @Test
   public void testDiv1() {
      // System.out.println("div");
       float a = 20F;
       float b = 5F;
       float expResult = 4F;
       float result =calculadoraPrincipal.div(a, b);
       assertEquals(expResult, result, 0.0);
       
   }		
   
   @Test
   public void testDiv2() {
      // System.out.println("CP10");
       float a = 8F;
       float b = 2F;
       float expResult = 4F;
       float result =calculadoraPrincipal.div(a, b);
       assertEquals(expResult, result, 0.0);
       
   }
   
   @Test
   public void testDiv3() {
	 
      // System.out.println("CP11");
       float a = 5F;
       float b = 0F;
       
       try
       {
    	   float result =calculadoraPrincipal.div(a, b);
    	  
       }catch(ArithmeticException ex)
       {
    	   assertEquals(ex,5/0);
       }
       
   }
   
   @Test
   public void testDiv4(){
       float a=60;
       float b=12;
       float expResult = 5;
       float result = calculadoraPrincipal.div(a,b);
       assertEquals(expResult,result,0.0);
   }
   
   @Test
   public void testDiv5(){
       float a=32;
       float b=8;
       float expResult = 4;
       float result = calculadoraPrincipal.div(a,b);
       assertEquals(expResult,result,0.0);
   }
   
   // Test Mod
   @Test
   public void testMod1()
   {
       float a = 2F;
       float b = 10F;
       float expResult = 2F;
       float result = calculadoraPrincipal.mod(a, b);
       assertEquals(expResult, result, 0.0);
   }
   
   
   @Test
   public void testMod2() {
       float a = 0F;
       float b = 0F;
       
       try
       {
           float result = calculadoraPrincipal.mod(a, b);
       }catch(ArithmeticException ex)
       {
    	   assertEquals(ex,0/0);
       }

   
   }
   
   
   @Test
   public void testMod3() {
       float a = 3F;
       float b = 3F;
       float expResult = 0F;
       float result = calculadoraPrincipal.mod(a, b);
       assertEquals(expResult, result, 0.0);
      
   }
   
   @Test
   public void testMod4() {
       float a = 55F;
       float b = 3F;
       float expResult = 1F;
       float result = calculadoraPrincipal.mod(a, b);
       assertEquals(expResult, result, 0.0);
 
   }
   
   @Test
   public void testMod5() {
       float a = 1234567F;
       float b = 555F;
       float expResult = 247F;
       float result = calculadoraPrincipal.mod(a, b);
       assertEquals(expResult, result, 0.0);
 
   }
   
   // Test tenPow
   
   @Test
   public void testTenPow1() {
       float b = 3F;
       float expResult = 1000F;
       float result = calculadoraPrincipal.tenPow(b);
       assertEquals(expResult, result, 0.0);
 
   }
    @Test
   public void testTenPow2() {
       float b = 6F;
       float expResult = 1000000F;
       float result = calculadoraPrincipal.tenPow(b);
       assertEquals(expResult, result, 0.0);
 
   }
    @Test
   public void testTenPow3() {
       float b = 10F;
       float expResult = 25F;
       float result = calculadoraPrincipal.tenPow(b);
       assertNotEquals(expResult, result, 0.0);
 
   }
   
    @Test
    public void testTenPow4() {
        float b = 4F;
        float expResult = 10000F;
        float result = calculadoraPrincipal.tenPow(b);
        assertEquals(expResult, result, 0.0);
  
    }
   
    @Test
    public void testTenPow5(){
        float b=-2;
        float expResult = 0.01F;
        float result = calculadoraPrincipal.tenPow(b);
        assertEquals(expResult,result,0.0);
    }
   // Test sqrt
   @Test
   public void testSqrt1(){
       float a=81;
       float expResult=9;
       float result = calculadoraPrincipal.sqrt(a);
       assertEquals(expResult,result,0.0);
   }
   
   @Test
   public void testSqrt2(){
       float a=16;
       float expResult=4;
       float result = calculadoraPrincipal.sqrt(a);
       assertEquals(expResult,result,0.0);
   }
   
   
   @Test
   public void testSqrt3(){
       float a=100;
       float expResult=10;
       float result = calculadoraPrincipal.sqrt(a);
       assertEquals(expResult,result,0.0);
   }
   
   @Test
   public void testSqrt4(){
       float a=121;
       float expResult=11;
       float result = calculadoraPrincipal.sqrt(a);
       assertEquals(expResult,result,0.0);
   }
   
   @Test
   public void testSqrt5(){
       float a=169;
       float expResult=13;
       float result = calculadoraPrincipal.sqrt(a);
       assertEquals(expResult,result,0.0);
   }
   
   // Test nFact
   @Test
   public void testFact1() {
       float b = 5F;
       float expResult = 120F;
       float result = calculadoraPrincipal.nFact(b);
       assertEquals(expResult, result, 0.0);
 
   }
      @Test
   public void testFact2() {
       float b = 6F;
       float expResult = 120F;
       float result = calculadoraPrincipal.nFact(b);
       assertNotEquals(expResult, result, 0.0);
 
   }
      
      @Test
      public void testFact3() {
          float b = 6F;
          float expResult = 720F;
          float result = calculadoraPrincipal.nFact(b);
          assertEquals(expResult, result, 0.0);
    
      }
    
      @Test
      public void testFact4() {
          float b = 3F;
          float expResult = 6F;
          float result = calculadoraPrincipal.nFact(b);
          assertEquals(expResult, result, 0.0);
    
      }
      
      
      @Test
      public void testFact5() {
          float b = 0F;
          float expResult = 1F;
          float result = calculadoraPrincipal.nFact(b);
          assertEquals(expResult, result, 0.0);
      }
      
   // Test Log
      @Test
      public void testLog1(){
          float a=4;
          float b=400;
          float expResult=4.3F;
          float result = calculadoraPrincipal.log(a,b);
          result = BigDecimal.valueOf(result).setScale(1,BigDecimal.ROUND_HALF_DOWN).floatValue();
          assertEquals(expResult,result,0.0);
      }
   
   @Test
   public void testLog2(){
       float a=2;
       float b=16;
       float expResult=4;
       float result = calculadoraPrincipal.log(a,b);
       assertEquals(expResult,result,0.0);
   }
   
   @Test
   public void testLog3(){
       float a=10;
       float b=10;
       float expResult=1;
       float result = calculadoraPrincipal.log(a,b);
       assertEquals(expResult,result,0.0);
   }
   
   @Test
   public void testLog4(){
       float a=0;
       float b=1;
       float expResult=0;
       float result = calculadoraPrincipal.log(a,b);
       assertEquals(expResult,result,0.0);
   }
   
   @Test
   public void testLog5(){
       float a=3;
       float b=81;
       float expResult=4;
       float result = calculadoraPrincipal.log(a,b);
       assertEquals(expResult,result,0.0);
   }


}