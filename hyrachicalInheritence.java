

class fathe1r{
	void fdetails() {
	System.out.println("fathers name is benz");
}
}
class son extends fathe1r{
	void sdetails() {
		System.out.println("name is audi");
	}
}
class daughter extends fathe1r{
	void ddetails() {
		System.out.println("name is bmw");
	}
}

public class hyrachicalInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		son s=new son();
		daughter d=new daughter();
		
		System.out.println("son details");
		s.fdetails();
		s.sdetails();
		System.out.println("daughter details");
		d.fdetails();
		d.ddetails();
		
		

	}

}
