import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			int r = sc.nextInt();
			String s = sc.next();
			char[] ch = s.toCharArray();
			for (int j = 0; j < ch.length; j++) {
				for (int k = 0; k < r; k++) {
					sb.append(ch[j]);
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
		sc.close();
	}
}
