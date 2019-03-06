package com.cput.chapter;

public class Drone {
    private double takeOffWeight;
    private int flightSpeed;
    private int maxSpeed;
    private int flightAscentSpeed;
    private String modelName;
    private boolean used;

    Drone()
    {

    }

    Drone(double takeOffWeight, int flightSpeed, int maxSpeed, int flightAscentSpeed, String modelName, boolean used)
    {
        this.takeOffWeight = takeOffWeight;
        this.flightSpeed = flightSpeed;
        this.maxSpeed = maxSpeed;
        this.flightAscentSpeed = flightAscentSpeed;
        this.modelName = modelName;
        this.used = used;
    }

    public void addAccessoriesWeight()
    {
        this.takeOffWeight += 50;
    }

    public int takeoff()
    {
        int i = 0;
        flightSpeed = 0;
        while(flightSpeed < 60)
        {
            i++;
            flightSpeed += flightAscentSpeed;
        }

        return i;
    }

    public static boolean droneEquality(Drone c1, Drone c2)
    {
        boolean equal;
        if(c1.getTakeOffWeight() != c2.getTakeOffWeight())
            equal = false;
        else
        {
            if(c1.getFlightSpeed() != c2.getFlightSpeed())
                equal = false;
            else
            {
                if(c1.getMaxSpeed() != c2.getMaxSpeed())
                    equal = false;
                else
                {
                    if(c1.getFlightAscentSpeed() != c2.getFlightAscentSpeed())
                        equal = false;
                    else
                    if (c1.getModelName() != c2.getModelName())
                        equal = false;
                    else
                    if(c1.getDroneCondition() != c2.getDroneCondition())
                        equal = false;
                    else
                        equal = true;
                }
            }
        }

        return equal;
    }

    public double getTakeOffWeight()
    {
        return this.takeOffWeight;
    }

    public void setTakeOffWeight(double takeOffWeight)
    {
        this.takeOffWeight = takeOffWeight;
    }

    public int getFlightSpeed()
    {
        return this.flightSpeed;
    }

    public void setFlightSpeed(int flightSpeed)
    {
        this.flightSpeed = flightSpeed;
    }

    public String getModelName()
    {
        return this.modelName;
    }

    public void setModelName(String modelName)
    {
        this.modelName = modelName;
    }

    public boolean getDroneCondition()
    {
        return this.used;
    }

    public void setDroneCondition(boolean used)
    {
        this.used = used;
    }

    public int getMaxSpeed()
    {
        return maxSpeed;
    }

    public int getFlightAscentSpeed()
    {
        return flightAscentSpeed;
    }

    public String toString()
    {
        return("Drone Model: " + modelName + "\nDrone Weight: " + takeOffWeight + "grams \nFlight Speed: " + flightSpeed + "m/s \nDrone Condition: " + used);
    }

}
