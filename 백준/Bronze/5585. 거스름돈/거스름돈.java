import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = 1000 - sc.nextInt();
        int answer = 0;
        answer += money/500;
        money %= 500;
        answer += money/100;
        money %= 100;
        answer += money/50;
        money %= 50;
        answer += money/10;
        money %= 10;
        answer += money/5;
        money %= 5;
        answer += money;
        System.out.println(answer);
        sc.close();
    }
}

