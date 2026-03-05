package nestedclass;

class Students{
	String name;
	Students(String name){
		this.name=name;
	}
}
class departement{
	String depar;
	Students student;
	departement(String depar, Students student){
		this.depar=depar;
		this.student=student;
	}
}
public class AggregationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s=new Students("manuel");
		departement d =new departement("mca",s);
		System.out.println(d.depar+" "+d.student.name);
				

	}

}
