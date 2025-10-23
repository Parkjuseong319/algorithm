import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
        for (int i = 0; i < n; i++) {
            String[] arr2 = arr[i].split("");
            System.out.println(arr2[0] + arr2[arr2.length-1]);
        }
        sc.close();
    }
}
