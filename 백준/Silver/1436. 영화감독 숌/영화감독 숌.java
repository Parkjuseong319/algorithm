import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 666;
        int count = 1;
        while(count != n){
            result++;
            if(String.valueOf(result).contains("666")){
                count++;
            }
        }
        System.out.println(result);
    }
}
