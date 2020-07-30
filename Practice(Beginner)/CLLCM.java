import java.util.Scanner;

class CLLCM {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int i = 0; i < T; i++) {
			boolean flag = true;
			int n = in.nextInt();
			int a[] = new int[n];
			for (int j = 0; j < n; j++) {
				a[j] = in.nextInt();
			}
			for (int j : a) {
				if (j % 2 == 0) {
					flag = false;
					break;
				}
			}
			if (flag)
				System.out.println("YES");
			else
				System.out.println("NO");
		}

	}

}
