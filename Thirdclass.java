package accessdemo2;

import accesdemo1.firstclass;
import accesdemo1.secondclass;

public class Thirdclass extends firstclass {
	void method3() {
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(x);
	}

	public static void main(String args[]) {
		firstclass f = new firstclass();
		f.print();
//		System.out.println(f.i);
//		System.out.println(f.j);//protected
//		System.out.println(f.k);//private
//		System.out.println(f.x);//default

		Thirdclass s = new Thirdclass();
//		System.out.println(s.i);
//		System.out.println(s.j);
//		System.out.println(s.k);
//		System.out.println(s.x);
	}

}
