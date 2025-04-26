import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		long sum = 0l;
		ArrayList<Long> list = new ArrayList<>();
		for (int i = 0; i < k; i++) {
			long n = sc.nextInt();
			if(n == 0) {
				list.remove(list.size()-1);
			} else {
				list.add(n);
			}
		}
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		System.out.println(sum);
		sc.close();
	}
}
