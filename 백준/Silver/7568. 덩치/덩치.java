import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][2];
		
		for (int i = 0; i < n; i++) {
			arr[i][0] = sc.nextInt();	// weight
			arr[i][1] = sc.nextInt();	// height
		}
		
		
		int rank = 1;
		int[] arr2 = new int[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					rank++;
				}else if((arr[i][0] > arr[j][0] && arr[i][0] < arr[j][0]) || (arr[i][0] < arr[j][0] && arr[i][1] > arr[j][1])) {
					continue;
				}
			}
			arr2[i] = rank;
			rank = 1;
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		sc.close();
	}
}
