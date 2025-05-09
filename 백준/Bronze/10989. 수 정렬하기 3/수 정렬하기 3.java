import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n= Integer.parseInt(br.readLine());
		int[] result = new int[n];
		int max = 0;
		
		// 배열 입력받기
		for (int i = 0; i < n; i++) {
			result[i] =Integer.parseInt(br.readLine());
		}

		Arrays.sort(result);
		
		// 출력하기
		for (int i = 0; i < result.length; i++) {
			bw.write(result[i] + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
