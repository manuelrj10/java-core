import java.util.Scanner;
class mydetails{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		String name=sc.nextLine();
		System.out.println("enter your age");
		int age=sc.nextInt();
    		System.out.println("enter your phno");
		long phno=sc.nextLong();
		System.out.println("enter your salary");
		double salary=sc.nextDouble();
		System.out.println("enter your cgpa");
		float cgpa=sc.nextFloat();
		sc.nextLine();
		System.out.println("enter your address");
		String address=sc.nextLine();
		System.out.println("enter your gender (m/f)");
		char gender=sc.next().charAt(0);
		System.out.println("DETAILS");
		System.out.println("name is"+name);
		System.out.println("age is "+age);
		System.out.println("phno is"+phno);
		System.out.println("salary is"+salary);
		System.out.println("cgpa is"+cgpa);
		System.out.println("address is"+address);

		System.out.println("gender is"+gender);
		sc.close();

		


}
}