import java.util.Scanner;

public class Main {
    static Integer[] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp = new Integer[n + 1];
        dp[0] = dp[1] = 0;
        int result = solve(n, 0);
        System.out.println(result);
        sc.close();
    }

    public static int solve(int n, int count) {
        if( n < 2 ){
            return count;
        }
        return Math.min(solve(n / 2, count + 1 + (n % 2)), solve(n / 3, count + 1 + (n % 3)));
    }
}
