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
    private final int EARTH_TO_MOON = 384400000;//m
    private double time;
    private double randTime;
    private double angle;
    //time it takes light to reach moon = 0.78 seconds
    public LaserCannon() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter an angle of laser in degrees: ");
        this.angle = Double.parseDouble(input.nextLine());
    }
    /**
     * returns a very small random time
     */
    private double randomTime(double max, double min) {
        Random rand = new Random();
        //return randTime = rand.nextDouble()%.000001+.01;
        return randTime = rand.nextDouble()%(max-min)+min;
    }
    /**
     * gets time from user between shots
     */
    public double getTime() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nWhat was the time between shooting laser(seconds): ");
        return this.time = Double.parseDouble(input.nextLine());
    }
    /**
     * get degree from user
     */
    public /*double*/void pointAtObject() {
        
    }
    /**
     * returns the distance the moon fragment is from the earth
     */
    private int distanceToMoon() {
        return (int)(SPEED_OF_LIGHT*randomTime(.010001,.01));
    }
    /**
     * calculated the distance between 2 points
     */
    private double calcDistance(double distanceOne, double distanceTwo, double leAngle) {
        return Math.sqrt( distanceOne*distanceOne+distanceTwo*distanceTwo-2*distanceOne*distanceTwo*Math.cos( Math.toRadians(leAngle) ) );
    }
    /**
     * Calcs the speed of the moon
     */
    public double speed(double d1, double d2, double angle) {
        return this.calcDistance(d1,d2,angle) / this.getTime();
    }
    /**
     * calls and returns speed function, i guess because "shootLaser" sounds cooler
     */
    public double shootLaser() {
        this.pointAtObject();
        return this.speed(distanceToMoon(),distanceToMoon(),angle);
    }
}
