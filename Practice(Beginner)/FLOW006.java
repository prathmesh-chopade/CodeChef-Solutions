import java.util.Scanner;

class FLOW006 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-- > 0) {
			int n = in.nextInt();
			int sum = 0;
			while(n != 0) {
				sum += n%10;
				n /= 10;
			}
			System.out.println(sum);
		}

	}

}
