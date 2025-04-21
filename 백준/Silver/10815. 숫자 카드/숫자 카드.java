import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Set<Integer> set = new TreeSet<Integer>();
		for (int i = 0; i < n; i++) {
			set.add(sc.nextInt());
		}
		
		int m = sc.nextInt();
		int[] set2 = new int[m];
		for (int i = 0; i < m; i++) {
			set2[i] = sc.nextInt();
		}
		
		for (int i = 0; i < set2.length; i++) {
			if(set.contains(set2[i])) {
				System.out.print(1 + " ");
				
			}else System.out.print(0 + " ");
		}
		sc.close();
	}
}
