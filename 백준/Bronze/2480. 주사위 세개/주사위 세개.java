import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a==b && a==c){
            System.out.println(10000 + (a * 1000));
        }
        if(a==b && b != c){
            System.out.println(1000 + (a * 100));
        }
        if(a==c && b != c){
            System.out.println(1000 + (a * 100));
        }
        if(c==b && a != c){
            System.out.println(1000 + (c * 100));
        }
        if(a != b && b != c && a != c){
            int re1 = a > b? a : b;
            int re2 = re1 > c ? re1 : c;
            System.out.println(re2*100);
        }
    }
}