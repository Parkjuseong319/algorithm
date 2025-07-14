import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> map = new HashMap();
        for (int i = 0; i < want.length; i++) {
            map.put(want[i], number[i]);
        }
        Map<String, Integer> map2 = new HashMap();

        for (int i = 0; i <= discount.length-10; i++) {
            map2 = new HashMap();
            map2.putAll(map);

            for (int j = i; j < i+10; j++) {
                if(map2.containsKey(discount[j])) {
                    if(map2.get(discount[j]) - 1 == 0){
                        map2.remove(discount[j]);
                    }else{
                        map2.put(discount[j], map2.get(discount[j]) - 1);
                    }
                }
            }
            if(map2.size() == 0) {
                answer++;
            }
        }

        return answer;
    }
} 