import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            switch (a){
                case 1:{
                    deque.addFirst(Integer.parseInt(s[1]));
                    break;
                }
                case 2:{
                    deque.addLast(Integer.parseInt(s[1]));
                    break;
                }
                case 3:{
                    if(deque.isEmpty()){
                        bw.write("-1\n");
                    }else{
                        String str = Integer.toString(deque.removeFirst());
                        bw.write(str + "\n");
                    }
                    break;
                }
                case 4:{
                    if(deque.isEmpty()){
                        bw.write("-1\n");
                    }else{
                        String str = Integer.toString(deque.removeLast());
                        bw.write(str + "\n");
                    }
                    break;
                }
                case 5:{
                    String str = Integer.toString(deque.size());
                    bw.write(str + "\n");
                    break;
                }
                case 6:{
                    if(deque.isEmpty()){
                        bw.write("1\n");
                    }else{
                        bw.write("0\n");
                    }
                    break;
                }
                case 7:{
                    if(deque.isEmpty()){
                        bw.write("-1\n");
                    }else{
                        String str = Integer.toString(deque.getFirst());
                        bw.write(str + "\n");
                    }
                    break;
                }
                case 8:{
                    if(deque.isEmpty()){
                        bw.write("-1\n");
                    }else {
                        String str = Integer.toString(deque.getLast());
                        bw.write(str + "\n");
                    }
                    break;
                }
            }
            bw.flush();
        }
        bw.close();
        br.close();
    }
}
