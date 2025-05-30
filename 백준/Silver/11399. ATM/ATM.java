import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		
		int result = 0;
		int answer = 0;
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
			answer += result;
		}
		System.out.println(answer);
		sc.close();
	}
}
