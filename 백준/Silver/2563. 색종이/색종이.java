import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] field = new int[100][100];
		int n = sc.nextInt();
		int area = 0;
		
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			for (int j = y; j < y+10; j++) {
				for (int k = x; k < x+10; k++) {
					field[k][j] = 1;
				}
			}
		}
		for (int j = 0; j < field.length; j++) {
			for (int k = 0 ; k < field.length; k++) {
				if(field[j][k] == 1) {
					area += 1;
				}
			}
		}
		
		System.out.println(area);
	}

}
