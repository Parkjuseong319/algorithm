import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        List<Integer> queue = new LinkedList<>();
        for (int i = n - 1; i >= 0; i--) {
            queue.add(arr[i], i + 1);
        }


        StringBuilder sb = new StringBuilder();
        for (int num : queue) {
            sb.append(num).append(" ");
        }
        System.out.println(sb);
        br.close();

    }
}
