class Solution {
    boolean solution(String s) {
        char[] ch = s.toCharArray();
		int count = 0;
		boolean answer = true;
		
		for (int i = 0; i < ch.length; i++) {
			if(ch[i] == '(') {
				count++;
			}else {
				if(count == 0) {
					answer = false;
				}
				count--;
			}
		}
		if(count != 0) answer = false;
		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println(answer);

		return answer;
    }
}