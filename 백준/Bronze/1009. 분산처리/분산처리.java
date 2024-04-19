import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        ArrayList<Integer> ar = new ArrayList<Integer>();
        List<Integer>[] blist = new ArrayList[10];
        // 제곱 수에는 일정한 패턴으로 일의 자리 숫자가 바뀐다.
		blist[0] = new ArrayList<>(Arrays.asList(10));
		blist[1] = new ArrayList<>(Arrays.asList(1));
		blist[2] = new ArrayList<>(Arrays.asList(2, 4, 8, 6));
		blist[3] = new ArrayList<>(Arrays.asList(3, 9, 7, 1));
		blist[4] = new ArrayList<>(Arrays.asList(4, 6));
		blist[5] = new ArrayList<>(Arrays.asList(5));
		blist[6] = new ArrayList<>(Arrays.asList(6));
		blist[7] = new ArrayList<>(Arrays.asList(7, 9, 3, 1));
		blist[8] = new ArrayList<>(Arrays.asList(8, 4, 2, 6));
		blist[9] = new ArrayList<>(Arrays.asList(9, 1));

        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();        
            int idx = 0;

            if(b % blist[a % 10].size() == 0) {
				idx = blist[a%10].size() -1 ;
			} else {
				idx = b % blist[a%10].size() -1 ;
			}
            
            ar.add(blist[a%10].get(idx));
            
        }
        for (Integer long1 : ar) {
            System.out.println(long1);
        }
        
        sc.close();
    }
}