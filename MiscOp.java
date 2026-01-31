import java.util.Scanner;
class MiscOp{
	public static void main(String args[]){
		//SYNTAX: (CONDITION) ? STATEMENT to be executed if the condition is true : STATEMENT to be executed if the condition is false
		Scanner sc=new Scanner(System.in);
		/*int first;
		int second;
		int third;
		System.out.println("enter three number");
		first=sc.nextInt();
		second=sc.nextInt();
		third=sc.nextInt();
		String out=first>b && first>third ? "first is greater" : second>first && second>third ?"second is greater":"third is greater";
		System.out.println(out);*/
		int age;
		System.out.println("enter the age");
		age=sc.nextInt();
		String out=age>=18?"your are eligible to vote":"your not eligible to vote";
		System.out.println(out);
		
		
		
		
	}
}