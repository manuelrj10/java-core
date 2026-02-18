package oops;

class Car{
	String name="bmw";
	void display(String color,int model) {
		System.out.println("color:"+color);
		System.out.println("Model:"+model);
	}
	
}
class Alto extends Car{
	String name="q7";
	{
		System.out.println(super.name+" "+name);
	}
}


public class SuperKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alto a=new Alto();
		a.display("black", 2019);

	}

}
