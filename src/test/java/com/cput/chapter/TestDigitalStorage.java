package com.cput.chapter;

import junit.framework.TestCase;

public class TestDigitalStorage extends TestCase {
    public void testSwitchMemoryLockOff()
    {
        DigitalStorage sdCard = new DigitalStorage();
        sdCard.switchMemoryLockOff();
        assertFalse(sdCard.getMemoryLockOn());
    }

    public void testClearStorage()
    {
        DigitalStorage sdCard = new DigitalStorage();
        sdCard.clearStorage();
        assertEquals(2, sdCard.getStorageDevices());
    }

    public void testFire()
    {
        DigitalStorage sdCard = new DigitalStorage();
        sdCard.takePictures();
        assertEquals(0, sdCard.getFreeSpace());
    }

    public void testShootUntilMemoryFull()
    {
        DigitalStorage sdCard = new DigitalStorage();
        sdCard.shootUntilMemoryFull();
        assertEquals(0, sdCard.getFreeSpace());
        assertEquals(0, sdCard.getStorageDevices());
        assertFalse(sdCard.getMemoryLockOn());
    }

}
