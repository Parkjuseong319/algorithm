import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;
        String[] res = {"factor", "multiple", "neither"};
        while (true) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a == 0 && b == 0) break;
            if ( a < b ){
                if(b%a == 0){ bw.write(res[0] + "\n");}
                else{bw.write(res[2] + "\n");}
            }else {
                if(a%b == 0){ bw.write(res[1] + "\n");}
                else{bw.write(res[2] + "\n");}
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
