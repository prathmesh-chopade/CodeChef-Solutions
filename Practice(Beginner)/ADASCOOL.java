import java.util.Scanner;

class ADASCOOL {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			int m = in.nextInt();
			if (n % 2 == 1 && m % 2 == 1) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
		}

	}

}
