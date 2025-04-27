import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] A = sc.next().toCharArray();
		char[] B = sc.next().toCharArray();
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		for (int i = 2; i >= 0; i--) {
			sb1.append(A[i]);
			sb2.append(B[i]);
		}
		String strA = String.valueOf(sb1);
		String strB = String.valueOf(sb2);
		
		int a = Integer.parseInt(strA);
		int b = Integer.parseInt(strB);
		
		if(a > b) System.out.println(a);
		else System.out.println(b);
		sc.close();
	}
}
