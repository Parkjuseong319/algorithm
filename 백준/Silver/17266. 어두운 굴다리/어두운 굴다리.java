import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());		// 굴다리 길이
		int m = Integer.parseInt(br.readLine());		// 굴다리 개수
		int[] arr = new int[n+1];
		String[] str = br.readLine().split(" ");
		
		for (int i = 0; i < m; i++) {
			arr[Integer.parseInt(str[i])] = 1;
		}
		int distance = 0;
		int maxDistance = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) distance++;
			else distance = 0;
			if(maxDistance <= distance) maxDistance = distance;
		}
		maxDistance++;
		int height = (int)Math.ceil(maxDistance / 2.0);
		// 시작점과 첫번째 가로등과의 거리차이, 사이에 낀 가로등 사이끼리의 거리/2 값, 끝 가로등과 끝지점 거리 차이 비교
		int startPoint = Integer.parseInt(str[0]);
		int endPoint = n - Integer.parseInt(str[m-1]);
		
		int result = (startPoint > endPoint)? (startPoint > height? startPoint:height):(endPoint > height? endPoint:height);
		
		System.out.println(result);
	}
}