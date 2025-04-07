import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	// 공 개수
		int m = sc.nextInt();	// 교환 횟수
		int[] arr = new int[n];
		int temp = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		// 정렬하기
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}
}
