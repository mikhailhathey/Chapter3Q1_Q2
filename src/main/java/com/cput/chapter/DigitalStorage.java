package com.cput.chapter;

public class DigitalStorage {
    private int freeSpace;
    private boolean memoryLockOn;
    private int storageDevices;

    DigitalStorage()
    {
        freeSpace = 100;
        memoryLockOn = true;
        storageDevices = 3;
    }

    public void switchMemoryLockOff()
    {
        memoryLockOn = false;
    }

    public void clearStorage()
    {
        freeSpace = 100;
        storageDevices = storageDevices - 1;
    }

    public void takePictures()
    {
        while(freeSpace > 0)
        {
            freeSpace--;
        }
    }

    public void shootUntilMemoryFull()
    {
        switchMemoryLockOff();
        takePictures();

        while(storageDevices > 0)
        {
            clearStorage();
            takePictures();
        }
    }

    public int getFreeSpace()
    {
        return freeSpace;
    }

    public boolean getMemoryLockOn()
    {
        return memoryLockOn;
    }

    public int getStorageDevices()
    {
        return storageDevices;
    }

}
