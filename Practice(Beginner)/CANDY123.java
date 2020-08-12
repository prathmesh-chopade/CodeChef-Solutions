import java.util.Scanner;

class CANDY123 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-- > 0) {
			int l = in.nextInt();
			int b = in.nextInt();
			for(int i=1;i<=1000;i++) {
				if(i%2 == 1) {
					l -= i;
					if(l < 0) {
						System.out.println("Bob");
						break;
					}
				}
				else {
					b -= i;
					if(b < 0) {
						System.out.println("Limak");
						break;
					}
				}
			}
		}

	}

}
