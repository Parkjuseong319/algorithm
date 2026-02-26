import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String context = br.readLine();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = null;

        // 문자열 누적합. 2차원 배열 활용
        int[][] arr = new int[context.length() + 1][26];
        for(int i = 1; i <= context.length(); i++) {
            //탐색 중인 문자
            int searchChar = context.charAt(i-1)-'a';

            //알파벳 a부터 z까지 반복
            for(int j = 0; j < 26; j++) {
                //현재 탐색중인 문자보다 한단계 앞인 문자의 값(=이전 값)
                int beforeValue = arr[i-1][j];
                //알파벳과 탐색 중인 문자가 같으면 이전값 + 1,다르면 이전값으로 넣음
                arr[i][j] = ( j == searchChar ? beforeValue+1 : beforeValue);
            }
        }

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            char a = st.nextToken().charAt(0);
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken()) + 1;

            bw.write(arr[r][a - 'a'] - arr[l][a - 'a'] + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
