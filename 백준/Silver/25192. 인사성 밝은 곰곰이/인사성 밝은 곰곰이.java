import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		Set<String> set = new HashSet<String>();
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			if(str.equals("ENTER")) {
				set.removeAll(set);
			}else {
				if(!set.contains(str)) {
					set.add(str);
					count++;
				}
			}
		}
		System.out.println(count);
		br.close();
		
	}
}
