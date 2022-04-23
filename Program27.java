import java.util.Scanner;
public class Program27
{
	public static void main(String args[])
	{
		double kelvin,celcius;
		Scanner o= new Scanner(System.in);

     System.out.println("enter temprature in celcius: :");
     celcius= o.nextDouble();
     
        kelvin=celcius+273.15;     

     System.out.println("Temprature in kelvin:"+kelvin);
	}
}