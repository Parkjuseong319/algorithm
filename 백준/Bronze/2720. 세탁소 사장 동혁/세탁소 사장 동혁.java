import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int c = sc.nextInt();
            int quarter = c / 25;
            int dime = c % 25 / 10;
            int nickel = c % 25 % 10 / 5;
            int penny = c % 25 % 10 % 5;
            System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
        }
        sc.close();
    }
}
