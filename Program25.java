import java.util.Scanner;
public class Program25
{
	public static void main(String args[])
	{
		double celcius,kelvin;
		Scanner o= new Scanner(System.in);

     System.out.println("enter temprature in kelvin: :");
     kelvin= o.nextDouble();
     
         celcius=kelvin-273.15;;

     System.out.println("Temprature in celcius:"+celcius);
	}
}
 
 