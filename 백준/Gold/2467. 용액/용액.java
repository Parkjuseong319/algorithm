import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] str = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        int sum = 0;
        int end = n-1;
        int start = 0;
        int min = Integer.MAX_VALUE;
        int[] answer = new int[2];
        while (end > start) {
            sum = Math.abs(arr[start] + arr[end]);
            if (sum < min) {
                min = sum;
                answer[0] = arr[start];
                answer[1] = arr[end];
                if(Math.abs(arr[start]) > Math.abs(arr[end])) {
                    start++;
                }else if(Math.abs(arr[start]) < Math.abs(arr[end])) {
                    end--;
                }else{
                  
                    break;
                }
            }else if(sum > min){
                if(Math.abs(arr[start]) > Math.abs(arr[end])) {
                    start++;
                }else if(Math.abs(arr[start]) < Math.abs(arr[end])) {
                    end--;
                }else {
                  end--;
                  start++;
                    continue;
                }
            }else if(start != end && sum == 0){
                answer[0] = arr[start];
                answer[1] = arr[end];
              break;
            }else{
              if(Math.abs(arr[start]) > Math.abs(arr[end])) {
                    start++;
                }else if(Math.abs(arr[start]) < Math.abs(arr[end])) {
                    end--;
                }else{
                continue;
                }
              
            }
        }
        System.out.println(answer[0] + " " + answer[1]);
        br.close();
    }
}
