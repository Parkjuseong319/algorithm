import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.add(Integer.parseInt(s[i]));
        }

        int count = 1;
        while (!queue.isEmpty()) {
            if(queue.peek() == count){
                queue.poll();
                count++;
            }else if(!stack.isEmpty() && stack.peek() == count){
                stack.pop();
                count++;
            }else{
                stack.push(queue.poll());
            }
        }

        for (int i = count; i <= n; i++) {
            if(stack.pop() != count){
                break;
            }else{
                count++;
            }
        }

        if(stack.isEmpty()){
            System.out.println("Nice");
        }else{
            System.out.println("Sad");
        }
        br.close();
    }
}
