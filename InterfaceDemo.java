package oops;
interface home{
	String hName="Thottumkal";
	String place="Thiruvalla";
	int pinCode=682306;
	
}
interface Father{
	void fdetails(String name,int age,String job);
	
}
interface Mother{
	void mdetails(String name,int age,String job);
}
class son implements home,Father,Mother{
	void mydetails(String name,int age,String job) {
		System.out.println(" name"+name);
		System.out.println(" age"+age);
		System.out.println("job name"+job);
	}
	
	public void fdetails(String name,int age,String job) {
		System.out.println("Father name"+name);
		System.out.println("Father age"+age);
		System.out.println("job name"+job);
		
	}
	public void mdetails(String name,int age,String job) {
		System.out.println("Mother name"+name);
		System.out.println("Mother age"+age);
		System.out.println("job name"+job);
		
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		son s=new son();
		System.out.println("home details");
		System.out.println(s.hName);
		System.out.println(s.place);
		System.out.println(s.pinCode);
		
		System.out.println("my details");
		s.mdetails("manuel", 24,"businessman");

		System.out.println("father details");
		s.mdetails("Rajesh", 54,"business");
		
		System.out.println("Mother details");
		s.mdetails("Bindhu", 54,"houseWIFE");
		
		
		

	}

}
