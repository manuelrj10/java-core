package arrayx;

public class PosOrNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {-1,2,3,-5,9,0};
		int post=0;
		int neg=0;
		int zero=0;
		for(int num:arr) {
			if(num>0) {
				post++;
			}
			else if(num<0) {
				neg++;
			}
			else {
				zero++;
			}
		}
		System.out.println("positive numbers count"+post);
		System.out.println("negative numbers count"+neg);
		System.out.println("zero count"+zero);

	}

}
