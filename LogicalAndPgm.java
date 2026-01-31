import java.util.Scanner;
class LogicalAndPgm{
	public static void main(String args[]){
		int dbAge=18;
		String dbCitizen="indian";
		Scanner sc=new Scanner(System.in);
		
		int age;
		String citizen;

		System.out.println("enter the age");
		age=sc.nextInt();
		System.out.println("enter the nationality");
		citizen=sc.next();
		
		if(age==dbAge && citizen.equals(dbCitizen)){
			System.out.println("you are eligible to vote");
		}
		else{
			System.out.println("you are not eligible to vote");
		}
		
	}
}