import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(in.readLine());
        int origin = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        char[] arr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        ArrayList list = new ArrayList();
        while(origin >= B){
            int a = origin % B;
            char ch = arr[a];
            list.add(ch);
            origin /= B ;
        }
        list.add(arr[origin]);
        for(int i = list.size(); i > 0; i--){
            out.write((char)list.get(i-1));
        }
        out.flush();
        out.close();
        in.close();
    }
}
