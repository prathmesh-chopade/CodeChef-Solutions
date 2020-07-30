import java.util.Scanner;

class LUCKFOUR {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		long t = Long.parseLong(in.nextLine());
		while(t-- > 0) {
			int count = 0;
			String s = in.nextLine();
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i) == '4') count++;
			}
			System.out.println(count);
		}

	}

}
