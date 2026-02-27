
public class fibinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first = 0;
		int second = 1;
		int sum = 0;

		int n = 10;
		System.out.println(first);
		System.out.println(second);
		for (int i = 3; i <= n; i++) {
			sum = first + second;
			System.out.println(sum);
			first = second;
			second = sum;

		}

	}

}
