import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();

        long c = euclidean(a, b);
        System.out.println(a*b/c);
        sc.close();
    }

    public static long euclidean(long a, long b){
        if(b == 0) return a;
        return euclidean(b, a % b);
    }
}
