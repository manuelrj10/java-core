package arrayx;
import java.util.Scanner;

public class TwoDArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row sized");
		int rSize=sc.nextInt();
		System.out.println("enter the column size");
		int cSize=sc.nextInt();
		int[][] arr =new int[rSize][cSize];
		System.out.println("enter the array elements");
		for(int i=0;i<rSize;i++) {
			for( int j=0;j<cSize;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Array  elemensts are");
		for(int i=0;i<rSize;i++) {
			for( int j=0;j<cSize;j++) {
				System.out.print(" "+arr[i][j]);
			}
			System.out.println(" ");
		}
		
		
		
		

	}

}
