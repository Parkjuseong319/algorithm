import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main { // 백준 14425번
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Set<String> set = new TreeSet<String>();
		String[] check = new String[m];
		int answer = 0;

		for (int i = 0; i < n; i++) {
			set.add(sc.next());
		}

		for (int i = 0; i < m; i++) {
			check[i] = sc.next();
		}

		Iterator it = set.iterator();
		for (int i = 0; i < set.size(); i++) {
			String str = (String) it.next();
			for (int j = 0; j < check.length; j++) {
				if (check[j].equals(str)) {
					answer++;
				}
			}
		}
		System.out.println(answer);
		sc.close();
	}
}
