
package oops;

public class StaticVariableMain {
	String name;
	int rollno;
	 static String cource="Java Springboot";
	StaticVariableMain(String name,int n){
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
		StaticVariableMain sc1=new StaticVariableMain("manuel",10);
		sc1.show();
		
		StaticVariableMain sc2=new StaticVariableMain("rahul",12);
		sc2.show();
		
		
	}

}
