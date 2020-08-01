import java.util.Scanner;

class ICM2008 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-- > 0) {
			long a = in.nextInt();
			long b = in.nextInt();
			long c = in.nextInt();
			long d = in.nextInt();
            long x = Math.abs(a - b);
            long y = Math.abs(c - d);
            if (x == 0)
                System.out.println("YES");
            else if (y == 0)
            	System.out.println("NO");
            else if (x % y == 0)
            	System.out.println("YES");
            else
            	System.out.println("NO");
		}

	}

}
