package nestedclass;

class Outer{
	String name;
	String job;
	static String place="erakulam";
	void show() {
		System.out.println("name "+name);
		System.out.println("job"+job);
		System.out.println("place"+place);
		System.out.println("inside show method");
	}
	
	public class innerclass{
		String education;
		int year;
		void display() {
			System.out.println("name "+name);
			System.out.println("job"+job);
			System.out.println("name "+education);
			System.out.println("job"+year);
			System.out.println("place"+place);
			System.out.println("inside display method");
		}
		
	}
}

public class InnerclassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer =new Outer();
		outer.name="manuel";
		outer.job="ust";
		outer.show();
		
		Outer.innerclass inner=outer.new innerclass();
		inner.education="MCA";
		inner.year=2020;
		inner.display();
		

	}

}
