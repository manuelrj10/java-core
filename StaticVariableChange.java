package oops;

public class StaticVariableChange {
	static int num=0;
	
	StaticVariableChange(){
		num+=10;
	}
	void show() {
		System.out.println(num);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariableChange obj1=new StaticVariableChange();
		obj1.show();
		StaticVariableChange obj2=new StaticVariableChange();
		obj2.show();
		StaticVariableChange obj3=new StaticVariableChange();
		obj3  .show();
		
	}

}
