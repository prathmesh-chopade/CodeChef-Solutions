import java.util.Scanner;

class CUTBOARD {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int a = in.nextInt();
			int b = in.nextInt();
			System.out.println((a - 1) * (b - 1));
		}

	}

}
