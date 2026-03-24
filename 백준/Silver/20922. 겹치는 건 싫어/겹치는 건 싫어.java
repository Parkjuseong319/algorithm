import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] count = new int[100001];
        int start = 0;
        int end = 0;
        int length = 0;
        while (end < n) {
            if(count[arr[end]] < k){
                count[arr[end]]++;
                end++;
                length = Math.max(length, end - start);
            }else {
                count[arr[start]]--;
                start++;
            }
        }
        System.out.println(length);
        br.close();
    }
}
