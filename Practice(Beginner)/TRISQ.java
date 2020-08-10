import java.util.Scanner;

class TRISQ {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		in.nextLine();
		int memory[] = new int[10001];
		while (t-- > 0) {
			int b = in.nextInt();
			if (b <= 2) {
				System.out.println(0);
			} else {
				for (int i = 3; i <= b; i++) {
					if (memory[i] != 0) {
						continue;
					} else {
						int temp = (i - 2) / 2;
						memory[i] = temp + memory[i - 2];
					}

				}
				System.out.println(memory[b]);
			}
		}

	}

}
