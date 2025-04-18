import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[9][9];
		int row = 0;
		int col = 0;
		int max = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				int a = sc.nextInt();
				if(max < a) {
					max = a;
					row = i;
					col = j;
				}
			}
		}
		System.out.println(max + "\n" + (row+1) + " " + (col+1));
		sc.close();
	}
}
