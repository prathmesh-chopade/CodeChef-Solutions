import java.util.Scanner;

class ZCO12001 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		int depth = 0, depthpos = 0, maxlen = 0, lenpos = 0, lenctr = 0, depctr = 0, count = 0;
		int curlen = 0, curlenpos = 0, curdep = 0, curdeppos = 0;
		int tmp;

		for (int i = 0; i < n; i++) {
			tmp = in.nextInt();
			if (tmp == 1) {
				count++;
				curdep++;
				curdeppos = i;
				curlen++;
				curlenpos = i + 1 - curlen;
				if (curdep > depth) {
					depth = curdep;
					depthpos = curdeppos + 1;
				}
			} else {
				count--;
				curdep--;
				curdeppos = i;
				curlen++;
				curlenpos = i + 1 - curlen;
				if (count == 0) {
					lenpos = (curlen > maxlen) ? curlenpos + 1 : lenpos;
					maxlen = (curlen > maxlen) ? curlen : maxlen;

					curlen = 0;
				}
			}
		}
		System.out.println(depth + " " + depthpos + " " + maxlen + " " + lenpos);
	}
}
