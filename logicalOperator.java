import java.util.Scanner;

class logicalOperator{
	public static void main(String args[]){
		String dbuserName="manuelrajesh@gmail.com";
		String dbpassWord="manuel@123";
		String userName;
		String passWord;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter username");
		userName=sc.nextLine();
		System.out.println("enter the passWord");
		passWord=sc.nextLine();
		if( userName.equals(dbuserName) && passWord.equals(dbpassWord)){
			
			System.out.println("welocome back,Manuel");
			
		}
		else{
			
			System.out.println("invalid username and password");
			
		}
	}
}
		
		
	