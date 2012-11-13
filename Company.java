import java.util.*;
/**
 * @Anthony Corbin
 * Neumont University
 * Class: Intro to Computer Sciences A
 * Quarter: 1
 * Lab 4
 * I'm  a firing ma lazor
 */
public class Company {
    //public static final String NAME = "Anthony";
    //NO STATIC METHODS IN ANYTHING (minus main)
    private String name;
    private double salePrice;
    private double sales;
    private static double manafactureCost;
    private static final int DAILY_BILLS    = 300;
    private static final int SHIPPING_COST  = 20;
    /**
     * Prompts for company name and finicial information
     */
    public Company() {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to SkyNet's buisness start up plan,\nWhat would you like to call your company: ");
        name = input.nextLine();
    }
    /**
     * formats doubles for formatting money rounding off to the nearest cent
     */
    private static double formatMoney(double num) {
        int temp = (int)(100*(num));
        return temp/100.0;
    }
    private static int abs(int num) {
        if(num<0) { return -num; }
        return num;
    }
    private static String S_formatMoney(double num) {
        int temp = (int)(100*(num));
        return "$"+temp/100+"."+abs(temp - 100*((int)temp/100));
    }
    /**
     * gets the sale price for each item from user
     */
    public double salePrice() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nWhat is the sale price of each laser($) ");
        salePrice = Double.parseDouble(input.nextLine());
        return Company.formatMoney(salePrice);
    }
    /**
     * gets the manafacture cost for each item from user
     */
    public double manafactureCost() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nSkyNet helps you sell lasers, but places you in charge of book keeping\nHow much does it cost to manafacture one laser($): ");
        manafactureCost = Double.parseDouble(input.nextLine());
        return Company.formatMoney(manafactureCost);
    }
    /**
     * gets the number of sales from the user
     */
    public double numOfSales() {//will round to the nearest cent
        Scanner input = new Scanner(System.in);
        System.out.print("\nHow many items has "+name+" sold today: ");
        sales = Double.parseDouble(input.nextLine());
        return Company.formatMoney(sales);
    }
    /**
     * returns the amount that the company has made in profits
     */
    public double amountOfProfit() {
        return Company.formatMoney(((salePrice-manafactureCost)*sales)-DAILY_BILLS);
    }
    /**
     * will create and return a laser
     */
    public LaserCannon makeDeathRay() {
        return new LaserCannon();
    }
    public static void main(String[] args) {
        Company skyNet = new Company();
        skyNet.manafactureCost();
        skyNet.salePrice();
        skyNet.numOfSales();
        System.out.print("\n\nCongrads on making "+S_formatMoney(skyNet.amountOfProfit())+
            " after paying "+S_formatMoney(DAILY_BILLS)+" in bills.\n\n");
        LaserCannon catToy = skyNet.makeDeathRay();
        double temp = catToy.speed();
        System.out.print("\n\nA laser mesured the distance of the moon within a "+catToy.time()+"s period finding\n"+
                        catToy.distanceOne()+"\nand\n"+catToy.distanceTwo()+"\nthe angle between these shots was\n"+
                        catToy.angle()+"\nWith this data the speed of the moon is "+temp+" m/s");
        System.out.print("\n\nWe also blew up that moon, have a nice day");
    }
}
