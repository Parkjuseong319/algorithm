import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());
		String[] str = new String[t];
		StringBuilder sb = new StringBuilder();
		String reverse = "";
		for (int i = 0; i < t; i++) {
			str[i] = br.readLine();
			sb.append(str[i]);
			reverse = sb.reverse().toString();

			String[] a = reverse.split(" ");
			for (int j = 0; j < a.length; j++) {
				bw.write(a[a.length-j-1] + " ");
			}
			bw.write("\n");
			sb.setLength(0);
		}

		bw.flush();
		bw.close();
		br.close();

	}
}
