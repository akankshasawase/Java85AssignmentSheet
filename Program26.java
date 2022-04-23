import java.util.Scanner;
public class Program26
{
	public static void main(String args[])
	{
		double farhenhit,kelvin;
		Scanner o= new Scanner(System.in);

     System.out.println("enter temprature in farhenhit: :");
     farhenhit= o.nextDouble();
     
       kelvin=(5.0/9)*(farhenhit-32)+273.15;   

     System.out.println("Temprature in kelvin:"+kelvin);
	}
}