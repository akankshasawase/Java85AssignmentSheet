import java.util.Scanner;
public class Program33
{
	public static void main(String args[])
	{
	  double n1,n2,quotient;
		Scanner o= new Scanner(System.in);

     System.out.println("enter a  1st no:");
     n1= o.nextDouble();
     System.out.println("enter a  2nd no:");
     n2= o.nextDouble();
    quotient=n1/n2;
     System.out.println("Division:"+quotient);
	}
}