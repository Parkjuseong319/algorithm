import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st1.nextToken());
        }
        // 슬라이딩 윈도우 알고리즘 사용해보자
        int max = 0;
        int sum = 0;
        int count = 1;
        for (int i = 0; i < N; i++) {
            sum += arr[i];
            if (i == X - 1)
                max = sum;
            if (i > X - 1) {
                sum -= arr[i - X];
                if (max < sum) {
                    max = sum;
                    count = 1;
                }
                else if (max == sum) {
                    count++;
                }
            }
        }
        if (max == 0){
            System.out.println("SAD");
        }else {
            System.out.println(max + "\n" + count);
        }
        br.close();
    }
}
