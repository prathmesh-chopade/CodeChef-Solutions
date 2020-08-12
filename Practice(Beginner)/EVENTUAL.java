import java.util.Scanner;

class EVENTUAL {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			String s = sc.next();
			int c[] = new int[26];
			boolean ans = true;
			for (int i = 0; i < s.length(); i++) {
				c[Math.abs(97 - (int) s.charAt(i))]++;
			}
			for (int i = 0; i < 26; i++) {
				if (c[i] % 2 != 0) {
					ans = false;
					break;
				} else {
					ans = true;
				}
			}
			if (ans == true) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

	}

}
