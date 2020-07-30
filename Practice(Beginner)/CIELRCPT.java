import java.util.Scanner;

class CIELRCPT {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			int temp = n;
			int menu = 0;
			while (temp > 2048) {
				temp -= 2048;
				menu++;
			}
			while (temp != 0) {
				if (temp == 1) {
					menu++;
					break;
				}
				int section = (int) (Math.log((double) temp) / Math.log(2));
				menu++;
				temp -= Math.pow(2, section);
			}
			System.out.println(menu);
		}
	}
}
