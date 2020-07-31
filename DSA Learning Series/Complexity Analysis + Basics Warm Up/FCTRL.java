import java.util.Scanner;

class FCTRL {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int c = 1;
			int b = 0;
			while (a / c > 0) {
				c = c * 5;
				b = b + (a / c);
			}
			System.out.println(b);
		}

	}

}
