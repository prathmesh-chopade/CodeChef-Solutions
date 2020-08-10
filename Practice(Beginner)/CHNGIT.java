import java.util.Arrays;
import java.util.Scanner;

class CHNGIT {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int count[] = new int[100];
			int n = in.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				count[in.nextInt() - 1] += 1;
			}
			Arrays.sort(count);
			System.out.println(n-count[99]);
		}

	}

}
