import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = -1000001;
        int min = 1000001;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (max <= a) { max = a; }
            if (min >= a) { min = a; }
        }
        System.out.println(min + " " + max);
        sc.close();
    }
}
