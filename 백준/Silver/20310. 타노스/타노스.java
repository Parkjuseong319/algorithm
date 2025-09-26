import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] chars = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < str.length(); i++){
            map.put(chars[i], map.getOrDefault(chars[i], 0) + 1);
        }

        int zero = map.containsKey('0')? map.get('0') / 2 : 0;
        int one = map.containsKey('1')? map.get('1') / 2 : 0;

        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(count == one){
                break;
            }
            if(str.charAt(i) == '1'){
                list.add(i);
                count++;
            }
        }
        count = 0;
        for(int i = str.length() - 1; i >= 0; i--){
            if(count == zero){
                break;
            }
            if(str.charAt(i) == '0'){
                list.add(i);
                count++;
            }
        }
        Collections.sort(list);
        String temp = "";
        int index = 0;
        for(int i = 0; i < str.length(); i++){
            if(index == list.size()){
                temp += str.charAt(i);
                continue;
            }
            int now = list.get(index);
            if(now == i) {
                index++;
                continue;
            }
            temp += str.charAt(i);
        }
        System.out.println(temp);
        br.close();
    }
}
