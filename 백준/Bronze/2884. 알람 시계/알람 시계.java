import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        
        if (m < 45) {
            h = h - 1;
            m = m + 60;
            if (h < 0) {
                h = h + 24;
            }
        }
        System.out.print(h + " ");
        System.out.println(m-45);
        

        sc.close();
    }
}