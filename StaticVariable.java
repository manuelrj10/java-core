package oops;

public class StaticVariable {
	String name;
	int rollno;
	String cource="Java Springboot";
	StaticVariable(String name,int n){
		this.name=name;
		this.rollno=n;
		
	}
	void show() {
		System.out.println("Student name"+name);
		System.out.println("Student rollno"+rollno);
		System.out.println("cource"+cource);
		System.out.println(" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariable sc1=new StaticVariable("manuel",10);
		sc1.show();
		
		StaticVariable sc2=new StaticVariable("rahul",12);
		sc2.show();
		
		
	}

}
