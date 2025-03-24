import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] list = new int[n];
		
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int sum = a + b;
			list[i] = sum;
		}
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
		sc.close();
	}
}
