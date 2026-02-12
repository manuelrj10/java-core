package methods;
import java.util.Scanner;

public class ClassByValue {
	void personaldetails(String name,int age,String place,long phone,String email ) {
		System.out.println("name"+name);
		System.out.println("age"+age);
		System.out.println("place"+place);
		System.out.println("phono"+phone);
		System.out.println("email"+email);
		
		
		
	}
	void eddetails(String quali,String college,String degreeStream,double cgpa) {
		System.out.println("qualifiaction"+quali);
		System.out.println("College"+college);
		System.out.println("degreeStream"+degreeStream);
		System.out.println("cgpa"+cgpa);
	}
	void status(String comapany_name) {
		System.out.println("comapany_name"+comapany_name);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassByValue cv=new ClassByValue();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name ");
		String name=sc.nextLine();
		System.out.println("Enter the age");
		int age=sc.nextInt();
		System.out.println("Enter the place");
		String place=sc.next();
		System.out.println("Enter the phone");
		long phno=sc.nextLong();
		System.out.println("Enter the email");
		String email=sc.next();
		System.out.println("Enter the qualfication");
		String quali=sc.next();
		System.out.println("Enter the ecollege");
		String college=sc.next();
		System.out.println("Enter the degreeStream");
		String degStr=sc.next();
		System.out.println("Enter the cgpa");
		double cgpa=sc.nextDouble();
		System.out.println("Enter the companyname");
		String cName=sc.next();
		cv.personaldetails(name,age,place,phno,email);
		cv.eddetails(quali,college,degStr,cgpa);
		cv.status(cName);
		sc.close();

		
		
	}
	

}
