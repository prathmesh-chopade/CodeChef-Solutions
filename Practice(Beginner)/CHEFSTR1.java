import java.util.Scanner;

class CHEFSTR1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		long t = in.nextInt();
		while(t-- > 0) {
			long total = 0;
			long n = in.nextInt();
			long a = in.nextInt();
			n--;
			while(n-- > 0) {
				int b = in.nextInt();
				long dif = Math.abs(a-b);
				a = b;
				if(dif>1){
					dif-=1;
					total+=dif;
	            }
			}
			System.out.println(total);
		}
		
	}

}
