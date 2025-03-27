import java.util.Scanner;

public class Main { // 백준 알고리즘 1157번 문제. 단어공부
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		str = str.toUpperCase();		// 대문자로 변환
		char[] ch = str.toCharArray();
		int[] num = new int[26];
		char result;
		for (int i = 0; i < ch.length; i++) { 
			num[ch[i]-65] += 1;
		}
		
		// 제일 큰 수의 인덱스 번호를 찾아야함.
		 // 최대값, 최대값의 인덱스 초기값 세팅        
		int max = num[0];        
		int maxIndex = 0;        
		// 최대값, 최대값의 인덱스 구하기       
		for (int i = 0; i < num.length; i++) {            
			if (num[i] > max) {               
			max = num[i];                
			maxIndex = i;            
			}    
		}
		result = (char)(maxIndex + 65);
		for (int i = 0; i < num.length; i++) {
			if(i != maxIndex && max == num[i] ) result = '?';
		}
		System.out.println(result);
			
		sc.close();
	}
}
