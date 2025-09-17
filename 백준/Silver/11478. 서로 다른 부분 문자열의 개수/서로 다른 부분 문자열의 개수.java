import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            String sub = "";
            for (int j = 0; j <= s.length()-i; j++) {
                sub = s.substring(j, j+i);
                set.add(sub);
            }
        }
        System.out.println(set.size());
        br.close();
    }
}
