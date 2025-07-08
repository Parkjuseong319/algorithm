import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        boolean[] eat = new boolean[n];
        char[] person = br.readLine().toCharArray();
        int answer = 0;
        // 연산. 그리디 알고리즘 사용해야한다.

        for (int i = 0; i < n; i++) {
            if(person[i] == 'P'){
                for (int j = -k; j <= k; j++) {
                    if(i+j>=n) break;
                    if(i+j<0) continue;

                    if(person[i+j] == 'H' && !eat[i+j]){
                        eat[i+j] = true;
                        answer++;
                        break;
                    }
                }
            }
        }

        System.out.println(answer);
        br.close();
    }
}
