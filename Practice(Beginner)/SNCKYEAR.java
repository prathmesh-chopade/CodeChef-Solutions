import java.util.Scanner;

class SNCKYEAR {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = Integer.parseInt(in.nextLine());
		String s = "2010,2015,2016,2017,2019";
		while (t-- > 0) {
			if (s.contains(in.nextLine().trim())) {
				System.out.println("HOSTED");
			} else {
				System.out.println("NOT HOSTED");
			}
		}

	}

}
