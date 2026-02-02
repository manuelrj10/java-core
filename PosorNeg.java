package java_eclipse;
import java.util.Scanner;

public class PosorNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		num1=sc.nextInt();
		if(num1<0) {
			System.out.println("number is negative");
		}
		else if(num1>0) {
			System.out.println("number is positive");
			
		}
		else {
			System.out.println("number is zero");
		}

	}

}
