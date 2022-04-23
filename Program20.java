import java.util.Scanner;
public class Program20
{
	public static void main(String args[])
	{
		double farhebhit,celcius;
		Scanner o= new Scanner(System.in);

     System.out.println("enter temprature in celcius: :");
     celcius= o.nextDouble();
     
       farhebhit=(celcius*9.0)/5.0+32;     

     System.out.println("Temprature in farhebhit:"+farhebhit);
	}
}