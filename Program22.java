import java.util.Scanner;
public class Program22
{
	public static void main(String args[])
	{
		int a1,a2,a3;
		Scanner o= new Scanner(System.in);

     
     System.out.println("enter a 1st angle:");
     a1=o.nextInt();
     System.out.println("enter a 2nd angle:");
     a2=o.nextInt();
     a3=180-(a1+a2);
     System.out.println("the 3rd angle is:"+a3);
 
	}
}