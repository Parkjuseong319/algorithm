import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean[] arr = new boolean[30];
		Arrays.fill(arr, false);
		for (int i = 0; i < arr.length-2; i++) {
			arr[sc.nextInt()-1] = true;
		}
		for (int i = 0; i < arr.length; i++) {
			if(!arr[i]) System.out.println(i+1);
			
		}
		sc.close();

	}

}
