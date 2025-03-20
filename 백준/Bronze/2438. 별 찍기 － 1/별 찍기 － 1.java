import java.util.Scanner;

public class Main {
	// 백준 별찍기 2438번 문제
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String star = "*";
		
		for (int i = 0; i < n; i++) {
			System.out.println(star);
			star += "*";
		}
	}
}