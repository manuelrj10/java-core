package oops;

class Account{
	String email;
	String pass;
	Account(String email,String pass){
		this.email=email;
		this.pass=pass;	}
Account(Account facebook){
	this.email=facebook.email;
	this.pass=facebook.pass;	
	}

void showDetails() {
	System.out.println("email"+email);
	System.out.println("password"+pass);
}
}



public class CopyConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc=new Account("manuelrajesh39@gmail.com","thakolofmanichithrathazhu");
		acc.showDetails();
		Account fb=new Account(acc);
		fb.showDetails();
		

	}

}
