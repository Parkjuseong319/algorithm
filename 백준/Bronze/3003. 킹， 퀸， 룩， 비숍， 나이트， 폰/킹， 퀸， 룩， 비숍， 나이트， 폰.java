import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int king = sc.nextInt();
        int queen = sc.nextInt();
        int look = sc.nextInt();
        int bishop = sc.nextInt();
        int knight = sc.nextInt();
        int pawn = sc.nextInt();
        
        System.out.println((1-king) + " " + (1 - queen) + " "+ (2 - look) + " "+ (2 - bishop) + " "+ (2 - knight) + " "+ (8 - pawn));
        sc.close();
    }
}