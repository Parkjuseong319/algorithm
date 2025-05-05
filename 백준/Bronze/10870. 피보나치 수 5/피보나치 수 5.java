import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = fivonachi(n);
		System.out.println(result);
		sc.close();
	}
	
	public static int fivonachi(int n) {
		if(n < 2) {
			if(n==1) return 1;
			else if(n==0) return 0;
			else return n;
		}
		return fivonachi(n-1) + fivonachi(n-2);
	}
}
