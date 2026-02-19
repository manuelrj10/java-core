package oops;
class teacher{
	void proffesion(){
		System.out.println("i teach students");
	}
}
class student extends teacher{
	
	void proffesion() {
		
		System.out.println("i learn");
		
	}
}

public class MethodOverinding {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student st=new student();
		st.proffesion();

	}

}
