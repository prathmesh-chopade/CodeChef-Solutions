import java.util.Scanner;

class DIFFSUM {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int N1 = in.nextInt();
		int N2 = in.nextInt();
		System.out.println((N1>N2) ? (N1-N2) : (N1+N2));

	}

}
