import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());   // 랭크 개수
        int k = Integer.parseInt(st.nextToken());   // 등록 점수

        String[] rank = new String[n];
        int[] judgement = new int[n];

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            rank[i] = st.nextToken();
            judgement[i] = Integer.parseInt(st.nextToken());
        }

        // 이분탐색 알고리즘으로 찾기
        for(int i = 0; i < k; i++){
            int start = 0;
            int end = n - 1;
            int mid = 0;
            int score = Integer.parseInt(br.readLine());
            String result = "";
            if(score < judgement[0]){
                result = rank[mid];
                bw.write(result + "\n");
                continue;
            }
            while(start <= end){
                mid = (start + end) / 2;
                if(score > judgement[mid]){
                    start = mid + 1;
                }else if(score <= judgement[mid]){
                    result = rank[mid];
                    end = mid - 1;
                }else{
                    result = rank[mid];
                    end = mid - 1;
                }
            }
            bw.write(result + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
