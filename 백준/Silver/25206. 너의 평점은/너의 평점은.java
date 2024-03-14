import java.util.Scanner;

public class Main{
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);

		double time[] = new double[20];
		double sumscore = 0.0;

		for (int i = 0; i < time.length; i++) {
			String n = sc.next();
			double hscore = sc.nextDouble();
			String grade = sc.next();
			sc.nextLine();
			if (grade.equals("P")) {
				continue;
			}
			double re = gradeChange(grade);
			time[i] = re * hscore;
			sumscore += hscore;
		}
		double sum = 0.0;
		for (double v : time){
			sum += v;
		}
		double avg = sum / sumscore;
		System.out.println(avg);

	}

	public static double gradeChange(String grade){
		double grNum;

		switch (grade) {
			case "A+":
			grNum = 4.5;
			break;
			case "A0":
			grNum = 4.0;	
			break;
			case "B+":
			grNum = 3.5;
			break;
			case "B0":
			grNum = 3.0;	
			break;
			case "C+":
			grNum = 2.5;
			break;
			case "C0":
			grNum = 2.0;	
			break;
			case "D+":
			grNum = 1.5;
			break;
			case "D0":
			grNum = 1.0;	
			break;
		
			default:
			grNum = 0.0;
				break;
		}
		return grNum;
	}

}
