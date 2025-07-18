import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=1) {
            System.out.println(0);
            return;
        } else if (n==3) {
            System.out.println(1);
            return;
        }
        List<Boolean> list = new ArrayList<Boolean>(n+1);
        // 0번째, 1번째는 소수가 아니므로 false
        list.add(false);
        list.add(false);
        for (int i = 2; i <= n; i++) {
            list.add(i, true);
        }
        // 에라토스테네스의 체 알고리즘에 의해 n=120일 경우 11^2 보다 n이 작으므로 11보다 작은 수의 소수의 배수들만 지워도 된다.
        for (int i = 2; (i*i) <= n; i++) {
            if(list.get(i)){
                for(int j=i*i; j<=n; j+=i){
                    list.set(j, false);
                }
            }
        }
        // 소수들만 담을 리스트 생성
        List<Integer> prime = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)){
                prime.add(i);
            }
        }
        // 투 포인터와 누적합으로 연산하기
        // 누적합
        int[] sum = new int[prime.size()+1];
        sum[0] = 0;
        for (int i = 1; i <= prime.size(); i++) {
            sum[i] = sum[i-1] + prime.get(i-1);
        }
        // 투 포인터
        int start = 0;
        int end = 0;
        int count = 0;
        int temp = 0;
        while (prime.size() >= end) {
            temp = sum[end]- sum[start];
            if(temp == n){
                count++;
                end++;
            }else if(temp > n){
                start++;
            }else {
                end++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
