import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int person = 0;
		String gameName = st.nextToken();
		if(gameName.equals("Y")) {
			person = 1;
		}else if(gameName.equals("F")) {
			person = 2;
		}else if(gameName.equals("O")) {
			person = 3;
		}
		
		Set<String> set = new HashSet<String>();
		for (int i = 0; i < n; i++) {
			set.add(br.readLine());
		}
		
		int answer = set.size() / person;
		System.out.println(answer);
		br.close();
	}
}
