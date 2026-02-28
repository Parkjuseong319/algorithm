import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        // 이진 탐색을 위해 정렬 후 탐색시작
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] res = new int[m];
        for(int i = 0; i < m; i++) {
            int a = Integer.parseInt(st.nextToken());
            int left = 0;
            int right = arr.length - 1;
            int mid = 0;
            while(left <= right) {
                mid = (left + right) / 2;
                if(arr[mid] > a) { right = mid - 1; }
                else if(arr[mid] < a) { left = mid + 1; }
                else { res[i] = 1;
                left = mid + 1;}
            }
        }
        for(int i = 0; i < m; i++) {
            bw.write(res[i] + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
