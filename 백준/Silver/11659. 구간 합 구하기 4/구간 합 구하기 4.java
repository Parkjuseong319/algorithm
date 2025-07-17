import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int[] arr = new int[n+1];     // 누적합을 넣기
        arr[0] = 0;
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st1.nextToken()) + arr[i - 1];
        }
        for (int i = 0; i < m; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());
            int result = a>=b? arr[a]-arr[b-1]:arr[b]-arr[a-1];
            System.out.println(result);
        }
        br.close();
    }
}
