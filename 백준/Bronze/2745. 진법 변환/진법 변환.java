import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(in.readLine());
        char[] origin = st.nextToken().toCharArray();
        int B = Integer.parseInt(st.nextToken());
        // length: 34
        char[] arr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        int ans = 0;
        for (int i = 0; i < origin.length; i++) {
            int a = 0;
            for (int j = 0; j < B; j++) {
                if(origin[i] == arr[j]) {
                    a = j;
                }
            }
            ans += (int)a * Math.pow(B, origin.length - 1 - i);
        }
        out.write(ans+"\n");
        out.flush();
        out.close();
        in.close();
    }
}
