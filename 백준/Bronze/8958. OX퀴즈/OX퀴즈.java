import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] result = new int[n];
		int temp = 0;
		
		for (int i = 0; i < n; i++) {
			char[] arr = sc.next().toCharArray();
			for (int j = 0; j < arr.length; j++) {
				if(arr[j] == 'O') {
					temp++;
					result[i] += temp;
				}else if(arr[j] == 'X') {
					temp = 0;
				}
			}
			temp = 0;
			System.out.println(result[i]);
		}
		sc.close();
	}
}
