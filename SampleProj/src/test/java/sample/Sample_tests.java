package sample;


import junit.framework.Assert;
import org.junit.*;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;



/**
 * Created by rondlap on 11/11/2016.
 */
public class Sample_tests {

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
    public void pass1_test() throws Exception {
        System.out.println("Test that passes");
        Assert.assertTrue(true);
    }
    //====================================================================================

    //====================================================================================
    @Test
    public void pass2_test() throws Exception {
        System.out.println("Test that passes");
        Assert.assertTrue(true);
    }
    //====================================================================================

    //====================================================================================
    @Test
    public void fail_test() throws Exception {
        System.out.println("Test that fails 1");
        Assert.assertTrue(true);
    }
    //====================================================================================

    //====================================================================================
    @Test
    public void isInMaster_test() throws Exception {
        System.out.println("look for it in master");
        Assert.assertTrue(true);
    }
    //====================================================================================

    @BeforeClass
    //====================================================================================
    public static void classSetup(){
    }
    //====================================================================================

    @AfterClass
    //====================================================================================
    public static void classCleanup(){

    }
    //====================================================================================

    @Rule
    //====================================================================================
    /**
     * this method sets sets some parameters and prints to log
     */
    public TestRule watcher = new TestWatcher() {
        protected void starting(Description description) {

        }
        protected void failed(Throwable e, Description description) {

        }
        protected void succeeded (Description description) {
        }
        protected void finished (Description description ){

        }
    };
    //====================================================================================
}
