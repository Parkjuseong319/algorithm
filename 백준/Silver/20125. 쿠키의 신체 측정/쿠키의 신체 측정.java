import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][n];
		int[] heart = new int[2];
		int l_arm=0, r_arm=0, core=0, l_leg=0, r_leg=0, c = 0;

		// 입력 받기
		for (int i = 0; i < n; i++) {
			char[] ch = br.readLine().toCharArray();
			for (int j = 0; j < ch.length; j++) {
				if(ch[j]=='*' && c==0) {
					arr[i][j] = 1;
					heart[0] = i + 1;
					heart[1] = j;
					c++;
				}else if(ch[j] == '*'){
					arr[i][j] = 1;
				}else {
					arr[i][j] = 0;
				}
			}
		}
		
		// l_arm
		for (int i = heart[1]-1; i >= 0; i--) {
			if(arr[heart[0]][i] == 1) l_arm++;
			else break;
		}
		// r_arm
		for (int i = heart[1]+1; i < n; i++) {
			if(arr[heart[0]][i] == 1) r_arm++;
			else break;
		}
		// core
		for (int i = heart[0]+1; i < n; i++) {
			if(arr[i][heart[1]] == 1) core++;
			else break;
		}
		// l_leg
		for (int i = heart[0]+core+1; i < n; i++) {
			if(arr[i][heart[1]-1] == 1) l_leg++;
			else break;
		}
		// r_leg
		for (int i = heart[0]+core+1; i < n; i++) {
			if(arr[i][heart[1]+1] == 1) r_leg++;
			else break;
		}
		
		System.out.println((heart[0]+1) + " " + (heart[1]+1) + "\n" + l_arm + " " + r_arm + " " + core + " " + l_leg + " " + r_leg);
		br.close();
	}
}
