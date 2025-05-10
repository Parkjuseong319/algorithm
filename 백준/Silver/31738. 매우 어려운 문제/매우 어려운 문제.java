import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		long result = 0l;
		if(n < m) {
			result = factorial(n, m);
		}
		System.out.println(result);
		sc.close();
	}
	
	public static long factorial(long n, long m) {
		if(n > 0) {
			return (n * factorial(n-1, m)) % m;
		}else return 1;
	}
}
