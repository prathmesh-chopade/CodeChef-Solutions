import java.util.Scanner;

class HS08TEST {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int draw = in.nextInt();
		float bal = in.nextFloat();
		if(bal>=draw+0.50 && draw%5==0)
		{
		    bal=(float) ((bal-draw)-0.50);
		    System.out.printf("%.2f", bal);
		}
		else
		{
			System.out.printf("%.2f", bal);
		}

	}

}
