import java.util.Scanner;
public class Program19
{
	public static void main(String args[])
	{
		double r,area;
		Scanner o= new Scanner(System.in);

     System.out.println("enter a radius of circle :");
     r= o.nextDouble();
     
     area=3.14*r*r;

     System.out.println("Area of circle is:"+area);
	}
}