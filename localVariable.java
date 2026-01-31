import java.util.Scanner;

class localVariable{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		//here num1 and num2 are local variable 
		int num1;//variable decalration
		int num2;
		System.out.println("enter the num1");
		num1=sc.nextInt();
		System.out.println("enter the num2");
		num2=sc.nextInt();
		System.out.println("sum of "+num1+" and " +num2+" = "+(num1+num2));
		sc.close()		
		
	}
}