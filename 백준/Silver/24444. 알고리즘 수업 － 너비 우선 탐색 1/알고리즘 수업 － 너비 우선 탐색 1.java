import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int[] checked;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        checked = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        // 오름차순 방문을 위한 정렬
        for (int i = 1; i <= n; i++) {
            Collections.sort(graph.get(i));
        }
        count = 1;
        bfs(r);

        for (int i = 1; i < checked.length; i++) {
            System.out.println(checked[i]);
        }
        br.close();
    }

    public static void bfs(int r) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(r);
        checked[r] = count++;

        while (!q.isEmpty()) {
            int u = q.poll();
            for (int v : graph.get(u)) {
                if (checked[v] == 0) {
                    checked[v] = count;
                    q.offer(v);
                    count++;
                }
            }
        }
    }
}
