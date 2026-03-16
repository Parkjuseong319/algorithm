import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<int[]> deque = new ArrayDeque<>();
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();

        // 덱에 배열 1부터 끝까지 값과 인덱스 값 입력
        for(int i = 1; i < n; i++){
            deque.offer(new int[]{arr[i], (i + 1)});
        }

        int move = arr[0];
        sb.append(1 + " ");

        for(int i = 1; i < n; i++){
            // 풍선 터뜨렸을때 값이 양수일때
            if(move > 0){

                for(int j = 1; j < move; j++){
                    deque.offer(deque.poll());
                }
                int[] moveArr = deque.poll();
                move = moveArr[0];
                sb.append(moveArr[1] + " ");
            }
            // 풍선 값이 음수일때
            else {
                for(int j = 1; j < -move; j++){
                    deque.offerFirst(deque.pollLast());
                }
                int[] moveArr = deque.pollLast();
                move = moveArr[0];
                sb.append(moveArr[1] + " ");
            }
        }
        System.out.println(sb);
        br.close();
    }

}
