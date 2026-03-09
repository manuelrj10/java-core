package String;

public class Stringex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String name="manuel";
//		String fullname=name.concat("rajesh");
//		System.out.println(name);
//		System.out.println(fullname);
//		
//		
//		StringBuilder s2=new StringBuilder("Hello");
//		s2.append("world");
//		System.out.println("using string builder"+s2);
		String demo=new String("manuel");
		String name="manuel";
		String Name="manuel";
		String peru="Manuel";//check the references
		System.out.println(name==Name);
		System.out.println(name==peru);
		System.out.println(demo.equals(name));//checks the content in th refference variable
		System.out.println(Name.compareTo(peru));//compares the askey value here l and L are different
		System.out.println(name.compareTo(Name));
		
		
		
		
		

	}

}
