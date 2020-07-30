import java.util.Scanner;

class FSQRT {

	public static void main(String[] args) {
		
        Scanner br = new Scanner(System.in);
        int t = br.nextInt();
        while(t-- > 0) {
        	int num = br.nextInt();
        	System.out.println((int)Math.sqrt(num));
        }

	}

}
