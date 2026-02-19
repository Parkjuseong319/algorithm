import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int day = Integer.parseInt(st.nextToken());
        int range = Integer.parseInt(st.nextToken());
        int[] arr = new int[day];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < day; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int res = Integer.MIN_VALUE;
        for(int i = 0; i < day - range + 1; i++){
            int sum = 0;
            for(int j = 0; j < range; j++){
                sum += arr[i + j];
            }
            if(sum >= res) res = sum;
        }
        bw.write(res + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
