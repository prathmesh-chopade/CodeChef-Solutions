import java.util.Scanner;

class CHOPRT {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a < b) {
				System.out.println("<");
				continue;
			}
			if (a > b) {
				System.out.println(">");
				continue;
			}
			if (a == b) {
				System.out.println("=");
				continue;
			}
		}
	}

}
