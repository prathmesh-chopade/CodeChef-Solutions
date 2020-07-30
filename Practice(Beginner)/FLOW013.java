import java.util.Scanner;

class FLOW013 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			System.out.println((in.nextInt()+in.nextInt()+in.nextInt() == 180) ? "YES" : "NO");
		}

	}

}
