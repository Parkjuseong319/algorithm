import java.util.Scanner;

public class Main {	// 백준 11655번
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			if((ch[i] >= 65 && ch[i] < 91 ) && (ch[i] + 13) < 91) ch[i] += 13;
			else if((ch[i] >= 65 && ch[i] < 91 ) && (ch[i]+13 > 90)) ch[i] = (char)(ch[i]-13);	// 문제 있음
			else if((ch[i] >= 97 && ch[i] < 123) && (ch[i]+13) < 123) ch[i] += 13;
			else if((ch[i] >= 97 && ch[i] < 123) && (ch[i]+13 > 122)) ch[i] = (char)(ch[i]-13);	// 문제 있음
		}
		
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
		sc.close();
	}
}
