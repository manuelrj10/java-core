class Students{
	//instance variable
	String name;
	int rollno;
	long phno;
	float cgpa;
	char gender;
	String email;
	static String COURCE="java spring boot";
	
	public static void main(String[]  args){
			
			Students st1=new Students();
			st1.name="manuel";
			st1.rollno=10;
			st1.phno=8281809178l;
			st1.cgpa=9.8f;
			st1.gender='m';
			
			System.out.println("student 1");
			System.out.println("name is "+st1.name);
			System.out.println("rollno is "+st1.rollno);
			System.out.println("phno is "+st1.phno);
			System.out.println("cgpa is "+st1.cgpa);
			System.out.println("gender is "+st1.gender);
			System.out.println("email is "+(st1.email="manuelrajesh392gmail.com"));
			System.out.println("name is "+Students.COURCE);
			
			
			Students st2=new Students();
			System.out.println("\n");
			System.out.println("student 2");
			System.out.println("name is "+(st2.name="rahul"));
			System.out.println("rollno is "+(st2.rollno=12));
			System.out.println("phno is "+(st2.phno=9037841978l));
			System.out.println("cgpa is "+(st2.cgpa=8.8f));
			System.out.println("gender is "+(st2.gender='m'));
			System.out.println("email is "+(st2.email="manuelrajesh3s2gmail.com"));
			System.out.println("name is "+Students.COURCE);
			
			Students st3 =new Students();
			System.out.println("\n");
			System.out.println("student 3");
			System.out.println("name is :"+(st3.name="sharma"));
			st3.rollno=99;
			System.out.println("rollno is "+(st3.rollno));
			System.out.println("phno is "+(st3.phno=93929282992l));
			st3.cgpa=6.5f;
			System.out.println("cgpa is"+(st3.cgpa));
			System.out.println("gender is "+(st3.gender='m'));
			System.out.println("email is "+(st3.email="sharma3s2gmail.com"));
			System.out.println("name is "+Students.COURCE);
			
			
			
			
			
			
	}
}