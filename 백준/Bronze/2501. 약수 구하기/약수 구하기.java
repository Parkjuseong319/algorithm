import java.util.Scanner;

public class Main {		// 약수 구하기. 백준 2501번
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] list = new int[n];
		int count = 0;
		for (int i = 1; i <= list.length; i++) {
			if(n%i==0) {
				count++;
				list[count-1] = i;
			}
		}
		if(count == k || count > k) {	// 작을때의 경우도 넣자
			System.out.println(list[k-1]);
		}else System.out.println(0);
		sc.close();
	}
}
