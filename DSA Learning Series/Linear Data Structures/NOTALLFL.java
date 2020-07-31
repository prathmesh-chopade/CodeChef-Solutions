import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

class NOTALLFL
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));)
	    {
	        int t=Integer.parseInt(br.readLine().trim());
	        while(t-->0)
	        {
	            String s1[]=br.readLine().split(" ");
	            int n=Integer.parseInt(s1[0].trim());
	            int k=Integer.parseInt(s1[1].trim());
	            
	            String s2[]=br.readLine().split(" ");
	            
	            HashSet<Integer> hs=new HashSet<Integer>();
	            ArrayList<Integer> al=new ArrayList<Integer>();
	            
	            int max=0;
	            
	            for(int i=0;i<n;i++)
	            {
	               int x=Integer.parseInt(s2[i].trim());
	               hs.add(x);
	               al.add(x);
	               if(hs.size()==k)
	               {
                       int rem=al.get(0);
                       al.remove(0);
                       if(!al.contains(rem))
                           hs.remove(rem);
	               }
	               max=Math.max(al.size(),max);
	               
	            }
	            
	            
	            
	            System.out.println(max);
	            
	        }
	    }
	    catch(Exception e)
	    {
	        
	    }
	}
}
