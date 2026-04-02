import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            char[] chars = br.readLine().toCharArray();
            for (int j = 0; j < n; j++) {
                arr[i][j] = chars[j] - '0';
            }
        }

        split(arr, 0, 0, n - 1, n - 1);
        System.out.println(sb.toString());
        br.close();
    }

    public static void split(int[][] arr, int startX, int startY, int endX, int endY) {
        if(check(arr, startX, startY, endX, endY)){
            sb.append(arr[startX][startY]);
            return;
        }
        sb.append("(");
        int midX = (startX + endX) / 2;
        int midY = (startY + endY) / 2;
        split(arr, startX, startY, midX, midY);
        split(arr, startX, midY + 1, midX, endY);
        split(arr, midX + 1, startY, endX, midY);
        split(arr, midX + 1, midY + 1, endX, endY);
        sb.append(")");
    }

    public static boolean check(int[][] arr, int startX, int startY, int endX, int endY) {
        for(int i = startX; i <= endX; i++) {
            for(int j = startY; j <= endY; j++) {
                if(arr[i][j] != arr[startX][startY]){
                    return false;
                }
            }
        }

        return true;
    }
}
