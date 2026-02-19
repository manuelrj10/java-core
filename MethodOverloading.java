package oops;

public class MethodOverloading {
		void study() {
			System.out.println("completed pg");
		}
		void study(String university) {
			System.out.println("in "+university+"university");
			
		}
		void study(String stream,int year) {
			System.out.println("Speacialization in"+stream+"in the academic year"+year);
		}
		double study(double cgpa,String graduation) {
			System.out.println("i have "+cgpa+"in my "+graduation+"degree");
			return cgpa;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj=new MethodOverloading();
		obj.study();
		obj.study("mits");
		obj.study(" cs ", 2025);
		obj.study(7.5," MCA " );

	}

}
