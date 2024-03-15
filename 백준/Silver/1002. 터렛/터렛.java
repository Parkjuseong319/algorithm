import java.util.Scanner;

public class Main {   // 두 원의 접점 개수 구하기 문제
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();

            double dist = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
            // Math.pow 는 거듭제곱. Math.sqrt는 루트.
            if(dist == 0 && r1 == r2){
                System.out.println(-1);
            } else if(Math.abs(r1-r2)< dist && dist < r1 + r2){
                System.out.println(2);
            } else if(Math.abs(r1-r2) == dist || r1 + r2 == dist){
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
        sc.close();
    }   
}
