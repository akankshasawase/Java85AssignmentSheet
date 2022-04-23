import java.util.Scanner;
public class Program30
{
	public static void main(String args[])
	{
	  double n1,n2,n3,n4,total,avg;
		Scanner o= new Scanner(System.in);

     System.out.println("enter a  1st no:");
     n1= o.nextDouble();
     System.out.println("enter a  2nd no:");
     n2= o.nextDouble();
     System.out.println("enter a 3rd no:");
     n3= o.nextDouble();
	 System.out.println("enter a 4th no:");
     n4= o.nextDouble();
	 total=n1+n2+n3+n4;
     avg=total/4;

     System.out.println("Total of 4 no is:"+total);
	 System.out.println("Average of 4 no is:"+avg);
	}
}