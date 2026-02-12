package methods;

public class MethodEx {
	public void add() {
		int a=10;
		int b=30;
		System.out.println("sum is"+(a+b));
	}
	public void sub(int a,int b) {
		System.out.println("differnce"+(a-b));
	}
	public int mul(int a,int b) {
		return a*b;
	}
	public double div(int x,int y) {
		int a=160;
		double divout=x%y;
		System.out.println("Div="+divout);
		return a/7;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodEx m=new MethodEx();
		m.add();
		m.sub(10, 2);
		
		System.out.println(m.mul(10,2));
		double ans=m.div(10,2);
		System.out.println(ans);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
