import java.util.Scanner;
public class Program18
{
	public static void main(String args[])
	{
		double s,a, s1,s2,s3,area;
		Scanner o= new Scanner(System.in);

     System.out.println("enter a value for 1st side:");
     s1= o.nextDouble();
     System.out.println("enter a value for 2nd side:");
     s2= o.nextDouble();
     System.out.println("enter a value for 3rd side:");
     s3= o.nextDouble();
     s=(s1+s2+s3)/2;

     a=(s*(s-s1)*(s-s2)*(s-s3));
	 area=Math.sqrt(a);

     System.out.println("Area of triangle is:"+area);
	}
}