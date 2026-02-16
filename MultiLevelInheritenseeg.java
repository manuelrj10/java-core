package oops;
import java.util.Scanner;
class Institute{
	void iDetails(String type) {
	System.out.println("IT training institute"+type);
	}
}
class luminar extends Institute{
	void Ldetails(String locstion,int number_Of_batches,int No_of_days,String ceo){
		System.out.println("Location "+locstion);
		System.out.println("Number of batches "+number_Of_batches);
		System.out.println("number of working days "+No_of_days);
		System.out.println("ceo name "+ceo);
		
	}
}
class course extends luminar{
	void CDetails(String course) {
	System.out.println("course"+course);
}
}
public class MultiLevelInheritenseeg {
	static void greeting() {
		System.out.println("good morning");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		greeting();
		Scanner sc=new Scanner(System.in);
		course c=new course();
		System.out.println("Institute details");
		c.iDetails("IT training institute");
		System.out.println("center details");
		c.Ldetails("kochi",10,5,"rahul");
		System.out.println("your course details");
		c.CDetails("java Spring boot");
		
		
		
		

	}

}
