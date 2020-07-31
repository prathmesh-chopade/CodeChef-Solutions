import java.util.Scanner;

class PSHOT {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = Integer.parseInt(in.nextLine());
		for (int j = 0; j < t; j++) {
			int N = Integer.parseInt(in.nextLine());
			String str = in.nextLine();
			int count_a = 0, count_b = 0;
			int win_a = 0, win_b = 0;
			boolean flag = false;
			for (int i = 0; i < str.length(); i++) {
				if (i % 2 == 0) {
					if (str.charAt(i) == '1')
						win_a++;

					count_a++;
				} else if (i % 2 == 1) {
					if (str.charAt(i) == '1')
						win_b++;

					count_b++;
				}

				if (win_a > (win_b + N - count_b)) {
					System.out.println(i + 1);
					flag = true;
					break;
				} else if (win_b > (win_a + N - count_a)) {
					System.out.println(i + 1);
					flag = true;
					break;
				}
			}

			if (!flag)
				System.out.println(2 * N);
		}

	}

}
