import java.util.Scanner;

class CONFLIP {

	public static void main(String args[]) {
	Scanner in  = new Scanner(System.in);
	long n;
	int t = in.nextInt();
	for(int i=0;i<t;i++){
		int g = in.nextInt();
	    for(int i1=0;i1<g;i1++){
	    	int state = in.nextInt();
	    	int n1 = in.nextInt();
	    	int q = in.nextInt();
	        long c = 0;
	        if((n1%2)==1){
	            if(state==1) state=2;
	            else if(state==2) state=1;
					if (q == state)
						c = (n1 / 2)+1;
	            else c=n1/2;
	        }
	        else if(n1%2==0){
	            c=n1/2;
	        }
	        System.out.println(c);
	    }
	}
	}

}
