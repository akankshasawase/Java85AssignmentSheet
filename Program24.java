import java.util.Scanner;
public class Program24
{
	public static void main(String args[])
	{
		double farhenhit,kelvin;
		Scanner o= new Scanner(System.in);

     System.out.println("enter temprature in kelvin: :");
     kelvin= o.nextDouble();
     
        farhenhit=(9.0/5)*(kelvin-273.15)+32;

     System.out.println("Temprature in farhenhit:"+farhenhit);
	}
}
 
 
 
 
 
 