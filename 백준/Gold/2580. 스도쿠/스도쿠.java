import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        arr = new int[9][9];
        // 스도쿠 판 입력
        for ( int i = 0 ; i < 9 ; i++ ){
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < 9 ; j++ ){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0, 0);
        br.close();
    }

    public static void dfs(int row, int col){
        if(col == 9){
            dfs(row + 1, 0);
            return;
        }

        if(row == 9){
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }

            // 출력 뒤 시스템을 종료한다.
            System.exit(0);
        }

        if(arr[row][col] == 0){
            for(int i = 1 ; i <= 9 ; i++){
                if(possibility(row, col, i)){
                    arr[row][col] = i;
                    dfs(row, col + 1);
                }
            }
            arr[row][col] = 0;
            return;
        }

        dfs(row, col + 1);

    }

    public static boolean possibility(int row, int col, int value) {

        // 같은 행에 있는 원소들 중 겹치는 열 원소가 있는지 검사
        for (int i = 0; i < 9; i++) {
            if (arr[row][i] == value) {
                return false;
            }
        }

        // 같은 열에 있는 원소들 중 겹치는 행 원소가 있는지 검사
        for (int i = 0; i < 9; i++) {
            if (arr[i][col] == value) {
                return false;
            }
        }

        // 3*3 칸에 중복되는 원소가 있는지 검사
        int set_row = (row / 3) * 3; // value가 속한 3x3의 행의 첫 위치
        int set_col = (col / 3) * 3; // value가 속한 3x3의 열의 첫 위치

        for (int i = set_row; i < set_row + 3; i++) {
            for (int j = set_col; j < set_col + 3; j++) {
                if (arr[i][j] == value) {
                    return false;
                }
            }
        }

        return true; // 중복되는 것이 없을 경우 true 반환
    }
}
