import java.util.*;
/**
 * @Anthony Corbin
 * Neumont University
 * Class: Intro to Computer Sciences [section]
 * Quarter: 1
 * [Date]
 * [Assignment Name]
 * Description of the class: this class does stuff
 */
//distance=rape time
public class LaserCannon {
    
    private final int SPEED_OF_LIGHT = 299792458;//meters per second
    //private final int EARTH_TO_MOON = 384400000;//m
    private double distanceOne;
    private double distanceTwo;
    private double time;
    private double angle;
    //time it takes light to reach moon = 0.78 seconds
    public LaserCannon() { }
    public double distanceOne() { return distanceOne; }
    public double distanceTwo() { return distanceTwo; }
    public double angle() {  return round(angle,3); }
    public double time() { return round(time,3); }
    public double round(double num, int zeros) {
        int rounder=1;
        for(int i=0;i<zeros;i++) { rounder *= 10; }//creates power to round number
        int temp = (int)(num*rounder);
        return (double)temp/rounder;
    }
    /**
     * returns a random time
     */
    private double randomTime(double max, double min) {
        Random rand = new Random();
        return (rand.nextDouble()*1672)%(max-min)+min;
    }
    /**
     * returns a random angle
     */
    private double randomAngle(double max, double min) {
        Random rand = new Random();
        return rand.nextDouble()%(max-min)+min;
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
        this.angle = randomAngle(180,10);
        this.time  = randomTime(100,1);
        return this.calcDistance(this.distanceOne,this.distanceTwo,this.angle) / this.time;
    }
    /**
     * calls and returns speed function, i guess because "shootLaser" sounds cooler
     */
    public double shootLaser() { return this.speed(); }
}
