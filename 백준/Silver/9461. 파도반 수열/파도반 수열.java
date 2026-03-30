import java.io.*;

public class Main {
    static Long[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        dp = new Long[101];
        dp[0] = 0l;
        dp[1] = 1l;
        dp[2] = 1l;
        dp[3] = 1l;
        dp[4] = 2l;
        dp[5] = 2l;
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            long result = solution(n);
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    public static long solution(int n) {
        if(dp[n] == null){
            dp[n] = solution(n-1) + solution(n-5);
        }
        return dp[n];
    }

}
