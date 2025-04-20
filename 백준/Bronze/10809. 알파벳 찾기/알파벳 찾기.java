import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] result = new int[26];
		Arrays.fill(result, -1);
		String str = sc.next();
		char[] ch = str.toCharArray();
		
		for (int i = 0; i < str.length(); i++) {
			if(result[ch[i]-'a'] == -1) {
				result[ch[i]-'a'] = i;				
			}
		}
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		sc.close();
		
		
	}
}
