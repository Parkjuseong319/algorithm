import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		Map<String, String> map = new HashMap<String, String>();
		Map<String, String> map2 = new HashMap<String, String>();
		
		for (int i = 1; i <= n; i++) {
			String key = Integer.toString(i);
			String value = br.readLine();
			map.put(key, value);
			map2.put(value, key);
		}
		for (int i = 0; i < m; i++) {
			String test = br.readLine();
			if(map.containsKey(test)) {
				bw.append(map.get(test) + "\n");
			}else if(map2.containsKey(test)) {
				bw.append(map2.get(test) + "\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
