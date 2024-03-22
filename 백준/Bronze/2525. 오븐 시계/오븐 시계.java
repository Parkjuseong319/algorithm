import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        
        m = m + a;
        if (m >= 60) {
            h = h + (m/60);
            m = m - (m/60)*60;
            if (h>=24) {
                h = h - 24;
            }
        }
        System.out.print(h + " ");
        System.out.println(m);
        
        sc.close();
    }
}