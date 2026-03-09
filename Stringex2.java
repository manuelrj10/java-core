package String;

import java.util.Scanner;

public class Stringex2 {

	public static void main(String[] args) {
		String System_pass="Manuel@thakkol";
		String System_username=new String("manuelrajesh39@gmail.com");
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the username");
		String userName=sc.nextLine();
		System.out.println("enter the password");
		String passWord=sc.nextLine();
		if(System_pass.equals(passWord)&&System_username.equals(userName)) {
			System.out.println("welcome boss");
		}
		else {
			System.out.println("invalid user name or password");
		}
		

	}

}
