import java.util.Scanner;

class CHN15A {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-- > 0) {
			int n = in.nextInt();
			int k = in.nextInt();
			int count = 0;
			while(n-- > 0) {
				int v = in.nextInt();
				if((v+k)%7 == 0) count++;
			}
			System.out.println(count);
		}

	}

}
