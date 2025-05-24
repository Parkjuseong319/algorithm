import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int p = Integer.parseInt(br.readLine());
		int[][] line = new int[p][20];
		int[][] answer = new int[p][2];
		for (int i = 0; i < p; i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			answer[i][0] = Integer.parseInt(st.nextToken());
			for (int j = 0; j < line[i].length; j++) {
				line[i][j] = Integer.parseInt(st.nextToken());
			}
		}	// 입력 끝
		
		for (int i = 0; i < p; i++) {
			int count = 0;
			for (int j = 0; j < line[i].length; j++) {
				int target = line[i][j];
				int k = j-1;
				
				while(k >= 0 && target < line[i][k ]) {
					line[i][k+1] = line[i][k];
					k--;
					count++;
				}
				line[i][k+1] = target;
			}
			answer[i][1] = count;
		}
		
		for (int i = 0; i < answer.length; i++) {
			bw.write(answer[i][0] + " " + answer[i][1] + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
		
	}
}
