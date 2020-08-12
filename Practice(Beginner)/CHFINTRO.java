import java.util.Scanner;

class CHFINTRO {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int r = sc.nextInt();
		while (t-- > 0) {
			int d = sc.nextInt();
			if (d >= r) {
				System.out.println("Good boi");
			} else {
				System.out.println("Bad boi");
			}
		}
	}

}
