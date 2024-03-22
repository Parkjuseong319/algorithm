import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int L = sc.nextInt();

        boolean b = true;

        for (int i = L; i <= 100 && b ; i++) {
            int sum = (i * (i -1)) / 2;
            int idx = 0;

            while (true) {
                if (sum == N) {
                    for (int j = 0; j < i; j++) {System.out.print(idx + j + " ");}

                    b = false;
                    break;
                }

                sum += i;
                idx += 1;

                if (sum > N) break;
            }
        }

        if (b) {
            System.out.println(-1);
        }

        sc.close();
     
    }
}