import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int n, m;
    static String str[], result;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        str = br.readLine().split(" ");
        visited = new boolean[m];

        Arrays.sort(str);

        result = "";
        dfs(0, 0);

    }

    public static void dfs(int l, int c) {
        if(result.length() == n){
            int ja = 0;
            int mo = 0;
            for(int i = 0; i < n; i++){
                char ch = result.charAt(i);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    mo++;
                }else{
                    ja++;
                }
            }

            if(ja < 2 || mo < 1){
                return;
            }

            System.out.println(result);
            return;
        }

        for (int i = c; i < m; i++) {
            visited[i] = true;
            result+=str[i];
            dfs(l+1, i+1);
            visited[i] = false;
            result = result.substring(0,result.length()-1);
        }
    }
}
