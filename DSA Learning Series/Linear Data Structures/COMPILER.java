import java.util.Scanner;
import java.util.Stack;

class COMPILER {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = Integer.parseInt(in.nextLine());
		for (int i = 0; i < t; i++) {
			String str = in.nextLine();
			long top = 0, count = 0, tmpCount = 0;
			for (long j = 0; j < str.length(); j++) {
				if (str.charAt((int) j) == '<')
					top++;
				else {
					top--;
					if (top < 0)
						break;
					tmpCount++;
					if (top == 0) {
						count = tmpCount;
					}
				}
			}
			System.out.println(count * 2);
		}
	}
}
