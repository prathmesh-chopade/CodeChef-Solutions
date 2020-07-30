import java.util.Scanner;

class CHEFSTEP {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int j = 0; j < T; j++) {
			int N = in.nextInt();
			int K = in.nextInt();
			String str = "";
			for (int i = 0; i < N; i++) {
				if (in.nextInt() % K == 0)
					str+="1";
				else
					str+="0";
			}
			System.out.println(str);
		}

	}

}