import java.io.*;

class LISDIGIT {
	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(in.readLine());
		 
		while (t-- > 0) {
			int n = Integer.parseInt(in.readLine().trim());
			String s = in.readLine();
			
			StringBuilder sb = new StringBuilder();
			
			for (int i = 0; i < s.length(); i++) {
				if(s.charAt(i) != ' ')
					sb.append(s.charAt(i));
			}
			
			System.out.println(sb);
		}
	}
}