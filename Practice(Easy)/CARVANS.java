import java.util.Scanner;

class CARVANS {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int c = 0, prev = 0;
			int n = in.nextInt();
			for (int j = 0; j < n; j++) {
				int s = in.nextInt();
				if (j == 0) {
					c++;
					prev = s;
				} else {
					if (s <= prev) {
						c++;
						prev = s;
					}
				}
			}
			System.out.println(c);
		}

	}

}
