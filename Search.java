package arrayx;
import java.util.Arrays;
import java.util.Scanner;


public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="manuel";
		Scanner sc=new Scanner(System.in);
		char[] arr=name.toCharArray();
		System.out.println(Arrays.toString(arr));
		System.out.println("enter a character");
		char word=sc.next().charAt(0);
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals(word)) {
				System.out.println("true");
				fla
			}
			else {
				System.out.println("false");
				break;
			}
		}
		
		
		

	}

}
