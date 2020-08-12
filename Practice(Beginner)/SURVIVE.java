import java.util.Scanner;

class SURVIVE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			double k = sc.nextDouble();
			int s = sc.nextInt();
			int dayavail = s-(s/7);
			if((n*(dayavail)) >= (k*s)) {
				System.out.println((int)Math.ceil(((k*s)/n)));
			}
			else {
				System.out.println("-1");
			}
		}
	}
}