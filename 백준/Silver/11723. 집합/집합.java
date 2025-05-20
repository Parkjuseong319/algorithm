import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int m = Integer.parseInt(br.readLine());
		Set<String> set = new HashSet<String>();

		for (int i = 0; i < m; i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			switch (st.nextToken()) {
			case "add": {
				String check = st.nextToken();
				if(set.contains(check)) continue;
				set.add(check);
				break;
			}
			case "remove": {
				String check = st.nextToken();
				if(!set.contains(check)) continue;
				set.remove(check);
				break;
			}
			case "check": {
				if (set.contains(st.nextToken())) {
					bw.write(1 + "\n");
					break;
				} else {
					bw.write(0 + "\n");
					break;
				}
			}
			case "toggle": {
				String s = st.nextToken();
				if (set.contains(s)) {
					set.remove(s);
					break;
				} else {
					set.add(s);
					break;
				}

			}
			case "all": {
				for (int j = 1; j <= 20; j++) {
					set.add(Integer.toString(j));
				}
				break;
			}
			case "empty": {
				set.removeAll(set);
				break;
			}
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
