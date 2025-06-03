import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int result = 1;
		int n = Integer.parseInt(st.nextToken());
		int score = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		Integer[] arr = new Integer[n];

		if (n == 0) {
			System.out.println(1);
			return;
		}
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st2.nextToken());
		}
		Arrays.sort(arr, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});

		if (n == p) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[arr.length - 1] < score) {
					if (score == arr[i])
						continue;
					else if(score < arr[i]) result++;
				} else
					result = -1;
			}
		} else {
			for (int i = 0; i < arr.length; i++) {
				if (score == arr[i])
					continue;
				else if(score < arr[i]) result++;
			}
		}

		System.out.println(result);
		br.close();
	}
}
