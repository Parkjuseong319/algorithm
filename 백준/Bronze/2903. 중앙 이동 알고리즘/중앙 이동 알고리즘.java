import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int line = 2;
        for (int i = 0; i < n; i++) {
            line += (line -1);
        }
        System.out.println((int)Math.pow(line, 2));
        sc.close();
    }
}
