import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int[] checked;
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int u = Integer.parseInt(st.nextToken());
            graph.get(v).add(u);
            graph.get(u).add(v);
        }
        for (int i = 1; i <= n; i++) {
            Collections.sort(graph.get(i), Collections.reverseOrder());
        }
        checked = new int[n + 1];
        count = 1;
        dfs(k);
        for (int i = 1; i <= n; i++) {
            System.out.println(checked[i]);
        }
        br.close();
    }

    public static void dfs(int v) {
        checked[v] = count;
        for (int i = 0; i < graph.get(v).size(); i++) {
            int u = graph.get(v).get(i);
            if (checked[u] == 0) {
                count++;
                dfs(u);
            }
        }
    }
}
