import java.util.Scanner;

class CHEFARRP {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-- > 0) {
			int n = in.nextInt();
			long arr[] = new long[n];
			int count = 0;
			for(int i=0;i<n;i++) {
				arr[i] = in.nextLong();
			}
			for(int i=0;i<n;i++) {
				long total = arr[i],product = arr[i];
				for(int j=i+1;j<n;j++) {
					total += arr[j];
					product *= arr[j];
					if(total == product) {
						count++;
					}
				}
			}
			System.out.println(count+n);
		}

	}

}
