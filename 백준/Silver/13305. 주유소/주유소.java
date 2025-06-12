import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] distance = new int[n-1];
		int[] oil = new int[n];
		String[] d = br.readLine().split(" ");
		String[] o = br.readLine().split(" ");
		for (int i = 0; i < distance.length; i++) {
			distance[i] = Integer.parseInt(d[i]);
		}
		for (int i = 0; i < oil.length; i++) {
			oil[i] = Integer.parseInt(o[i]);
		}
		
		// 연산. 가격은 long type으로 선언. 이진탐색문제..?
		int minOil = Integer.MAX_VALUE;
		int minIndex = 0;
		long result = 0;
		for (int i = 0; i < n-1; i++) {
			if(oil[i] <= minOil) {
				minOil = oil[i];
				minIndex = i;
			}
			result += minOil * distance[i];
		}
		System.out.println(result);
		br.close();	
	}
}
