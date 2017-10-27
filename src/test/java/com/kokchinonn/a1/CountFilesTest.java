//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment1
//Matrik: #239920
//Name: #Kok Chin Onn
package com.kokchinonn.a1;

import com.kokchinonn._a1.CountFiles;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CountFilesTest {
    
    public CountFilesTest() {
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

    
    @Test
    public void testCountJavaFiles() {
        System.out.println("Count Java Files");
        String[] countJavaFile = new String[4];
        String[] expResult = {};
        CountFiles cf = new CountFiles();
        String[] result = cf.countJavaFiles();
        assertArrayEquals(expResult, result);

    }
}
