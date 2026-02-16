package oops;

public class DefaultConstructor {
	String name;
	int age;
	double cgpa;
	boolean  value;
	char gender;
	DefaultConstructor(){
		System.out.println("inside default constructor");
		name="manuel";
		age=24;
		cgpa=7.8;
		value=true;
		gender='M';
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultConstructor dc=new DefaultConstructor();
		System.out.println("name"+dc.name);
		System.out.println("age"+dc.age);
		System.out.println("cgpa"+dc.cgpa);
		System.out.println("value"+dc.value);
		System.out.println("gender"+dc.gender);
		
		
		
		
		

	}

}
