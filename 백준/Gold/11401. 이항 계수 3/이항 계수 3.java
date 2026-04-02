import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static long p = 1000000007l;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        long numer = factorial(n);
        // 분모 (k! * (n-k)!) mod p
        long denom = factorial(k) * factorial(n - k) % p;
        // n! * 분모의 역원((k! * (n-k)!) 
        System.out.println(numer * solve(denom, p - 2) % p);
    }

    public static long factorial(long n) {
        long res = 1;
        while (n > 1) {
            res = (res * n) % p;
            n--;
        }
        return res;
    }

    // n 밑, m 지수
    public static long solve(long n, long m) {
        long result = 1;
        while (m > 0) {
            // 지수가 홀 수면 반환하고자 하는 result에 곱해주도록 한다.
	    	// 지수가 모두 짝수라면 m가 1이 될 떄까지 n의 값이 제곱되다가 최종적으로 result에 담긴다.
            if( m % 2 == 1){
                result *= n;
                result %= p;
            }
            n *= n;
            n %= p;
            m /= 2;
        }
        return result;
    }
}
