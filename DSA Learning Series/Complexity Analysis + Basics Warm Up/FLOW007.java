import java.util.Scanner;

class FLOW007 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int T = Integer.parseInt(in.nextLine());
		for(int i=0;i<T;i++) {
			String num = in.nextLine();
			StringBuilder str = new StringBuilder(num);
			System.out.println(Integer.parseInt(str.reverse().toString()));
		}

	}

}
