import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int three = 0;
		int five = 0;
		
		while(n%5 != 0) {
			if( 3 < n && n < 5 ) {
				three = -1;
				break;
			}
			n -= 3;
			three++;
		}
		while(n != 0 && n >= 5) {
			n -= 5;
			five++;
		}
		System.out.println(three + five);
		sc.close();
	}
}
