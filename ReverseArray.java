package pgm;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,78};
		int low=0;
		int high=arr.length-1;
		while(low<high) {
			int temp=arr[high];
			arr[high]=arr[low];
			arr[low]=temp;
			
			low++;
			high--;
		}
		System.out.println(Arrays.toString(arr));
		

	}

}
