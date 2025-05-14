class Solution {
    public String solution(String s) {
        String[] str = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length; i++) {
			char[] ch = str[i].toCharArray();
			if (ch.length <= 0) 
				sb.append(" "); 
			else {
				if (ch[0] >= 97) {
					ch[0] -= 32;
				}
				sb.append(ch[0]);
				for (int j = 1; j < ch.length; j++) {
					if (ch[j] >= 65 && ch[j] <= 90) {
						ch[j] += 32;
					}
					sb.append(ch[j]);
				}
				
				if(i == str.length -1 && ch.length > 0) continue;
				sb.append(" ");
			}
		}
		if(s.charAt(s.length()-1) == 32) sb.append(" ");
		String answer = sb.toString();
		return answer;
    }
}