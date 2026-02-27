package accesdemo1;

public class secondclass extends firstclass {
	void method() {
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(x);
	}
	public static void main(String args[]) {
		firstclass f=new firstclass();
		f.print();
		f.print1();
		f.print3();
		f.print2();
		System.out.println(f.i);
		System.out.println(f.j);
		//System.out.println(f.k);
		System.out.println(f.x);
		
		secondclass s=new secondclass();
		s.print();
		System.out.println(s.i);
		System.out.println(s.j);
		//System.out.println(s.k);
		System.out.println(s.x);
	}
}
