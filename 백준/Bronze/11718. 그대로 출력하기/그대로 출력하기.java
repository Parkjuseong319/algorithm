import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String a = "";
		for(int i = 0; i < 102; i++) {
			a = br.readLine();
			if((a == null) || (a.equals(""))) {
				break;
			}
			bw.write(a + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}