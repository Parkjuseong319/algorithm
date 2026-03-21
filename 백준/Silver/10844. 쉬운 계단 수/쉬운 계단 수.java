import java.util.Scanner;

public class Main {
    static long[][] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp = new long[n+1][10];
        for(int i = 0; i < 10; i++){
            dp[1][i] = 1l;
        }
        long result = 0;
        for(int i = 1; i <= 9; i++){
            result += solution(n, i);
        }

        System.out.println(result % 1000000000);
        sc.close();
    }

    public static long solution(int digit, int num){
        if(digit == 1){
            return dp[digit][num];
        }
        if(dp[digit][num] == 0){
            if(num == 0){
                dp[digit][num] = solution(digit - 1, 1);
            } else if (num == 9) {
                dp[digit][num] = solution(digit - 1, 8);
            }else{
                dp[digit][num] = solution(digit - 1, num - 1) + solution(digit - 1, num + 1);
            }
        }
        return dp[digit][num] % 1000000000;
    }
}
