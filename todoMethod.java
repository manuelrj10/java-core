package methods;

public class todoMethod {
	void details() {//no arguemnet or return type
		String name="manuel";
		int roll=10;
		System.out.println("name"+name);
		System.out.println("roll"+roll);
		
	}
	int inputage(int age) {//with arguement and return type
		return age;
	}
	void address(String address) {//with arguement and no return type
		System.out.println("address is"+address);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		todoMethod m=new todoMethod();
		m.details();
		System.out.println("age "+m.inputage(23));
		String addres="kochi,kerala,india";
		m.address(addres);
		

	}

}
