package nestedclass;
interface SubmitAlert{
	void Submissionalert();
}

public class StudentNoti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean status=true;
		if(status==true) {
		SubmitAlert ss=new SubmitAlert() {
			
			@Override
			public void Submissionalert() {
				// TODO Auto-generated method stub
				System.out.println("submission succesful");
				
			}
		};
		ss.Submissionalert();

	}

}
}