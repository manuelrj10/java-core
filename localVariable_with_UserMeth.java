class localVariable_with_UserMeth{

public void addition(){
int num1=23;
int num2=43;
System.out.println("sum of "+num1+" and "+num2+ " is " +(num1+num2));


}
public void substraction(){
int num1=100;
int num2=43;
System.out.println("differnce of "+num1+" and "+num2+ " is " +(num1-num2));


}
public void multiplication(){
int num1=23;
int num2=43;
System.out.println("product of "+num1+" and "+num2+ " is " +(num1*num2));


}
public void divison(){
int num1=20;
int num2=4;
System.out.println("quotient of "+num1+" and "+num2+ " is " +(num1/num2));


}






	public static void main(String args[]){
		localVariable_with_UserMeth lc=new localVariable_with_UserMeth();
		lc.addition();
		lc.substraction();
		lc.multiplication();
		lc.divison();





}



}