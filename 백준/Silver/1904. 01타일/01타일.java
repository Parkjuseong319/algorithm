import java.util.Scanner;

public class Main {
    public static int[] dp = new int[1000001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        int result = binaryTile(n);
        System.out.println(result);
        sc.close();
    }

    public static int binaryTile(int n){
        // 문제 규칙에 따라 만들면 가짓수가 피보나치 수열에 따라가는 패턴을 확인 할 수 있다.
        // n = 1 : 1, n = 2 : 2, n = 3 : 3, n = 4 : 5, n = 5 : 8, n = 6 : 13, ...
        // 처음에 재귀 방식으로 풀었으나 재귀 깊이가 깊어져 stackoverflow 발생
        for(int i = 3; i <= n; i++){
            dp[i] = (dp[i-1] + dp[i-2]) % 15746;
        }
        return dp[n];
    }
}
