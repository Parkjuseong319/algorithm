import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main { // 백준 10828번
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());

		int[] stack = new int[n];
		int idx = 0;

		for (int i = 0; i < n; i++) {
			String read = br.readLine();
			String[] command = read.split(" ");

			switch (command[0]) {
			case "push": {
				stack[idx] = Integer.parseInt(command[1]);
				idx++;
				break;
			}
			case "pop": {
				if (idx < 1) {
					bw.write(-1 + "\n");
					break;
				} else {
					idx--;
					bw.write(stack[idx] + "\n");
					break;
				}
			}
			case "size": {
				bw.write(idx + "\n");
				break;
			}
			case "empty": {
				if (idx == 0) {
					bw.write(1 + "\n");
					break;
				} else {
					bw.write(0 + "\n");
					break;
				}
			}
			case "top": {
				if (idx == 0) {
					bw.write(-1 + "\n");
					break;
				} else {
					bw.write(stack[idx-1] + "\n");
					break;
				}
			}
			}
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
