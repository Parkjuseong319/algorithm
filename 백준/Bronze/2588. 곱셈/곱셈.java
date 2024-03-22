import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       String a = sc.nextLine();
       String b = sc.nextLine();
       
       String[] str = b.split("");
    
       int re1 = Integer.parseInt(a) * Integer.parseInt(str[2]);
       int re2 = Integer.parseInt(a) * Integer.parseInt(str[1]);
       int re3 = Integer.parseInt(a) * Integer.parseInt(str[0]);

       System.out.println(re1);
       System.out.println(re2);
       System.out.println(re3);
       System.out.println(re1 + (re2*10) + (re3*100));
       
       sc.close();
    }
}