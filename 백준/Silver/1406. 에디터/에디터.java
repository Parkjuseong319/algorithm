import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] s = br.readLine().toCharArray();
        int m = Integer.parseInt(br.readLine());
        Stack<Character> rstack = new Stack<>();
        Stack<Character> lstack = new Stack<>();
        for(int i = 0; i < s.length; i++) {
            lstack.push(s[i]);
        }
        StringTokenizer st = null;
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            char command = st.nextToken().charAt(0);
            switch(command) {
                case 'L':
                    if(lstack.isEmpty()) break;
                    char a = lstack.pop();
                    rstack.add(a);
                    break;
                case 'D':
                    if(rstack.isEmpty()) break;
                    char b = rstack.pop();
                    lstack.push(b);
                    break;
                case 'B':
                    if(lstack.isEmpty()) break;
                    lstack.pop();
                    break;
                case 'P':
                    char ch = st.nextToken().charAt(0);
                    lstack.push(ch);
                    break;
            }
        }

        while(!lstack.isEmpty()) {
            rstack.push(lstack.pop());
        }
        while(!rstack.isEmpty()) {
            bw.write(rstack.pop());
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
