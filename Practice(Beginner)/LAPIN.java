import java.util.Arrays;
import java.util.Scanner;

class LAPIN {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int T = Integer.parseInt(in.nextLine());
		for (int i = 0; i < T; i++) {
			String str = in.nextLine();
			int length = str.length();
			char[] ar1 = str.substring(0, length / 2).toCharArray();
			char[] ar2;
			if (length % 2 == 1) {
				ar2 = str.substring(length / 2 + 1, length).toCharArray();
			} else {
				ar2 = str.substring(length / 2, length).toCharArray();
			}
			Arrays.sort(ar1);
			Arrays.sort(ar2);
			if (String.valueOf(ar1).equals(String.valueOf(ar2))) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

	}

}
