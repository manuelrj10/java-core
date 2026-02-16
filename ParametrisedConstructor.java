package oops;

public class ParametrisedConstructor {
	String name;
	int age;
	double cgpa;
	boolean value;
	char gender;
	
	ParametrisedConstructor(String name,int age,double cgpa,boolean value,char gender){
		this.name=name;
		this.age=age;
		this.cgpa=cgpa;
		this.value=value;
		this.gender=gender;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParametrisedConstructor pc =new ParametrisedConstructor("manuel",10,2.5,true,'M');
		System.out.println("name"+pc.name);
		System.out.println("age"+pc.age);
		System.out.println("cgpa"+pc.cgpa);
		System.out.println("value"+pc.value);
		System.out.println("gender"+pc.gender);
	}

}
