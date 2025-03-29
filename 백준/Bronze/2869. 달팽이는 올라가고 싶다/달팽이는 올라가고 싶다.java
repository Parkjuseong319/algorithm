import java.util.Scanner;

public class Main {	// 백준 26869번
	// 제한시간 0.25초 이므로 반복문을 통한 결과출력은 어렵다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();	// 올라가는 길이
		int b = sc.nextInt();	// 내려오는 길이
		int v = sc.nextInt();	// 올라가야할 총 높이
		int day = 0;			// 올라가는데 걸리는 날
		if((v-a)%(a-b) ==0 ) day = (v-a) / (a-b) + 1;
		else day = (v-a) / (a-b) + 2;
		System.out.println(day);
		sc.close();
	}

}
