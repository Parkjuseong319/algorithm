import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int res = 0;
        int count = 0;
        while (count < str.length()) {
            res++;
            String resStr = String.valueOf(res);

            for (int i = 0; i < resStr.length(); i++) {
                char ch = resStr.charAt(i);

                if(ch == str.charAt(count)){
                    count++;
                }

                if(count == str.length()){
                    break;
                }
            }
        }

        System.out.println(res);
        sc.close();
    }
}
