package oops;
interface first1{
	int show();
	}
interface second1{
	int show(int num);
	
}
class third1 implements first1, second1{
	public int  show(int num) {
		
		return num;	}
	public int  show() {
		
		return 200;	}
	

}

public class intefacediffpara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		third t=new third();
		int num=t.show(20);
		System.out.println(num);
	}

}
