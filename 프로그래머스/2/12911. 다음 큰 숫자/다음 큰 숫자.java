class Solution {
    public int solution(int n) {
char[] bin = Integer.toBinaryString(n).toCharArray();
        int one = 0;
        for (int i = 0; i < bin.length; i++) {
			if(bin[i] == '1') 
				one++;
		}
        int answer = n;
        while(true) {
        	int reone = 0;
        	answer++;
        	char[] rbin = Integer.toBinaryString(answer).toCharArray();
        	for (int i = 0; i < rbin.length; i++) {
        		if(rbin[i] == '1') reone++;
        	}
        	if(reone == one) break;
        }
        return answer;
    }
}