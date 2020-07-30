import java.util.Scanner;

class FLOW005 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int count = 0;
			int a[] = { 1, 2, 5, 10, 50, 100 };
			int n = in.nextInt();
			for (int i = a.length-1; i >= 0; i--) {
				while (n >= a[i]) {
					count++;
					n -= a[i];
				}
			}
			System.out.println(count);
		}

	}

}
