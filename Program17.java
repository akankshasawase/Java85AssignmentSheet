import java.util.Scanner;
public class Program17
{
	public static void main(String args[])
	{
		int l,w,a,p;
		Scanner o= new Scanner(System.in);
     System.out.println("enter length of rectangle:");
     l=o.nextInt();
     System.out.println("enter width of rectangle:");
     w= o.nextInt();
     a=l*w;
     p=2*(l+w);
     System.out.println("area of rectangle:"+a);
     System.out.println("Perimeter of rectangle:"+p);
	}
}