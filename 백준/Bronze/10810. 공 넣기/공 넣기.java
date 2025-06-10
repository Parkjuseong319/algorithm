import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for (int a = 0; a < m; a++) {
			int i = sc.nextInt()-1;
			int j = sc.nextInt()-1;
			int k = sc.nextInt();
			for (int b = i; b <= j; b++) {
				arr[b] = k;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}
}
