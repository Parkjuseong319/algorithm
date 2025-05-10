import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max = (a > b)? (a>c ? a:c): (b>c ? b:c);
		int result = 0;
		if(a == b && b == c) {
			result = a + b + c;
		} else if(((a+b+c-max)*2 - 1) > (a+b+c)) {
			result = a + b + c;
		}
		else {
			result = (a+b+c-max)*2 - 1;
		}
		System.out.println(result);
		sc.close();
	}
}
