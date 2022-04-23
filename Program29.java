import java.util.Scanner;
public class Program29
{
	public static void main(String args[])
	{

      int dividend,divisor,quotient,remainder;
	  Scanner o= new Scanner(System.in);
    System.out.println("enter dividend:");
    dividend=o.nextInt();
    System.out.println("enter divisor:");
    divisor=o.nextInt();
    quotient=dividend/divisor;
    remainder=dividend%divisor;
     System.out.println("quotient:"+quotient);
     System.out.println("remainder:"+remainder);
	}
}