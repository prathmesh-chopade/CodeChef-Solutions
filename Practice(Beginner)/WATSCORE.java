import java.util.Scanner;

class WATSCORE {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-- > 0) {
			int score[] = new int[12];
			int n = in.nextInt();
			while(n-- > 0) {
				int index = in.nextInt();
				int scorei = in.nextInt();
				if(score[index] < scorei && index < 9) score[index] = scorei;
			}
			int sum = 0;
			for(int i=0;i<score.length;i++) {
				sum += score[i];
			}
			System.out.println(sum);
		}

	}

}
