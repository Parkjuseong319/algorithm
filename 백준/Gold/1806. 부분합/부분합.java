import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int s = Integer.parseInt(input[1]);
        String[] strArr = br.readLine().split(" ");
        int[] arr = new int[n+1];
        // 누적합
        arr[0] = 0;
        for (int i = 1; i <= n; i++) {
            arr[i] = arr[i-1] + Integer.parseInt(strArr[i-1]);
        }
        // 투포인터
        int sum = 0;
        int end = 0;
        int start = 0;
        int min = n;    // 수열 길이가 n이기 때문
        while (end <= n) {
            sum = arr[end] - arr[start];
            if(sum < s){
                end++;
            }else if(sum > s){
                if(min >= end-start){
                    min = end-start;
                }
                start++;
            }else {
                if(min >= end-start){
                    min = end-start;
                }
                end++;
            }
        }
        if(arr[arr.length-1] < s){
            System.out.println(0);
        }else{
            System.out.println(min);
        }
        br.close();
    }
}
