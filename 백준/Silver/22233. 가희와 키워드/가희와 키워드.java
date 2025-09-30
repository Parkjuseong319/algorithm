import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashSet<String> keywords = new HashSet<>();
        for (int i = 0; i < n; i++) {
            keywords.add(br.readLine());
        }

        for (int i = 0; i < m; i++) {
            String[] tokens = br.readLine().split(",");
            int count = 0;
            for (int j = 0; j < tokens.length; j++) {
                if(keywords.contains(tokens[j])) {
                    keywords.remove(tokens[j]);
                }
            }
            int answer = keywords.size();
            bw.write(answer + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
