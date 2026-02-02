package java_eclipse;
import java.util.Scanner;

public class MarkGrade {
	public static void main(String args[]) {
		int mark;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the mark");
		mark=sc.nextInt();
		if(mark>=0&&mark<=100) {
			if(mark>=90 && mark<=100) {
				System.out.println("A+");
			}
			else if(mark>=80 && mark<90) {
				System.out.println("A");
			}
			else if(mark>=70 && mark<80) {
				System.out.println("B+");
			}
			else if(mark>=60 && mark<70) {
				System.out.println("B");
			}
			else if(mark>=50 && mark<60) {
				System.out.println("C+");
			}
			else if(mark>=40 && mark<50) {
				System.out.println("C");
			}
			else if(mark>=30 && mark<40) {
				System.out.println("D");
			}
			else {
				System.out.println("Fail");
				
			}
		}
		else {
			System.out.println("Mark out of range");
		}
		
	}

}
