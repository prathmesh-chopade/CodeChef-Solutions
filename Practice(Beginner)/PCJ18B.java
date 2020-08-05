import java.util.Scanner;

class PCJ18B {

	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
	int t  =in.nextInt();
	while(t-- > 0) {
		int n = in.nextInt();
		int total = 0;
		for(int i=1;i<=n;i+=2) {
			total += ((n-i)+1) * ((n-i)+1);
		}
		System.out.println(total);
	}

	}

}
