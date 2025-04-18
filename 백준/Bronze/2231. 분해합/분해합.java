import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		boolean flag = false;
		for (int i = 1; i < n; i++) {
			sum = i;
			int j = i;
			while (j > 0) {
				sum += j % 10;
				j /= 10;
			}
			if (sum == n) {
				sum = i;
				flag = true;
				break;
			}
		}
		if(flag) System.out.println(sum);
		else System.out.println(0);
		sc.close();
	}
}
