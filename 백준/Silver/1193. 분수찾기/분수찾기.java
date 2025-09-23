import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = 1;
        while (x > 0) {
            if(x <= a) break;
            else {
                x -= a;
                a++;
            }
        }
        int deno =  a - x + 1;
        int num = x;
        if (a % 2 == 0) {
            System.out.println(num + "/" + deno);
        }else{
            System.out.println(deno + "/" + num);
        }
        sc.close();
    }
}
