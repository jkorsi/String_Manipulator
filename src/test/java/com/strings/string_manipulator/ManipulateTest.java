package com.strings.string_manipulator;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juho Suni
 */
public class ManipulateTest {
    
    public ManipulateTest() {
    }
    /**
     * Test of manipulator method, of class Manipulate.
     */
    @org.junit.Test
    public void testManipulator() {    
        System.out.println("manipulator");
        testString("testisyöte", "TeStIsYöTe");   
        testString(null, null);        
        testString("num 5 on pariton", "NuM o On PaRiToN");        
        testString("! merkillinen jono", "! MeRkIlLiNeN jOnO");       
        testString("num 4 on parillinen", "NuM e On PaRiLlInEn");
    }
    
    /**
     * Method to test if strings in a parameter are equal
     * @param a
     * @param b 
     */
    private void testString(String a, String b) {
        String strA = a;
        String expResultA = b;
        String resultA = Manipulate.manipulator(strA);
        assertEquals(expResultA, resultA);
    }

    /**
     * Test of getUpOrLow method, of class Manipulate.
     */
    @Test
    public void testGetUpOrLow() {
        System.out.println("getUpOrLow");
        char ch = ' ';
        int letterCount = 0;
        char expResult = ' ';
        char result = Manipulate.getUpOrLow(ch, letterCount);
        assertEquals(expResult, result);       
    }

    /**
     * Test of isOdd method, of class Manipulate.
     */
    @Test
    public void testIsOdd() {       
        System.out.println("isOdd");
        oddTest(5, true);
        oddTest(0, false);
        oddTest(-2, false);
        oddTest(-3, true);
    }
    
    /**
     * Method to test if numbers in parameter is 
     * @param a int to be tested
     * @param b boolean, true if odd, false if even
     */
    private void oddTest(int a, boolean b) {
        boolean expResult = b;
        boolean result = Manipulate.isOdd(a);
        assertEquals(expResult, result);
    }
    
    
}
