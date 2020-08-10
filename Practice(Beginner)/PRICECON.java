import java.util.Scanner;

class PRICECON {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			int k = in.nextInt();
			long total = 0, ceiltotal = 0;
			while (n-- > 0) {
				int p = in.nextInt();
				if (p > k)
					ceiltotal += k;
				else
					ceiltotal += p;
				total += p;
			}
			System.out.println(total - ceiltotal);
		}

	}

}
