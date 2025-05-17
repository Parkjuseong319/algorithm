import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		
		Set set1 = new TreeSet();
		Set set2 = new TreeSet();
		
		for (int i = 0; i < n; i++) {
			set1.add(br.readLine());
		}
		int count =0;
		for (int i = 0; i < m; i++) {
			String s = br.readLine();
			if(set1.contains(s)) {
				set2.add(s);
				count++;
			}
		}
        System.out.println(set2.size());
		Iterator it = set2.iterator();
		for (int i = 0; i < set2.size(); i++) {
			bw.write((String)it.next() + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
