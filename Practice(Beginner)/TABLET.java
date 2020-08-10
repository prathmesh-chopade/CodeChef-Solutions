import java.util.Scanner;

class TABLET {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			int b = in.nextInt();
			int max = 0;
			while (n-- > 0) {
				int w = in.nextInt();
				int h = in.nextInt();
				int p = in.nextInt();
				if (p <= b) {
					if (w * h > max)
						max = w * h;
				}
			}
			System.out.println((max == 0) ? "no tablet" : max);
		}

	}

}
