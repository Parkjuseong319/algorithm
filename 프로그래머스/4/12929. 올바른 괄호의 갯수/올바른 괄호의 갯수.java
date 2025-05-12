import java.util.ArrayList;
import java.util.List;
class Solution {
    public int solution(int n) {
      List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(5);
		for (int j = 4; j <= n; j++) {
			int temp = 0;
			for (int i = 0; i < j; i++) {
				temp += list.get(i) * list.get(j - i - 1);
			}
			list.add(temp);
		}
        
		return list.get(n);
    }
}