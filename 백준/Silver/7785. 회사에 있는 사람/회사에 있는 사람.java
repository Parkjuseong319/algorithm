import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Set<String> set = new TreeSet<String>();
		for (int i = 0; i < n; i++) {
			String name = sc.next();
			String in_out = sc.next();
			if(in_out.equals("enter")) {
				set.add(name);
			}else if(in_out.equals("leave")) {
				set.remove(name);
			}
		}
		ArrayList<String> list = new ArrayList<String>(set);
		Collections.sort(list, Collections.reverseOrder());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		sc.close();
	}
}
