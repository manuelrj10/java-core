C
import java.util.Scanner;

public class arraypgm1 {
	public static void main(String args[]) {
		
//		int[] num= {10,20,30,40};
//		for(int n:num) {
//			System.out.println("Arrys is"+n);
//		}
//		for(int i=0;i<num.length;i++) {
//			System.out.println(num[i]);
//		}
//		String[] str= {"irfan","jeevan","manuek"};
//		for(String name:str) {
//			System.out.println(name);
//		}
//		int[] RollNo=new int[5];
//		
//		for(int i=0;i<RollNo.length;i++) {
//			System.out.println(RollNo[i]);
//		}
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int n:arr) {
			System.out.println(n);
		}
	}

}
