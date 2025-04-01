import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {	// 백준 2751번. 수 정렬하기
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int temp = 0;
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		
		sortByMergeSort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			bw.write(arr[i] + "\n");
		}
		bw.flush();
	    bw.close();
	    br.close();
	}
	
	public static void sortByMergeSort(int[] arr) {
	    int[] tmpArr = new int[arr.length];
	    mergeSort(arr, tmpArr, 0, arr.length - 1);
	}
	public static void mergeSort(int[] arr, int[] tmpArr, int left, int right) {
	    if (left < right) {
	        int m = left + (right - left) / 2;
	        mergeSort(arr, tmpArr, left, m);
	        mergeSort(arr, tmpArr, m + 1, right);
	        merge(arr, tmpArr, left, m, right);
	    }
	}
	public static void merge(int[] arr, int[] tmpArr, int left, int mid, int right) {
	    for (int i = left; i <= right; i++) {
	        tmpArr[i] = arr[i];
	    }
	    int part1 = left;
	    int part2 = mid + 1;
	    int index = left;
	    while (part1 <= mid && part2 <= right) {
	        if (tmpArr[part1] <= tmpArr[part2]) {
	            arr[index] = tmpArr[part1];
	            part1++;
	        } else {
	            arr[index] = tmpArr[part2];
	            part2++;
	        }
	        index++;
	    }
	    for (int i = 0; i <= mid - part1; i++) {
	        arr[index + i] = tmpArr[part1 + i];
	    }
	}
}
