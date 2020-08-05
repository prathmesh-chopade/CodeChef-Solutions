import java.util.Scanner;

class MATCHES {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int arr[] = {6,2,5,5,4,5,6,3,7,6};
		while(t-- > 0) {
			int n = in.nextInt() + in.nextInt();
			int ans = 0;
			while(n!=0) {
				ans += arr[n%10];
				n /= 10;
			}
			System.out.println(ans);
		}
	}

}
