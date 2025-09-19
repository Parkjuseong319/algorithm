import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            arr2[i] = arr[i];
        }

        Arrays.sort(arr2);

        int rank = 0;
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(arr2[i])) {
                map.put(arr2[i], rank++);
            }
        }

        for (int i = 0; i < n; i++) {
            bw.write(map.get(arr[i])+ " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
