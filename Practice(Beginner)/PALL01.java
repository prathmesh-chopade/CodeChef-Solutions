import java.util.Scanner;

class PALL01 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = Integer.parseInt(in.nextLine());
		while (t-- > 0) {
			int a = in.nextInt();
			int rev = 0;
			int number = a;
			while (a != 0) {
				int rem = a % 10;
				rev = rev * 10 + rem;
				a /= 10;
			}
			if (rev == number)
				System.out.println("wins");
			else
				System.out.println("loses");
		}

	}

}
