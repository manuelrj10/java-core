import java.util.Scanner;
class ArthematicOperator{
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int num1;
		int num2;
		int ans=0;
		int dif=0;
		int prod=0;
		int quo=0;
		int rem=0;
		System.out.println("enter the first number");
		num1=sc.nextInt();
		System.out.println("enter the second number");
		num2=sc.nextInt();
		ans=num1+num2;
		System.out.println("sum of "+num1+" and "+num2+" is "+ans);
		dif=num1-num2;
		System.out.println("differnce of "+num1+" and "+num2+" is "+dif);
		prod=num1*num2;
		System.out.println("product of "+num1+" and "+num2+" is "+prod);
		quo=num1/num2;
		System.out.println("quotient of "+num1+" and "+num2+" is "+quo);
		rem=num1%num2;
		System.out.println("reminder of "+num1+" and "+num2+" is "+rem);
		System.out.println("increement  of "+num1+" is" +(++num1));
		System.out.println("decreement  of "+num2+" is" +(--num2));
		
		
		
		
		
		
		
	}
}