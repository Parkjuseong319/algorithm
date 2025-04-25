import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n+1];		// 문자열 마지막에는 null값 들어가있음
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextLine();
		}
		
		for (int i = 0; i < arr.length; i++) {
			String[] reverse = arr[i].split(" ");
			int idx = 1;
			arr[i] = "";
			while(reverse.length >= idx) {
				arr[i] += reverse[reverse.length-idx] + " ";
				idx++;
			}
		}
		for (int i = 1; i < arr.length; i++) {
			System.out.println("Case #"+(i) + ": " + arr[i]);
		}
		sc.close();
	}
}
