package nestedclass;
interface TransactionAlert{
	void alert();
}

public class BankNotifiaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean status=true;
		
		if(status == true) {
			TransactionAlert tt=new TransactionAlert() {
				
				@Override
				public void alert() {
					// TODO Auto-generated method stub
					System.out.println("transaction is completed");
					
				}
			};
			tt.alert();
		}
		

	}

}
