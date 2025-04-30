import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		for (int i = 0; i < n; i++) {
			boolean flag = true;
			String str = sc.next();
			for (int j = 0; j < str.length()-1; j++) {
				if (str.indexOf(str.charAt(j)) != str.lastIndexOf(str.charAt(j))) {
					for (int k = j; k < str.lastIndexOf(str.charAt(j))-1; k++) {
						if (str.charAt(k) != str.charAt(k+1)) {
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
