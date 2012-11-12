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
public class OrignLine
{
  private int x;
  private int y;
  private static int lineCount = 0;
  public OrignLine() {
      x = 42;
      y = 42;
      lineCount++;
    }
    public OrignLine(int leX, int leY) {
        x = leX;
        y = leY;
        lineCount++;
    }
    public static int lineCount()  { return lineCount; }
    public int getX() { return x; }
    public int getY() { return y; }
    public double distance() { return Math.sqrt(x*x + y*y); }
    public double slope() { return (double)x/y; }
}
