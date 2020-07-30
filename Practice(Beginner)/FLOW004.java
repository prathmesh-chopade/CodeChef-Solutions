import java.util.Scanner;

class FLOW004 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int t = Integer.parseInt(in.nextLine().trim());
		while(t-- > 0) {
			String s[] = in.nextLine().split("");
			System.out.println(Integer.parseInt(s[0])+Integer.parseInt(s[s.length-1]) );
		}

	}

}
