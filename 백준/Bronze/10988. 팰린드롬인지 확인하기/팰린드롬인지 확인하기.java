import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ch = sc.next().toCharArray();
		boolean result = true;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ch[ch.length - i - 1]) {
				result = true;
				continue;
			} else {
				result = false;
				break;
			}
		}
		if (result) {
			System.out.println(1);
		} else
			System.out.println(0);
		sc.close();
	}
}
