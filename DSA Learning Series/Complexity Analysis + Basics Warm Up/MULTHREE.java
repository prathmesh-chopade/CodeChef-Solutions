import java.util.*;

class MULTHREE {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			long k = in.nextLong();
			int d0 = in.nextInt();
			int d1 = in.nextInt();
			long sum;
			int lastdigit = (d0 + d1) % 10;
			sum = d0 + d1 + lastdigit;
			if (k == 2) {
				if ((d0 + d1) % 3 == 0) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
				continue;
			}
			long remdigit = k - 3;
			while (remdigit > 0) {
				if (lastdigit == 6) {
					long pair = remdigit / 4;
					remdigit -= pair * 4;
					sum += 20 * (pair);

					if (remdigit == 0) {

					} else if (remdigit == 1) {
						sum += 2;
					} else if (remdigit == 2) {
						sum += 6;

					} else if (remdigit == 3) {
						sum += 14;
					}
					remdigit = 0;
				} else if (lastdigit == 0) {
					remdigit = 0;
				} else {
					lastdigit = (lastdigit * 2) % 10;
					sum += lastdigit;
					remdigit--;
				}
			}
			if (sum % 3 == 0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
