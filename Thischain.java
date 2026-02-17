
package oops;

public class Thischain {
	String name;
	int num;
	int phno;
	Thischain(){
		System.out.println("hello guyz");
	}
	Thischain(int phno){
		this();
		System.out.println("this is my phno"+phno);
		
	}
	Thischain(String name,int num){
		this(82);
		this.name=name;
		this.num=num;
	}
	void display() {
		System.out.println("ny name is "+name+"and"+num+"and"+phno);
	}
	public static void main(String[] args) {
		Thischain th=new Thischain("manuel",89);
		th.display();
		
		
	}

}
