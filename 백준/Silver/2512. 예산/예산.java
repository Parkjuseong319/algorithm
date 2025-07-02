import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] arr = new int[n];
        int m = Integer.parseInt(br.readLine());
        int sum = 0;
        int result = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
            sum += arr[i];
        }
        Arrays.sort(arr);
        // 연산 - 이분 탐색 알고리즘 사용해보자
        long start = 0;
        long end = arr[n - 1];
        long res = 0;
        if(sum <= m) {
            res = end;
        }else {
            while (start <= end) {
                long temp = 0;
                long middle = (start + end) / 2;
                for (int i = 0; i < n; i++) {
                    if (arr[i] > middle) {
                        temp += middle;
                    }else{
                        temp += arr[i];
                    }
                }
                if (temp > m) {
                    end = middle - 1;
                }else{
                    start = middle + 1;
                    res = middle > res ? middle : res;
                }
            }
        }
        System.out.println(res);
        br.close();
    }
}
