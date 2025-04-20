import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long result = factorial(n);
		System.out.println(result);
		sc.close();
	}
	
	public static long factorial(int n) {
		if(n == 0) return 1;
		else {
			return n * factorial(n-1);
		}
	}
}
