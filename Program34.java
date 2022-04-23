import java.text.SimpleDateFormat;
import java.util.Date;
public class Program34
{
	public static void main(String args[])
	{
      SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	  Date d= new Date();
	  System.out.println(f.format(d));
	}
}