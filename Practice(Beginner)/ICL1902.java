import java.util.Scanner;

class ICL1902 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int x = in.nextInt();
			int cnt = 0;
			while (x > 0) {
				int y = (int) Math.sqrt(x);
				x -= (y * y);
				cnt++;
			}
			System.out.println(cnt);
		}

	}

}
