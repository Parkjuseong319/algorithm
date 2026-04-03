import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int minus;
    static int zero;
    static int one;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        split(0, 0, n);
        System.out.println(minus + "\n" + zero + "\n" + one);
        br.close();
    }

    public static void split(int x, int y, int size) {
        int number = check(x, y, size);

        if (number == -1) {
            minus++;
        }else if(number == 0) {
            zero++;
        }else if(number == 1) {
            one++;
        }else {
            int newSize = size / 3;

            // 첫번째 줄
            split(x, y, newSize);
            split(x + newSize, y, newSize);
            split(x + newSize * 2, y, newSize);

            // 두번째 줄
            split(x, y + newSize, newSize);
            split(x + newSize, y + newSize, newSize);
            split(x + newSize * 2, y + newSize, newSize);

            // 세번째 줄
            split(x, y + newSize * 2, newSize);
            split(x + newSize, y + newSize * 2, newSize);
            split(x + newSize * 2, y + newSize * 2, newSize);
        }
    }

    public static int check(int x, int y, int size) {
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (arr[i][j] != arr[x][y]) return -2;
            }
        }

        return arr[x][y];
    }
}
