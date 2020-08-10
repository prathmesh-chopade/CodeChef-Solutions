import java.util.Scanner;

class CHEFSTLT {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		in.nextLine();
		while (t-- > 0) {
			int max = 0, min = 0;
			String s1 = in.nextLine();
			String s2 = in.nextLine();
			for (int i = 0; i < s1.length(); i++) {
				char s1char = s1.charAt(i);
				char s2char = s2.charAt(i);
				if(s1char != s2char || (s1char == '?' && s2char == '?')) max++;
				if(s1char != '?' && s2char != '?') {
					if(s1char != s2char) min++;
				}
			}
			System.out.println(min+" "+max);
		}

	}

}
