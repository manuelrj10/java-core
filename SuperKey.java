package oops;

class Car{
	String name="bmw";
	//default constructor =it will be automaticallu invloked whike we create child class objexct
//	Car(){
//		System.out.println("heloo my car");
//		
//	}
	//for parametrised constructor
	Car(int count){
		System.out.println("heloo my car.i have "+count+"cars");
	}
	void display(String color,int model) {
		System.out.println("color:"+color);
		System.out.println("Model:"+model);
	}
	
}
class Alto extends Car{
	Alto(int count) {
		super(count);//we must define this constructor since parent class has paramentrised constructor
		// TODO Auto-generated constructor stub
	}
	String name="q7";
	{
		System.out.println(super.name+" "+name);
	}
}


public class SuperKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alto a=new Alto(3);
		a.display("black", 2019);

	}

}
