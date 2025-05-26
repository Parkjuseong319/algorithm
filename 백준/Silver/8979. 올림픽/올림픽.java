import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[][] nation = new int[n][4];
		for (int i = 0; i < n; i++) {
			nation[i][0] = sc.nextInt();		// 국가
			nation[i][1] = sc.nextInt();		// 금
			nation[i][2] = sc.nextInt();		// 은
			nation[i][3] = sc.nextInt();		// 동
		}
		
		Arrays.sort(nation,new Comparator<int[]>() { 
		    @Override
		    public int compare(int[] o1, int[] o2) {
		        return o1[1]!=o2[1] ? o2[1]-o1[1] : (o1[2]!=o2[2]? o2[2]-o1[2] : o2[3]-o1[3]);
		    }
		});
		
		int rank = 0;
		int idx = 0;
		while(true) {
            rank++;
			if(nation[idx][0] == k) {
				break;
			}
			if(nation[idx][1] == nation[idx+1][1] && nation[idx][2] == nation[idx+1][2]) {
				idx++;		
				continue;
			}
			idx++;
		}
		System.out.println(rank);
	}
}
