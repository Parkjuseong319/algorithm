import java.util.Scanner;

public class Main { // 백준 1032번 명령 프롬프트 문제.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String[] dirName = new String[n];

		for (int i = 0; i < n; i++) { // 파일명들 받기
			dirName[i] = sc.next();
			if (n == 1) {
				System.out.println(dirName[i]);
				System.exit(0);
			}
		}
		char[] result = new char[dirName[0].length()];


		for (int i = 0; i < dirName[0].length(); i++) { // 비교하여 result에 배열하기
			for (int j = 0; j < dirName.length; j++) {
				if (j == dirName.length - 1)
					break;
				else if (dirName[j].charAt(i) == dirName[j + 1].charAt(i)) {
					result[i] = dirName[j].charAt(i);
				} else {
					result[i] = '?';
					break;
				}
			}
		}
		for (

				int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
		}
		sc.close();
	}
}
