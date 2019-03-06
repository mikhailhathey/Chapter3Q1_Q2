package com.cput.chapter;

import junit.framework.TestCase;
import org.junit.Test;

public class TestDrone extends TestCase {

    @Test
    public void testAddAccessoriesWeight() throws Exception
    {
        //Testing comparison of floats
        Drone mavicPro = new Drone(900.0, 0, 200, 24, "DJI Mavic Pro", false);
        mavicPro.addAccessoriesWeight();
        assertEquals(950.0, mavicPro.getTakeOffWeight());
    }

    @Test
    public void testTakeOff() throws Exception
    {
        //Testing comparison of ints
        int actual;
        Drone mavicPro = new Drone(900.0, 0, 200, 24, "DJI Mavic Pro", false);
        actual = mavicPro.takeoff();
        assertEquals(3, actual);
    }

    @Test
    public void testDroneEquality() throws Exception
    {
        //Testing for object equality
        Drone mavicPro = new Drone(900.0, 0, 200, 24, "DJI Mavic Pro", false);
        Drone mavicAir = new Drone(900.0, 0, 200, 24, "DJI Mavic Pro", false);

        assertTrue(Drone.droneEquality(mavicPro, mavicAir));

        //Testing for object identity
        Drone mavicPro1 = mavicPro;
        assertSame(mavicPro, mavicPro1);
    }

    @Test
    public void testSetSecondHand() throws Exception
    {
        //Testing for Truth
        Drone golf = new Drone(700.0, 0, 100, 10, "DJI Mavic 2", true);
        assertTrue(golf.getDroneCondition());

        //Testing for False
        golf.setDroneCondition(false);
        assertFalse(golf.getDroneCondition());
    }

    @Test
    public void testDrone() throws Exception
    {
        Drone nullDrone = new Drone();

        //Testing for not Nullness
        assertNotNull(nullDrone);

        //Testing for Nullness
        nullDrone = null;
        assertNull(nullDrone);

    }

    @Test
    public void testFail() throws Exception
    {
        //Failed Test
        fail("This method is meant to fail");
    }

    //This test will be failed as it will take a while to timeout
    //This is the Disabled and Timeout Test
    /*@Ignore ("Test is ignored as it will timeout")
    public void testWithTimeout() throws InterruptedException{
        TimeUnit.SECONDS.sleep(2000);
    }*/

}
