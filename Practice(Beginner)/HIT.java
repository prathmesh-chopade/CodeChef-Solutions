import java.util.*;

class HIT {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[4];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			Arrays.sort(a);
			int x = n / 4;
			int z = a[n - x];
			int y = a[n / 2];
			int xx = a[n - 3 * x];
			if (a[n - x] == a[n - x - 1] || a[n / 2] == a[n / 2 - 1] || a[n - 3 * x] == a[n - 3 * x - 1])
				System.out.println("-1");
			else
				System.out.println(xx + " " + y + " " + z);
		}

	}

}
