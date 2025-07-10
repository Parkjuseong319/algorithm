import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<int[]> waitTruck = new LinkedList<>();
        int answer = 0;
        int bridgeWeight = 0;
        int index = 0;
        while (index < truck_weights.length || !waitTruck.isEmpty()) {
            answer++;
            if(!waitTruck.isEmpty() && waitTruck.peek()[1] == answer) {
                bridgeWeight -= waitTruck.poll()[0];
            }
            if(index < truck_weights.length) {
                if (weight >= bridgeWeight + truck_weights[index] && bridge_length > waitTruck.size()) {
                    waitTruck.add(new int[]{truck_weights[index], answer + bridge_length});
                    bridgeWeight += truck_weights[index];
                    index++;
                }
            }
        }

        return answer;
    }
}