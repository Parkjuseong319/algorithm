import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] str = new String[5];
		char[][] ch = new char[5][15];
		
		for (int i = 0; i < ch.length; i++) {
			str[i] = br.readLine();
		}
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < str[i].length(); j++) {
				ch[i][j] = str[i].charAt(j);
			}
		}
		
		// 공백 없이 출력하기 해보자
		for (int i = 0; i < ch[0].length; i++) {
			for (int j = 0; j < ch.length; j++) {
				if(ch[j][i]=='\u0000') continue; 
				bw.write(ch[j][i]);
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
