package accesdemo1;

public class firstclass {
	public int i;
	protected int j;
	private int k;
	int x;
	private firstclass(){
		
	}

	public void print1() {
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(x);
	}
	private void print2() {
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(x);
	}
	protected void print3() {
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(x);
	}
	 void print() {
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(x);
	}

}
