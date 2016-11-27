package sample;
//hndhdh

import junit.framework.Assert;
import org.junit.*;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;



/**
 * Created by rondlap on 11/11/2016.
 */
public class Sample_Test {

    //====================================================================================
    @Before
    public void setUp() throws Exception {
        System.out.println("Before testdsfdsf ");
    }
    //====================================================================================

    //====================================================================================
    @After
    public void tearDown() throws Exception {
        System.out.println("After test");
    }
    //====================================================================================

    //====================================================================================
    @Test
    public void pass1_Test() throws Exception {
        System.out.println("Test that passes");
        Assert.assertTrue(true);
    }
    //====================================================================================

    //====================================================================================
    @Test
    public void pass2_Test() throws Exception {
        System.out.println("Test that passes");
        Assert.assertTrue(true);
    }
    //====================================================================================

}
