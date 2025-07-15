import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        a: for (int i = 0; i < s.length(); i++) {
            String str = s.substring(i) + s.substring(0, i);
            char firstChar = str.charAt(0);
            char lastChar = str.charAt(str.length() - 1);
            if(firstChar == ']' || firstChar =='}' || firstChar == ')' ||
                    lastChar == '[' || lastChar == '{' || lastChar == '(') continue;
            Deque<Character> q = new ArrayDeque<>();

            for (char c : str.toCharArray()) {
                switch(c) {
                    case '{':  q.addLast('}'); break;
                    case '[':  q.addLast(']'); break;
                    case '(':  q.addLast(')'); break;
                    default: 
                        if(q.isEmpty() || c != q.pollLast()) continue a;
                    
                }
            }
            if(q.isEmpty()) answer++;
        }
        return answer;
    }
}