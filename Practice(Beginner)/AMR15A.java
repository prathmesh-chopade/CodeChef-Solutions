import java.util.Scanner;

class AMR15A {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int l = 0,u = 0;
		while(n-- > 0) {
			int w = in.nextInt();
			if(w%2 == 0) l++;
			if(w%2 == 1) u++;
		}
		System.out.println((l>u) ? "READY FOR BATTLE" : "NOT READY");
	}

}
