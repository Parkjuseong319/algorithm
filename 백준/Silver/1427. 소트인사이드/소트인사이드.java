import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		
		// 삽입정렬
		for (int i = 1; i < arr.length; i++) {
			char k = arr[i];
			int j = i -1;
			while(j >= 0 && k > arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = k;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		sc.close();
	}
}
