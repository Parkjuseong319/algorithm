import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		if(m < 45) {
			h = h - 1;
			m += 60;
			if(h < 0) h += 24;
		}
		System.out.print(h + " " + (m-45));
		sc.close();
	}
}
