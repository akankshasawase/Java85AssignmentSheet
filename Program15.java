import java.util.Scanner;
public class Program15
{
	public static void main(String args[])
	{
		int s,v;
		Scanner o = new Scanner(System.in);
		
     System.out.println("enter value of side of cube:");
     s= o.nextInt();
     v=s*s*s;
    System.out.println("volume of sphere is:"+v);
	}
}