import java.util.Scanner;
// n! / (n-k)!*k!
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int a = factorial(n);
		int b = factorial(n-k);
		int c = factorial(k);
		
		int result = a / (b * c);
		System.out.println(result);
		sc.close();
	}
	
	public static int factorial(int a) {
		if(a > 0) {
			return a * factorial(a-1);
		}else return 1;
	}
}
