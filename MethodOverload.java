package oops;

public class MethodOverload {
	void main(String name) {
		System.out.println(name);
	}
	void main(int age) {
		System.out.println("age "+age);
	}
	public static void main() {
		System.out.println("hi");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		main();
		MethodOverload ov=new MethodOverload();
		ov.main(10);
		ov.main("rshul");
		

	}

}
