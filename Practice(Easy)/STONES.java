import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

class STONES
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0)
	    {
	        String j = br.readLine();
	        String st = br.readLine();
	        HashSet<Character> hs = new HashSet<>();
	        for(int i=0;i<j.length();i++)
	        {
	            if(!hs.contains(j.charAt(i)))
	            {
	                hs.add(j.charAt(i));
	            }
	        }
	        int cnt = 0;
	        for(int i=0;i<st.length();i++)
	        {
	            if(hs.contains(st.charAt(i)))
	            cnt++;
	        }
	        System.out.println(cnt);
	    }
	}
}