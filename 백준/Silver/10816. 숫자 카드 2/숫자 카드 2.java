import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] sang = br.readLine().split(" ");
        Map<Integer,Integer> map = new HashMap<>();
        for (String key : sang) {
            map.put(Integer.parseInt(key), map.getOrDefault(Integer.parseInt(key), 0) + 1);
        }
        int m = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String[] check = br.readLine().split(" ");
        for (int i = 0; i < m; i++) {
            if(map.containsKey(Integer.parseInt(check[i]))){
                sb.append(map.get(Integer.parseInt(check[i])) + " ");
            }
            else{
                sb.append(0 + " ");
            }
        }
        System.out.println(sb.toString());
        br.close();

    }
}
