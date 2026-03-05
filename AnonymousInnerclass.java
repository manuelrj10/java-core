package pgm;
abstract class MyAbsClass{
	abstract void show();
}

public class AnonymousInnerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyAbsClass obj =new MyAbsClass() {
			
			@Override
			void show() {
				// TODO Auto-generated method stub
				System.out.println("hi");
				
			}
		};
		obj.show();

	}

}
