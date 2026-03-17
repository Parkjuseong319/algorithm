import java.util.Scanner;

public class Main {
    static int[] dp;
    static int count1 = 1;
    static int count2 = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        dp = new int[N + 1];
        fibonachi1(N);
        fibonachi2(N);
        System.out.println(count1 + " " + count2);
    }
    public static int fibonachi1(int a) {
        if(a == 1 || a == 2) return 1;
        else {
            count1++;
            return fibonachi1(a - 1) + fibonachi1(a - 2);
        }
    }

    public static int fibonachi2(int a) {

        if(a == 1) return dp[1] = 1;
        if(a == 2) return dp[2] = 1;
        for(int i = 3; i <= a; i++) {
            count2++;
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[a];
    }
}
