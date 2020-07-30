import java.util.Scanner;

class FLOW018 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int fact = 1;
			int n = in.nextInt();
			for (int i = 1; i <= n; i++) {
				fact = fact * i;
			}
			System.out.println(fact);
		}

	}

}
