import java.util.Scanner;
public class Program21
{
	public static void main(String args[])
	{
		double farhenhit,celcius;
		Scanner o= new Scanner(System.in);

     System.out.println("enter temprature in farhenhit: :");
     farhenhit= o.nextDouble();
     
       celcius=5*(farhenhit-32)/9;   

     System.out.println("Temprature in celcius:"+celcius);
	}
}