import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<String> list = new ArrayList<String>();
		while (true) {
			String str = br.readLine();
			if (str.equals("end"))
				break;
			list.add(str);
		}
		ArrayList<String> answer = check(list);

		for (int i = 0; i < answer.size(); i++) {
			bw.write(answer.get(i) + "\n");
		}
		bw.flush();
		bw.close();
		br.close();

	}

	public static ArrayList<String> check(ArrayList<String> list) {
		ArrayList<String> result = new ArrayList<String>();
		String s = "aeiou";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < list.size(); i++) {
			boolean flag = false;
			char[] ch = list.get(i).toCharArray();
			int count1 = 0; // 모음
			int count2 = 0; // 자음
//			for (int j = 0; j < ch.length; j++) {
//				if (s.contains(Character.toString(ch[j]))) {
//					count1++;
//					count2 = 0;
//					flag = true;
//					
//				} else {
//					count1 = 0;
//					count2++;
//					if (ch.length > 1 && j < ch.length - 1) {
//						if (count2 >= 3 || ch[j] == ch[j + 1]) {
//							flag = false;
//							break;
//						}
//					}
//				}
//				if (ch.length > 1 && j < ch.length - 1) {
//					sb.append(ch[j]);
//					sb.append(ch[j + 1]);
//					if (sb.toString().equals("ee") || sb.toString().equals("oo")) {
//						count1--;
//					} else if (count1 >= 3 || ch[j] == ch[j + 1]) {
//						flag = false;
//						break;
//					}
//					sb.delete(0, sb.length());
//				}
//			}
			for (int j = 0; j < ch.length; j++) {
			    char current = ch[j];

			    if (s.indexOf(current) != -1) { // 모음
			        count1++; // 모음 연속 증가
			        count2 = 0; // 자음 연속 리셋
			        flag = true; // 모음 존재

			    } else { // 자음
			        count2++; // 자음 연속 증가
			        count1 = 0; // 모음 연속 리셋
			    }

			    // 3개 이상 연속 불가
			    if (count1 >= 3 || count2 >= 3) {
			        flag = false;
			        break;
			    }

			    // 연속 글자 2번 체크 (j > 0 이후부터)
			    if (j > 0) {
			        if (ch[j] == ch[j - 1]) {
			            String pair = "" + ch[j - 1] + ch[j];
			            if (!(pair.equals("ee") || pair.equals("oo"))) {
			                flag = false;
			                break;
			            }
			        }
			    }
			}
			if (flag && (count1 < 3 && count2 < 3)) {
				result.add("<" + list.get(i) + "> is acceptable.");
			} else {
				result.add("<" + list.get(i) + "> is not acceptable.");
			}
		}
		return result;
	}
}
