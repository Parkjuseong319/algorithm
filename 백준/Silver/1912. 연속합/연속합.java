import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;
    static int max = Integer.MIN_VALUE;
    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[n];
        dp = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        dp[0] = arr[0];
        max = arr[0];

        solution(n - 1);
        System.out.println(max);
        br.close();
    }

    public static int solution(int n) {
        if(dp[n] == null){
            dp[n] = Math.max(solution(n - 1) + arr[n], arr[n]);

            max = Math.max(max, dp[n]);
        }

        return dp[n];
    }
}
