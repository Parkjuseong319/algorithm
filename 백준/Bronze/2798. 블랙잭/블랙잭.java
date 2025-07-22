import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < a.length-2; i++) {
            for (int j = i + 1; j < a.length-1; j++) {
                for (int k = j + 1 ; k < a.length; k++) {
                    if(a[i] + a[j] + a[k] <= m && sum <= a[i] + a[j] + a[k]) {
                        sum = a[i] + a[j] + a[k];
                    }
                }
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
