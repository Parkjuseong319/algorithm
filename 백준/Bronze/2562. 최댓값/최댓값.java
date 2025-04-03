import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[9];
		int maxIndex = 0;
		int max = 0;
		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n.length; i++) {
			if(n[i] > max) {
				max = n[i];
				maxIndex = i;
			}
		}
		maxIndex +=1;
		System.out.println(max + "\n" + maxIndex);
		sc.close();
	}
}
