import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    static int[][] wire;
    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        wire = new int[n][2];
        dp = new Integer[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            wire[i][0] = Integer.parseInt(st.nextToken());
            wire[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(wire, new Comparator<int[]>() {
           public int compare(int[] o1, int[] o2) {
               return o1[0] - o2[0];
           }
        });
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, solve(i));
        }
        System.out.println(n - max);

    }

    public static int solve(int v) {
        if(dp[v] == null){
            dp[v] = 1;
            for (int i = v + 1; i < dp.length; i++) {
                if(wire[v][1] < wire[i][1]){
                    dp[v] = Math.max(dp[v], solve(i) + 1);
                }
            }
        }
        return dp[v];
    }
}
