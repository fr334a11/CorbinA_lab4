import java.util.*;
/**
 * @Anthony Corbin
 * Neumont University
 * Class: Intro to Computer Sciences
 * Quarter: 1
 */
//distance=rape time
public class LaserCannon {
    private final int SPEED_OF_LIGHT = 299792458;//meters per second
    //private final int EARTH_TO_MOON = 384400000;//m
    private double distanceOne;
    private double distanceTwo;
    private double time;
    private double angle;
    /**
     * create the class
     */
    public LaserCannon() {
        this.distanceOne = 0;
        this.distanceTwo = 0;
        this.time = 0;
        this.angle = 0;
    }
    
    //returning instance variables
    public double distanceOne() { return distanceOne;    }
    public double distanceTwo() { return distanceTwo;    }
    public double angle()    {    return round(angle,3); }
    public double time()     {    return round(time,3);  }
    
    
    /**
     * rounds a variable to given deciaml places
     */
    public double round(double num, int zeros) {
        int rounder=1;
        for(int i=0;i<zeros;i++) { rounder *= 10; }//creates power to round number
        //multiplys by power, rounds off by casting to int, then divides back to orginal
        return ((int)(num*rounder))/(double)rounder;
    }
    
    
    
    /**
     * returns a random time
     */
    private double randomTime(double max, double min) {
        Random rand = new Random();
        return this.time = (rand.nextDouble()*1672)%(max-min)+min;
    }
    /**
     * returns a random angle
     */
    private double randomAngle(double max, double min) {
        Random rand = new Random();
        return this.angle = rand.nextDouble()%(max-min)+min;
    }
    
    
    
    /**
     * returns the distance the moon fragment is from the earth
     */
    private double distanceToMoon() {
        return (SPEED_OF_LIGHT*randomTime(.010001,.01));
    }
    /**
     * calculated the distance between 2 points
     */
    private double calcDistance(double d1, double d2, double ang) {
        return Math.sqrt( d1*d1+d2*d2-2*d1*d2*Math.cos( Math.toRadians(ang) ) );
    }
    /**
     * Calcs the speed of the moon.
     * will calculate and set 2 distances and a random angle between
     */
    public double speed() {
        this.distanceOne = distanceToMoon();
        this.distanceTwo = distanceToMoon();
        this.randomAngle(180,10);
        this.randomTime(100,1);
        return this.calcDistance(this.distanceOne,this.distanceTwo,this.angle) / this.time;
    }
    /**
     * calls and returns speed function, i guess because "shootLaser" sounds cooler
     */
    public double shootLaser() { return this.speed(); }
}
