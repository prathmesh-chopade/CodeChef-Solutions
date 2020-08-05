import java.util.Scanner;

class ZCOSCH {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int r = in.nextInt();
		if (r >= 1 && r <= 50)
			System.out.println(100);
		else if (r > 50 && r <= 100)
			System.out.println(50);
		else
			System.out.println(0);
	}

}
