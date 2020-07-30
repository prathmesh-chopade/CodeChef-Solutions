import java.util.Scanner;

class ADAKING {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test --> 0){
            int n = sc.nextInt();
            for(int i = 0 ;i < 8;i++){
                for(int j = 0;j < 8;j++){
                    if((i == 0 && j == 0)){
                        System.out.print("O");
                        n--;
                    }else if(n != 0){
                        System.out.print('.');
                        n--;
                    }else{
                        System.out.print('X');
                    }
                }
                System.out.println();
            }
        }            
    }
}
