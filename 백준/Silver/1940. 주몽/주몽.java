import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        int start = 0;
        int end =  n-1;
        int count = 0;
        while (start < end) {
            if(a[start] + a[end] < m) {
                start++;
            }else if(a[start] + a[end] > m) {
                end--;
            }else {
                count++;
                start++;
                end--;
            }
        }
        System.out.println(count);
        br.close();

    }
}
