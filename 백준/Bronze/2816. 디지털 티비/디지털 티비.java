import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int kbs1 = 0;
		int kbs2 = 0;
		for (int i = 0; i < n; i++) {
			String channel = sc.next();
			if(channel.equals("KBS1")) kbs1 = i;
			if(channel.equals("KBS2")) kbs2 = i;
		}
		
		if(kbs1 > kbs2) kbs2++;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < kbs1; i++) {
			sb.append("1");
		}
		for (int i = kbs1; i > 0; i--) {
			sb.append("4");
		}
		for (int i = 0; i < kbs2; i++) {
			sb.append("1");
		}
		for (int i = kbs2-1; i > 0; i--) {
			sb.append("4");
		}
		System.out.println(sb.toString());
		sc.close();
	}
}
