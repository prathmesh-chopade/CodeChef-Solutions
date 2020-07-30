import java.util.Scanner;

class STFOOD {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int ans = -1;
			int n = in.nextInt();
			for (int j = 0; j < n; j++) {
				int s = in.nextInt();
				int p = in.nextInt();
				int v = in.nextInt();
				int temp = (int) Math.floor(p / (s + 1));
				temp *= v;
				if (temp > ans)
					ans = temp;
			}
			System.out.println(ans);
		}

	}

}
