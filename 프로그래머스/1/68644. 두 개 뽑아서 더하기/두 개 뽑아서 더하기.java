import java.util.Iterator;
import java.util.TreeSet;
class Solution {
    public int[] solution(int[] numbers) {
        TreeSet s = new TreeSet();
        
        for (int i = 0; i < numbers.length; i++) {
			for (int j = numbers.length-1; j > i; j--) {
				s.add(numbers[i] + numbers[j]);
			}
		}
        
        int[] answer = new int[s.size()];
        Iterator iter = s.iterator();
        
        for (int i = 0; i < s.size(); i++) {
			answer[i] = (int)iter.next();
		}
        
        return answer;
    }
}