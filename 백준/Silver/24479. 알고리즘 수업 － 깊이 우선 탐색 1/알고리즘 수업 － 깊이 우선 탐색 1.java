import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static int count;
    static int[] checked;
    static ArrayList<ArrayList<Integer>> node = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        checked = new int[n + 1];
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        for (int i = 0; i <= n; i++) {
            node.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            node.get(u).add(v);
            node.get(v).add(u);
        }
        for (int i = 1; i <= n; i++) {
            Collections.sort(node.get(i));
        }

        count = 1;
        dfs(r);
        for (int i = 1; i < checked.length; i++) {
            System.out.println(checked[i]);
        }
    }

    public static void dfs(int v){
        checked[v] = count;
        for (int i = 0; i < node.get(v).size(); i++) {
            int newNode = node.get(v).get(i);
            if(checked[newNode] == 0){
                count++;
                dfs(newNode);
            }
        }
    }
}
