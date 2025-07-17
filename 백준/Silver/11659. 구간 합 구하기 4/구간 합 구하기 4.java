import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n+1];     // 누적합을 넣기
        arr[0] = 0;
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken()) + arr[i - 1];
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            String result = Integer.toString(arr[b]-arr[a-1]);
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
