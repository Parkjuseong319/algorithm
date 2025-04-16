import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		TreeSet<String> set = new TreeSet<String>();
		int idx = 0;
		// 중복제거하며 값 넣기
		for (int i = 0; i < n; i++) {
			set.add(sc.next());
		}
		String[] word = new String[set.size()];
		Iterator it = set.iterator();
		while(it.hasNext()) {
			word[idx] = (String)it.next();
			idx++;
		}

	  for (int i = 1; i < word.length; i++) {
	        String key = word[i];
	        int j = i - 1;
	        while (j >= 0 && word[j].length() > key.length()) {
	        	word[j + 1] = word[j];
	            j--;
	        }
	        word[j + 1] = key;
	    }
		
		for (int i = 0; i < word.length; i++) {
			System.out.println(word[i]);
		}
	}
}
