import java.util.Scanner;

class TLG {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner br = new Scanner(System.in);
        int t = Integer.parseInt(br.nextLine());
        int leader = -1;
        int max = Integer.MIN_VALUE;
        int s1 = 0;
        int s2 = 0;
        while (t-- > 0) {
            String[] input = br.nextLine().split(" ");
            s1 += Integer.parseInt(input[0]);
            s2 += Integer.parseInt(input[1]);
            int currentLead = Math.abs(s1 - s2);
            int currentLeader = (s1 > s2) ? 1 : 2;
            if (currentLead > max) {
                max = currentLead;
                leader = currentLeader;
            }
        }
        System.out.print(leader + " " + max);
    }
}