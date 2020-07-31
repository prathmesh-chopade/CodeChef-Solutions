import java.util.*;
import java.lang.*;
import java.io.*;

class ZCO14003 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		long t = scan.nextLong();
		List<Long> list = new ArrayList<Long>();
		for(int i=0;i<t;i++){
		    list.add(scan.nextLong());
		}
		Collections.sort(list);
		long max = Long.MIN_VALUE;
		long val;
		int size = list.size();
		for(int i=0;i<t;i++){
		    val = list.get(i);
		    val = val * (size-i);
		    if(max<val)max= val;
		}
		System.out.println(max);
	}

}
