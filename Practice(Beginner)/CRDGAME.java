import java.util.Scanner;

class CRDGAME {

	public static int sumOfDigits(int n) {
		int sum = 0;
		while (n != 0) {
			sum = sum + n % 10;
			n = n / 10;
		}
		return sum;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int c = 0, m = 0;
			int n = sc.nextInt();
			while (n-- > 0) {
				int chef = sc.nextInt();
				int morty = sc.nextInt();
				if (sumOfDigits(chef) > sumOfDigits(morty))
					c++;
				if (sumOfDigits(chef) < sumOfDigits(morty))
					m++;
				if (sumOfDigits(chef) == sumOfDigits(morty)) {
					m++;c++;
				}
			}
			if(c > m) System.out.println("0 "+c);
			if(c < m) System.out.println("1 "+m);
			if(c == m) System.out.println("2 "+c);
		}

	}

}
