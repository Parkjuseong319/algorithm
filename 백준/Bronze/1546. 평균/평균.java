import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        // 사용할 수식 - (원점/최고점*100)/과목수
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] list = new double[n];
		double max = 0.0;
		int total = 0;
		
		for (int i = 0; i < n; i++) {
			list[i] += sc.nextInt();
			total += list[i];
		}
		// 최대값 
		for (int i = 0; i < n; i++) {
			if(list[i] > max) {
				max = list[i];
			}
		}
		
		System.out.println((total/max*100)/n);
		sc.close();
	}
}
