package oops;

public class PolyCalc {
	void sum(int num1, int num2) {
		System.out.println("sum is " + (num1 + num2));

	}

	void sum(double num1, double num2) {
		System.out.println("sum is " + (num1 + num2));

	}

	void sum(int num1, int num2, int num3) {
		System.out.println("sum is " + (num1 + num2 + num3));

	}

	double sum(int num1, double num2) {
		double sum = num1 + num2;
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolyCalc pc = new PolyCalc();
		pc.sum(1, 2);
		pc.sum(1.5, 1.6);
		pc.sum(1, 2, 3);
		double sum1 = pc.sum(5, 5.5);
		System.out.println(sum1);
	}

}
