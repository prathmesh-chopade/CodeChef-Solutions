import java.util.Scanner;

class STUPMACH {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int n = in.nextInt();
			int s[] = new int[n];
			for (int j = 0; j < n; j++) {
				s[j] = in.nextInt();
			}
			long result = 0;
			int capacity = Integer.MAX_VALUE;
			for (int Si : s) {
				capacity = Math.min(capacity, Si);
				result += capacity;
			}
			System.out.println(result);
		}

	}

}
