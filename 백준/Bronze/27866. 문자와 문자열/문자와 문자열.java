import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] arr = in.readLine().toCharArray();
        int i = Integer.parseInt(in.readLine());
        out.write(arr[i-1]);
        out.flush();
        out.close();
        in.close();
    }
}
