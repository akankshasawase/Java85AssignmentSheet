import java.util.Scanner;
public class Program14
{
	public static void main(String args[])
	{
     int r;
     double v;
	 Scanner s = new Scanner(System.in);
	 
     System.out.println("enter value for radius:");
     r=s.nextInt();
     v=4*(3.14*r*r*r)/3;
     System.out.println("volume of sphere is:"+v);
	}
}