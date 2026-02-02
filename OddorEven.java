package java_eclipse;
import java.util.Scanner;


public class OddorEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		num1=sc.nextInt();
		if(num1%2==0) {
			System.out.println("Number is even");
		}
		else {
			System.out.println("Number is odd");
		}

	}

}
