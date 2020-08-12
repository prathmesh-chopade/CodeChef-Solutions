import java.util.Scanner;

class PPSUM {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0) {
			int d = in.nextInt();
			int k = in.nextInt();
			int sum = 0;
			while(d-- > 0) {
				sum = 0;
				for(int i=1;i<=k;i++) {
					sum+=i;
				}
				k = sum;
			}
			System.out.println(sum);
		}

	}

}
