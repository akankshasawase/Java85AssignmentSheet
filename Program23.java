import java.util.Scanner;
public class Program23
{
	public static void main(String args[])
	{
       double kmph,miph;
	   Scanner o= new Scanner(System.in);
     
	 System.out.println("enter distance in kilometer :");
     kmph=o.nextDouble();
	 miph=kmph*0.6213712;
	 System.out.println("Distance in meter is :"+miph);
	}
}