import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ch = sc.next().toCharArray();
		int length = 0;
		for (int i = 0; i < ch.length; i++) {
			if(i >= 1) {
			switch (ch[i]) {
			case '=': {
				if(i >= 2) {
					if(ch[i-1] == 'z' && ch[i-2] == 'd') length += 2;
					else if(ch[i-1] == 'c' || ch[i-1] == 'z' || ch[i-1] == 's' ) length++;
					break;
				}
				if(ch[i-1] == 'c' || ch[i-1] == 'z' || ch[i-1] == 's' ) length++;
				break;
			}
			case '-': {
				if(ch[i-1] == 'c' || ch[i-1] == 'd') length++;
				break;
			}
			case 'j':{
				if(ch[i-1] == 'l' || ch[i-1] == 'n') length++;
				break;
			}
			}
			}
		}
		
		int result = ch.length - length;
		System.out.println(result);
		sc.close();
	}
}
