import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			ArrayList<Integer> list = new ArrayList<Integer>();
			int a = 0;
			if(n == -1) break;
			
			for (int i = 1; i < n; i++) {
				if(n%i == 0) {
					list.add(i);
					a += i;
				}
			}
			Collections.sort(list);
			
			if(n == a) {
				System.out.print(n + " = ");
				System.out.print(list.get(0));
				for (int i = 1; i < list.size(); i++) {
					System.out.print(" + " + list.get(i));
				}
				System.out.println();
			}else {
				System.out.println(n + " is NOT perfect.");
			}
		}
		sc.close();
	}

}
