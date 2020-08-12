import java.util.Scanner;

class BRLADDER {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-- > 0)
		{
		    int x = in.nextInt();
		    int y = in.nextInt();
		    int diff = Math.abs(x-y);
		    String res = diff > 2 ? "NO" : (diff == 2 ? "YES" : (Math.min(x,y) % 2 != 0 ? "YES" : "NO"));
		    System.out.println(res);
		}

	}

}
