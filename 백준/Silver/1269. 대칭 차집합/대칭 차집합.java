import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[m];
		Set<Integer> aset = new TreeSet<Integer>();
		Set<Integer> bset = new TreeSet<Integer>();
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			aset.add(a[i]);
		}
		for (int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
			bset.add(b[i]);
		}
		
		// A - B
		for (int i = 0; i < b.length; i++) {
			if(aset.contains(b[i])) {
				aset.remove(b[i]);
			}
		}
		// B - A
		for (int i = 0; i < a.length; i++) {
			if(bset.contains(a[i])) {
				bset.remove(a[i]);
			}
		}
		System.out.println(aset.size() + bset.size());
		
		sc.close();
	}
}
