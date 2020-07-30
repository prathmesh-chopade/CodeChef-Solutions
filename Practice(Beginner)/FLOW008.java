import java.util.Scanner;

class FLOW008 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-- > 0) {
			int n = in.nextInt();
			System.out.println((n<10) ? "Thanks for helping Chef!" : "-1");
		}

	}

}
