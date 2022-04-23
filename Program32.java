import java.util.Scanner;
public class Program32
{
	public static void main(String args[])
	{

     int a;
	 Scanner o= new Scanner(System.in);
     System.out.println("enter a value for a:");
     a=o.nextInt();
	 if(a>0)
	 {
		 System.out.println("Entered value is positive");
	 }
	 else if(a<0)
	 {
		  System.out.println("Entered value is Negative");
	 }
	 else
	 {
		 System.out.println("Entered value is zero");
	 }
	}
}