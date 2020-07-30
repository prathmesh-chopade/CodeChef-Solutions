import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class TSORT
{
	public static void main(String[] args) throws java.lang.Exception{
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int num=Integer.parseInt(br.readLine());
            if(num>=1 && num<=1000000){
                int[] arr=new int[num];
                for(int i=0;i<num;i++){
                    arr[i]=Integer.parseInt(br.readLine());
                }
                Arrays.sort(arr);
                for(int i:arr)
                    System.out.println(i);
            }

        }catch (Exception e){

        }
    }
}
