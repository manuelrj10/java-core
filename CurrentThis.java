package oops;
class demo{
	demo(CurrentThis thisfc){
		System.out.println(thisfc);
	}
}

public class CurrentThis {
	CurrentThis(){
		demo d=new demo(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrentThis obj1=new CurrentThis();

	}

}
