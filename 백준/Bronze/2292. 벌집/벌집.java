import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 1;
        int a = 0;
        int b = 1;
        if (N>1) {
            while (true) {
                count++;
                a = a + 6;
                b = b + a;
                if (N <= b) {
                    break;
                }
            }
        }else{
            count =1;
        }

        System.out.println(count);
        sc.close();
    }
}