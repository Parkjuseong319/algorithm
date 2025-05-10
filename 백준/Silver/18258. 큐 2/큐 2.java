import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		Queue qu = new LinkedList<>();
		int last = 0;
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			if (command.equals("push")) {
				last = Integer.parseInt(st.nextToken());
				qu.add(last);
				continue;
			}
			else if (command.equals("pop")) {
				bw.append( qu.isEmpty()? "-1\n": qu.remove()+ "\n");
			} else if (command.equals("size")) {
				bw.append(Integer.toString(qu.size()) + "\n");
				continue;
			}
			else if (command.equals("empty")) {
				bw.append( qu.isEmpty()? "1\n": "0\n");
			} else if (command.equals("front")) {
				bw.append( qu.isEmpty()? "-1\n": qu.peek() + "\n");
			} else if (command.equals("back")) {
				bw.append( qu.isEmpty()? "-1\n": last + "\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
