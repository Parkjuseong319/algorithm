import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String s = br.readLine();
            String[] split = s.split(" ");
            int a = Integer.parseInt(split[0]);
            int b = Integer.parseInt(split[1]);
            int sum = a + b;
            
            bw.write(sum + "\n");
            
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
