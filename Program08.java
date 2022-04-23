
public class Program08
{
	public static void main(String args[])
	{

     System.out.println("Range of interger is[-2147483648,2147483647]");
     int n1=2147483647;
     System.out.println("overflow the integer range and set minimum range:"+(n1+1));
    System.out.println("Increase from its minimum range:"+(n1+2));
     System.out.println("product is:"+(n1*n1));

     int n2=-2147483648;
     System.out.println("Underflow the integer range and set maximum range:"+(n2+1));
     System.out.println("Increase from its minimum range:"+(n2+2));
    System.out.println("product is:"+(n2*n2));
	}
}