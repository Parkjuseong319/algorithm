import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] s = str.split(",");
		int sum = 0;
		for (int i = 0; i < s.length; i++) {
			sum += Integer.parseInt(s[i]);
		}
		System.out.println(sum);
		sc.close();
	}
}
