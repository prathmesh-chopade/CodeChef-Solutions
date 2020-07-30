import java.util.Scanner;

class INTEST {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		long ans = 0;
		long n = in.nextLong();
		long k = in.nextLong();
	    for(int i=1;i<=n;i++)
	    {
	    	long t = in.nextLong();
	        if(t%k==0)
	            ans++;
	    }
	    System.out.println(ans);
	}

}
