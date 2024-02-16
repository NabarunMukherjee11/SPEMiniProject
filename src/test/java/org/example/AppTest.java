package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {

        TestSuite suite = new TestSuite();

        suite.addTest(new AppTest("testNaturalLogarithm"));
        suite.addTest(new AppTest("testPower"));
        suite.addTest(new AppTest("testFactorial"));
        suite.addTest(new AppTest("testSquareRoot"));

        return suite;

    }
    public void testSquareRoot() {
        assertEquals(2.0, Math.sqrt(4), 0.001); // Expected, Actual, Delta
    }

    public void testFactorial() {
        assertEquals(120, App.factorial(5));
    }

    public void testNaturalLogarithm() {
        assertEquals(1.609, Math.log(5), 0.001);
    }

    public void testPower() {
        assertEquals(8.0, Math.pow(2, 3), 0.001);
    }


    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
