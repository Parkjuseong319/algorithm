import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static int max = Integer.MIN_VALUE;
    public static int min = Integer.MAX_VALUE;
    public static int[] operater = new int[4];
    public static int[] arr;
    public static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        // 연산자. 배열 순서대로 +, -, *, /
        for (int i = 0; i < 4; i++) {
            operater[i] = Integer.parseInt(st.nextToken());
        }
        dfs(arr[0], 1);
        bw.write(max + "\n" + min);
        bw.flush();
        bw.close();
        br.close();
    }

    public static void dfs(int num, int idx) {
        if(idx == n){
            max = Math.max(max, num);
            min = Math.min(min, num);
            return;
        }
        for (int i = 0; i < 4; i++) {
            if (operater[i] > 0) {
                operater[i]--;
                switch (i) {
                    case 0: dfs(num + arr[idx], idx+1); break;
                    case 1: dfs(num - arr[idx], idx+1); break;
                    case 2: dfs(num * arr[idx], idx+1); break;
                    case 3: dfs(num / arr[idx], idx+1); break;
                }
                operater[i]++;
            }
        }
    }
}
