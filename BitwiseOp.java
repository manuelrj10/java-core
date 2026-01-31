
class BitwiseOp{
	public static void main(String args[]){
		int num1=9;
		int num2=20;
		System.out.println(num1+ " & "+num2+"===>"+(num1&num2));
		System.out.println(num1+ " | "+num2+"===>"+(num1|num2));
		System.out.println(num1+ " ^ "+num2+"===>"+(num1^num2));
		System.out.println(num1+" >> 2===>"+(num1>>2));
		System.out.println(num1+" << 2===>"+(num1<<2));
		System.out.println("binary of "+num1+"is"+Integer.toBinaryString(num1));
		
		
		
		
	}
}