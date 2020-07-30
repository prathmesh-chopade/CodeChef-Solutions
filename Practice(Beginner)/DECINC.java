import java.util.Scanner;

class DECINC {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if(n%4 == 0) {
			System.out.println(++n);
		}
		else {
			System.out.println(--n);
		}

	}

}
