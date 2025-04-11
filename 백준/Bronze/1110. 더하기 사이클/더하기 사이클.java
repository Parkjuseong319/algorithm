import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = n;
		int count = 0;
		
		while (true) {
			sum = (sum%10) * 10 + ((sum / 10) + (sum % 10))%10;
			count++;
			if(n == sum) break;
		}
		System.out.println(count);
		sc.close();
	}
}
