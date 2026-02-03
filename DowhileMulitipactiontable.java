package java_eclipse;
import java.util.Scanner;

public class DowhileMulitipactiontable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int  i=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		num=sc.nextInt();
		do {
			System.out.println(num+" * "+i+" = "+(num*i));
			i++;
		}
		while(i<=10);
		sc.close();

	}

}
