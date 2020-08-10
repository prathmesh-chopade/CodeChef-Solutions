import java.util.Scanner;

class RRJOKE {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			int output = 0;
			for (int i = 1; i <= n; i++) {
				int x = in.nextInt();
				int y = in.nextInt();
				output ^= i;
			}
			System.out.println(output);
		}

	}

}
