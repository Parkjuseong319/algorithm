class Solution {
    public int solution(int n) {
        return fivonachi(n);
    }
	public int fivonachi(int n) {
		int[] arr = new int[n+1];
		arr[0] = 0;
		arr[1] = 1;
		if(n <= 0) {
			return arr[0];
		}
		else if(n < 2) return arr[1];
		else {
			for (int i = 2; i <= n; i++) {
				arr[i] = (arr[i-1] + arr[i-2]) % 1234567;
			}
			return arr[n];
		}
    }
}