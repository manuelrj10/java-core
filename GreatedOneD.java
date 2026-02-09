package arrayx;

import java.util.Scanner;

public class GreatedOneD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("greated element is");
		int max=0;
		for(int num:arr) {
			if(num>max) {
				max=num;
			}
		}
		System.out.println(max);
	}

}
