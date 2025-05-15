class Solution {
    public int[] solution(String s) {
               char[] ch = s.toCharArray();
		int count = 0;
		int zeroCount = 0;
		
		while(ch.length > 1) {
			int temp = 0;
			for (int i = 0; i< ch.length; i++) {
				if(ch[i] == '0') {
					zeroCount++;
				}else temp++;				
			}
			ch = Integer.toBinaryString(temp).toCharArray();
			count++;
		}
		
		int[] answer = {count, zeroCount };
		return answer;

    }
}