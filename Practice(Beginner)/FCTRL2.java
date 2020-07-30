import java.math.BigInteger;
import java.util.Scanner;

class FCTRL2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		
		for(int i=1; i<=t; i++){
		     int n = scan.nextInt();
		     BigInteger factorial = BigInteger.valueOf(1);
		     for(int j=1; j<=n; j++){
		          factorial = factorial.multiply(BigInteger.valueOf(j));
		     }
		     
		     System.out.println(factorial);
		    
		}
		
		
		
	}
}
