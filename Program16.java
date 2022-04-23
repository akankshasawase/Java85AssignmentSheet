import java.util.Scanner;
public class Program16
{
	public static void main(String args[])
	{
		int r,h;
       double v;
	   Scanner o= new Scanner(System.in);
    System.out.println("enter a radius of cylinder:");
    r= o.nextInt();
    System.out.println("\n enter a height of cylinder:");
    h= o.nextInt();
    v=3.14*r*r*h;
    System.out.println("volume of cylinder:"+v);
	}
}