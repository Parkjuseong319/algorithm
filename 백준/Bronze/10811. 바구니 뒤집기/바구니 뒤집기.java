import java.util.Scanner;

public class Main {		//백준 10811번 바구니 뒤집기(1차원 배열). 하나씩 뒤집는게 아니라 범위단위로 뒤집는거
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		// 바구니 길이
		int m = sc.nextInt();		// 입력 받을 횟수
		int[] arr = new int[n];
		int temp = 0;		// 임시 저장
		
		for (int i = 0; i < n; i++) {//바구니 개수 나열해 넣기
			arr[i] = i + 1;
		}
		
		for (int i = 0; i < m; i++) {	// 교환 알고리즘 사용. 수정 필
			int x = sc.nextInt()-1;
			int y = sc.nextInt()-1;
			while(x<y){
				temp = arr[x];
				arr[x] = arr[y];
				arr[y] = temp;
				x++; y--;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		sc.close();
	}
}
