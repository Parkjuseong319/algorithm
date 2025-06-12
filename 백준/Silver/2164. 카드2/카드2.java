import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> card = new LinkedList<Integer>();
		for (int i = 0; i < n; i++) {
			card.add(i+1);
		}
		
		// 연산
		while (card.size() > 1) {
			card.remove(0);
			card.add(card.size(), card.get(0));
			card.remove(0);
		}
		System.out.println(card.get(0));
		sc.close();
	}
}
