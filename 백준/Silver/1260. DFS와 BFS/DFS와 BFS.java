import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        visited = new boolean[n + 1];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        for (int i = 0; i <= n; i++) {  // 오름차순으로 방문
            Collections.sort(graph.get(i));
        }
        dfs(r);
        System.out.println();

        visited = new boolean[n + 1];
        bfs(r);
        br.close();
    }

    public static void dfs(int v) {
        visited[v] = true;
        System.out.print(v + " ");
        for (int i = 0; i < graph.get(v).size(); i++) {
            int u = graph.get(v).get(i);
            if (!visited[u]) {
                dfs(u);
            }
        }
    }

    public static void bfs(int r) {
        Queue<Integer> q = new LinkedList<>();
        visited[r] = true;
        q.offer(r);

        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.print(u + " ");
            for (int v : graph.get(u)) {
                if (!visited[v]) {
                    visited[v] = true;
                    q.offer(v);
                }
            }
        }
    }
}
