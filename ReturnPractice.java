import java.util.*;
/**
 * @Anthony Corbin
 * Neumont University
 * Class: Intro to Computer Sciences A
 * Quarter: 1
 * [Date]
 * return something
 */
public class ReturnPractice {
    public static int getPercent() {
        //all of the below is valid
        //return (int)(100*(69.0/76));
        //return (int)(100*(69/76.0));
        //return (int)(100*(69/76(double)));
        //return (int)(100*((double)69/76));
        return (int)(100*(69.0/76.0));
    }
    public static String wat() {
        return "wat";
    }
    public static int sum(int a, int b) {
        return a+b;
    }
    public static char int2char(int num) {
        return (char)num;
    }
    public static String getInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Dat Name: ");
        return input.nextLine().toUpperCase();
        
    }
    public static void returnValuesHere () {
        //String str = "table ".concat("chair");
        //System.out.print(str);
        //System.out.print("cat".concat("dog"));
        //int strLength = "This is the song that never ends, yes it goes on and on my friends, some people started singing it not knowing what it was, and they will continue singing it forever just because".length();
        //System.out.print(strLength);
        //System.out.print(sum(1,1));
        //System.out.println("Dat name is: "+getInput());
        /*for(int i=0;i<256;i++) {
            System.out.println(i+" : '"+int2char(i)+"'");
        }//*/
    }
    public static void main(String[] args) {
        //ReturnPractice.returnValuesHere();
        //System.out.print(ReturnPractice.getPercent()+"%");
        //System.out.print(.01*.01*.01);
        int x = 5;
        System.out.print(++x);
        System.out.print(x);
        System.out.print(x++);
    }
}
