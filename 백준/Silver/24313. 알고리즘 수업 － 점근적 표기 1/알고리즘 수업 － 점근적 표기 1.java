import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		int a0 = sc.nextInt();
		int c = sc.nextInt();
		int n0 = sc.nextInt();
		boolean flag = false;
		
		int fn = a1*n0 + a0;
		int gn = c*n0;
		if(fn <= gn && a1 <= c) flag = true;
		if(flag) System.out.println(1);
		else System.out.println(0);
		sc.close();
	}
}
