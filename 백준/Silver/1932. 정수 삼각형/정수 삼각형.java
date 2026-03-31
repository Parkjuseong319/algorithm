import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static Integer[][] dp;
    static int[][] arr;
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        dp = new Integer[N][N];
        arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < i + 1; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < N; i++) {
            dp[N-1][i] = arr[N-1][i];
        }

        System.out.println(solution(0, 0));
        br.close();

    }

    public static int solution(int n, int k) {
        if(n == N - 1) return dp[n][k];
        if(dp[n][k] == null){
            dp[n][k] = Math.max(solution(n + 1, k), solution(n + 1, k + 1)) + arr[n][k];
        }
        return dp[n][k];
    }
}
