import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            long answer = combination(n, m);
            System.out.println(answer);
        }
    }

    public static long combination(int n, int m){
        int a = m - n;
        if(a == 0) a = 1;
        BigInteger num = BigInteger.valueOf(1);
        for(int i = n + 1 ; i <= m; i++){
            num = num.multiply(BigInteger.valueOf(i));
        }
        BigInteger denom = BigInteger.valueOf(1);
        for(int i = 1; i <= a; i++){
            denom = denom.multiply(BigInteger.valueOf(i));
        }
        long answer = num.divide(denom).longValue();
        return answer;
    }
}
