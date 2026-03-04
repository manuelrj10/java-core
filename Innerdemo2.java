package nestedclass;



class Outer1{
	String name;
	String job;
	static String place="erakulam";
	void show() {
		System.out.println("name "+name);
		System.out.println("job"+job);
		System.out.println("place"+place);
		System.out.println("inside show method");
	}
	//static nested class
	public static class innerclass{
		String education;
		int year;
		void display() {
			//System.out.println("name "+name);//name is not static
			//System.out.println("job"+job);//job is not static
			System.out.println("name "+education);
			System.out.println("job"+year);
			System.out.println("place"+place);
			System.out.println("inside display method");
		}
		
	}
}

public class Innerdemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer1.innerclass inner = new Outer1.innerclass();
		inner.education="MCA";
		inner.year=2023;
		inner.display();

	}

}
