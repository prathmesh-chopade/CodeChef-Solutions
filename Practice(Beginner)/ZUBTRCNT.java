import java.util.Scanner;

class ZUBTRCNT {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int x = 0;
	       while (t-- > 0) {
	            x++;
	            long l = in.nextLong();
	            long k = in.nextLong();
	            if (k > l)
	                System.out.println("Case " + x + ": 0");
	            else {
	                long ans = ((l - k + 1) * (l - k + 2)) / 2;
	                System.out.println("Case " + x + ": " + ans);
	            }
	        }
		
	}

}
