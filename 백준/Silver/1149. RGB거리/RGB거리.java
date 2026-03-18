import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    final static int red = 0;
    final static int green = 1;
    final static int blue = 2;

    static int[][] rgb;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n][3];
        rgb = new int[n][3];
        StringTokenizer st = null;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
        }
        rgb[0][0] = arr[0][0];
        rgb[0][1] = arr[0][1];
        rgb[0][2] = arr[0][2];
        System.out.println(Math.min(solution(n-1, red), Math.min(solution(n-1, green), solution(n-1, blue))));
        br.close();
    }

    public static int solution(int n, int color) {

        if(rgb[n][color] == 0) {
            switch (color) {
                case red:
                    rgb[n][red] = Math.min(solution(n - 1, green), solution(n - 1, blue)) + arr[n][red];
                    break;
                case green:
                    rgb[n][green] = Math.min(solution(n - 1, red), solution(n - 1, blue)) + arr[n][green];
                    break;
                case blue:
                    rgb[n][blue] = Math.min(solution(n - 1, red), solution(n - 1, green)) + arr[n][blue];
                    break;
            }
        }

        return rgb[n][color];
    }
}
