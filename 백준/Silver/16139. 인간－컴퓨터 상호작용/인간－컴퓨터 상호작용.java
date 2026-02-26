import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String context = br.readLine();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = null;

        // 문자열 누적합
        String[] str = new String[context.length() + 1];
        for(int i = 0; i < context.length() + 1; i++){
            str[i] = context.substring(0, i);
        }

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            char a = st.nextToken().charAt(0);
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            int res = 0;

            String s = str[r + 1].substring(l, r + 1);
            char[] arr = s.toCharArray();
            // 단순 계산. time over.
            for (int j = 0; j < arr.length; j++) {
                if(a == arr[j]) res++;
            }

            bw.write(res + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
