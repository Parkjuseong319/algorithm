import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int answer = 0;
        String s = sc.nextLine();
        char[] original = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < original.length; i++){
            map.put(original[i], map.getOrDefault(original[i], 0) + 1);
        }

        for(int i = 1; i < n; i++){
            HashMap<Character, Integer> map2 = new HashMap<>(map);
            char[] temp = sc.nextLine().toCharArray();
            int a = 0;
            int b = 0;
            for(int j = 0; j < temp.length; j++){
                map2.put(temp[j], map2.getOrDefault(temp[j], 0) - 1);
            }

            for(int v : map2.values()){
                if(v > 0) a += v;
                else if(v<0) b -= v;
            }

            if( (a == 0 && b == 0 )
                    || (a == 0 && b == 1)
                    || (a == 1 && b == 0)
                    || (a == 1 && b == 1)) answer++;
        }

        System.out.println(answer);
        sc.close();
    }
}
