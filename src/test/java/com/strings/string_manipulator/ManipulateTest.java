package com.strings.string_manipulator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juho Suni
 */
public class ManipulateTest {
    
    public ManipulateTest() {
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
     * Test of manipulator method, of class Manipulate.
     */
    @org.junit.Test
    public void testManipulator() {
        
        System.out.println("manipulator");
        String strA = "testisyöte";
        String expResultA = "TeStIsYöTe";
        String resultA = Manipulate.manipulator(strA);
        assertEquals(expResultA, resultA);
        
        String strB = null;
        String expResultB = null;
        String resultB = Manipulate.manipulator(strB);
        assertEquals(expResultB, resultB);
        
        String strC = "num 5 on pariton";
        String expResultC = "NuM o On PaRiToN";
        String resultC = Manipulate.manipulator(strC);
        assertEquals(expResultC, resultC);
        
        String strD = "! merkillinen jono";
        String expResultD = "! MeRkIlLiNeN jOnO";
        String resultD = Manipulate.manipulator(strD);
        assertEquals(expResultD, resultD);
        
        String strE = "num 4 on parillinen";
        String expResultE = "NuM e On PaRiLlInEn";
        String resultE = Manipulate.manipulator(strE);
        assertEquals(expResultE, resultE);
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
        int a = 0;
        boolean expResult = false;
        boolean result = Manipulate.isOdd(a);
        assertEquals(expResult, result);
    }
    
    
}
