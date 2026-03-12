import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            char[] chars = br.readLine().toCharArray();
            Stack<Character> stack = new Stack<Character>();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == '(') {
                    stack.push(chars[i]);
                }else if(chars[i] == ')' && !stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                }else if(chars[i] == ')' && stack.isEmpty()){
                    stack.push(chars[i]);
                }
            }
            if(stack.isEmpty()){
                bw.write("YES\n");
            }else{
                bw.write("NO\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
