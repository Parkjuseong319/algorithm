import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int white;
    static int blue;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        split(arr,0, 0, n - 1, n - 1);
        System.out.println(white + "\n" + blue);
        br.close();
    }

    public static void split(int[][] arr, int startX, int startY, int endX, int endY) {
        int color = check(arr, startX, startY, endX, endY);
        if(color == 1){
            blue++;
        }else if(color == 0){
            white++;
        }else{
            int midX = (startX + endX) / 2;
            int midY = (startY + endY) / 2;
            split(arr, startX, startY, midX, midY); // 4사분면
            split(arr, midX + 1, startY, endX, midY);   // 1사분면
            split(arr, startX, midY + 1, midX, endY);   // 3사분면
            split(arr, midX + 1, midY + 1, endX, endY); // 2사분면
        }
    }

    public static int check(int[][] arr, int startX, int startY, int endX, int endY) {
        for(int i = startY; i <= endY; i++) {
            for(int j = startX; j <= endX; j++) {
                if(arr[i][j] != arr[startY][startX]) {
                    return -1;
                }
            }
        }

        return arr[startY][startX];
    }
}
