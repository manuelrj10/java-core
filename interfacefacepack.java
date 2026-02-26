package oops;

interface first{
	int show();
	}
interface second{
	int show();
	
}
class third implements first, second{
	public int  show() {
		
		return 100;	}

}

public class interfacefacepack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		third t=new third();
		int num=t.show();
		System.out.println(num);

	}

}
