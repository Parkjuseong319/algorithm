import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 666;
        String s = "666";
        int count = 1;
        StringBuilder sb = new StringBuilder();
        while(count != n){
            result++;
            if(String.valueOf(result).contains(s)){
                count++;
            }
        }

        System.out.println(result);

    }
}
