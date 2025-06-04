import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] sw = new int[n];
		for (int i = 0; i < sw.length; i++) {
			sw[i] = sc.nextInt();
		}
		int student = sc.nextInt();
		
		for (int i = 0; i < student; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			switch (a) {
			case 1:
				for (int j = 0; j < sw.length; j++) {
					if((j+1) % b == 0) {
						sw[j] = (sw[j] == 1)? 0:1;
					}
				}
				break;
			case 2:
				for (int j = 1; j < sw.length; j++) {
					if(b-1-j < 0 || b-1+j > sw.length-1) break;
					if(sw[b-1-j] == sw[b-1+j]) {
						sw[b-1-j] = (sw[b-1-j] == 1)? 0:1;
						sw[b-1+j] = (sw[b-1+j] == 1)? 0:1;
					}else break;
				}
				sw[b-1] = (sw[b-1] == 1)? 0:1;
				break;
			}
		}
		
		for (int i = 0; i < sw.length; i++) {
			System.out.print(sw[i] + " ");
			if((i+1) % 20 == 0) System.out.println();
		}
		sc.close();
	}
}
