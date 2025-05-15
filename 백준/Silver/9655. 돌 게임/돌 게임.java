import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String result = "";
      if(n%2 == 0) result = "CY";
      else result = "SK";
      System.out.println(result);
    }
}