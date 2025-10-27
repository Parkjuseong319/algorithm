import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        long[] arr = new long[t];       // 결과값
        // 입력
        // 뒤에서부터 연산하는 것이 유리하고 빠르다
        for (int i = 0; i < t; i++) {
            int day = Integer.parseInt(br.readLine());
            int[] stock = new int[day];
            String[] money = br.readLine().split(" ");
            int max = stock[day-1];
            long profit = 0;
            for (int j = 0; j < day; j++) {
                stock[j] = Integer.parseInt(money[j]);
            }
            for (int j = day - 1; j >= 0; j--) {
                int num = stock[j];
                if(num > max){
                    max = num;
                }else{
                    profit += max - num;
                }
            }
            arr[i] = profit;
        }

        // 출력
        for (int i = 0; i < t; i++) {
            bw.write(arr[i] + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
