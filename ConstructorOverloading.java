package oops;

public class ConstructorOverloading {
	double cgpa;
	int empid;
	String name;
	ConstructorOverloading(){
		System.out.println("gooood morning");
		
	}
	ConstructorOverloading(String name){
		this();
		this.name=name;
		System.out.println("whats up"+name);
		
	}
	ConstructorOverloading(int empid,double cgpa,String name){
		this(name);
		System.out.println("employeeid"+empid);
		System.out.println("your cgpa is"+cgpa);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ConstructorOverloading og=new ConstructorOverloading();
//		ConstructorOverloading og1=new ConstructorOverloading("manuel");
		ConstructorOverloading og2=new ConstructorOverloading(2344,8.8,"manuel");
		
		

	}

}
