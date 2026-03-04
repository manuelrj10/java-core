package nestedclass;
class Outer2{
	String name;
	String job;
	static String place="erakulam";
	void show() {
		class local_inner{
			String Education;
			int age;
			void display() {
				System.out.println("name "+name);//name is not static
				System.out.println("job"+job);//job is not static
				System.out.println("Education "+Education);
				System.out.println("age"+age);
				System.out.println("place"+place);
				System.out.println("inside display method");
			}
		}
		local_inner li=new local_inner();
		li.Education="MCA";
		li.age=24;
		li.display();
	}

public class LocalInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer2 out=new Outer2();
		out.name="manuel";
		out.job="google";
		out.show();
	}

}
