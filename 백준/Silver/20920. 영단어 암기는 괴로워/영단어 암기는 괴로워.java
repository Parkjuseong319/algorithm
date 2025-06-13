import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int wordLen = Integer.parseInt(str[1]);
        Map<String, Integer> map = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int lengthDifference = o2.length() - o1.length();
                if (lengthDifference != 0) return lengthDifference;
                return o1.compareTo(o2);
            }
        });
        // 나오는 횟수 value 값으로 저장
        for (int i = 0; i < n; i++) {
            String word =  br.readLine();
            if(word.length() >= wordLen) {       // 짧은 단어들은 단어장에 넣을 필요가 없다
                if (map.containsKey(word)) {
                    map.replace(word, map.get(word) + 1);
                }else{
                    map.put(word, 1);
                }
            }
        }
        List<String> keySet = new ArrayList<>(map.keySet());	// map의 keySet()을 list로

        // 내림차순 정렬
        keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));

        for (String key : keySet) {
            bw.write(key + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}