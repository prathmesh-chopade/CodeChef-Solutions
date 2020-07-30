import java.io.IOException;
import java.util.Scanner;

class PRB01 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		while (num-- > 0) {
			int i = in.nextInt();
			int k = 2;
			for (; k <= i / 2; k++) {
				if (i % k == 0)
					break;
			}
			if (k == (i / 2) + 1)
				System.out.println("yes");
			else
				System.out.println("no");
		}
	}
}