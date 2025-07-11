import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =1 , sum = 1, start = 1, end = 1;
        while (end != n) {
            if(sum == n){
                end++;
                sum = sum + end;
                count++;
            }else if(sum < n){
                end++;
                sum = sum + end;
            }else {
                sum = sum - start;
                start++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
