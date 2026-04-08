import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, arr[i]);
        }
        // binary search
        int min = 0;
        while (min < max) {
            long sum = 0;
            int mid = (min + max) / 2;

            for (int i = 0; i < n; i++) {
                if (arr[i] > mid) {     // 나무를 자른 길이가 음수일 경우는 제외하기 위함
                    sum += arr[i] - mid;
                }
            }
            if(sum < m) {
                max = mid;
            }else {
                min = mid + 1;
            }
        }
        System.out.println(min - 1);
        br.close();
    }
}
