class postIncreementDecreement{
public static void main(String args[]){
		
		int num1=10;
		int num2=20;
		int number1=30;
		int number2=40;
		System.out.println("increement");
		//post increement
		
		//value is used then increemented
		System.out.println("num1++ "+(num1++));
		
		//here increemented value is updated;
		System.out.println("num1 "+num1);
		
		//pre increement
		System.out.println("num2 "+num2);
		//here increement first then value is used
		System.out.println("++num2 "+(++num2));
		
		
		/*first assigned value will be printed*/
		
		System.out.println("decreement");
		//post decreement
		
		//value is used then decreemented
		System.out.println("number1-- "+(number1--));
		System.out.println("numeber1 "+number1);
		//pre decreement
		System.out.println("numebr2 "+number2);
		//here decreemented first then value is used
		System.out.println("--number2 "+(--number2));
		
}
}
