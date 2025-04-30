import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		for (int i = 0; i < n; i++) {
			boolean flag = true;

			char[] ch = sc.next().toCharArray();
			for (int j = 1; j < ch.length-1; j++) {
				if (ch[j - 1] != ch[j]) {
					for (int k = j; k < ch.length; k++) {
						if (ch[j - 1] == ch[k]) {
							flag = false;
							break;
						}
					}
				}
				if(flag == false) break;
			}
			if (flag) {
				result++;
			}

		}
		System.out.println(result);
		sc.close();
	}
}
