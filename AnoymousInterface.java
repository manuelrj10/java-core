package nestedclass;
interface job{
	void show();
}

public class AnoymousInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		job j=new job() {
			
			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println("hi boss");
				
			}
		};
		j.show();

	}

}
