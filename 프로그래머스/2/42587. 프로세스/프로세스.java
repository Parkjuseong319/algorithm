import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < priorities.length; i++) {
            pq.add(priorities[i]);
        }
        while (!pq.isEmpty()) {
            for (int j = 0; j < priorities.length; j++) {
                if(pq.peek() == priorities[j]) {
                    answer++;
                    pq.poll();
                    if(j == location){
                        return answer;
                    }
                }
            }
        }
        return answer;
    }
}