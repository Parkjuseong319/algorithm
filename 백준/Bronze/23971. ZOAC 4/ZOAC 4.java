import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int answer1 = 0;
		int answer2 = 0;
		
		if(h%(n+1) == 0) answer1 = h/(n+1);
		else answer1 = h/(n+1) + 1;
		if(w%(m+1) == 0) answer2 = w/(m+1);
		else answer2 = w/(m+1) + 1;
		System.out.println(answer1 * answer2);
		sc.close();
	}
}
