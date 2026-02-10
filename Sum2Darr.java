package arrayx;
import java.util.Scanner;

public class Sum2Darr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("first array");
		System.out.println("enter the row sized");
		int rSize1=sc.nextInt();
		System.out.println("enter the column size");
		int cSize1=sc.nextInt();
		int[][] arr1 =new int[rSize1][cSize1];
		System.out.println("enter the array elements");
		for(int i=0;i<rSize1;i++) {
			for( int j=0;j<cSize1;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("second array");
		System.out.println("enter the row sized");
		int rSize2=sc.nextInt();
		System.out.println("enter the column size");
		int cSize2=sc.nextInt();
		int[][] arr2 =new int[rSize2][cSize2];
		System.out.println("enter the array elements");
		for(int i=0;i<rSize2;i++) {
			for( int j=0;j<cSize2;j++) {
				arr2[i][j]=sc.nextInt();
			}
		}
		System.out.println("after addition");
		int[][] arr3 =new int[rSize2][cSize2];
		for(int i=0;i<rSize2;i++) {
			for( int j=0;j<cSize2;j++) {
				arr3[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		if(rSize2==rSize1 && cSize2==cSize1) {
		for(int i=0;i<rSize2;i++) {
			for( int j=0;j<cSize2;j++) {
				arr3[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		for(int i=0;i<rSize2;i++) {
			for( int j=0;j<cSize2;j++) {
				System.out.print(" "+arr3[i][j]);
			}
			System.out.println(" ");
		}
		}
		else {
			System.out.println("array adition not possible");
		}
		
		
		

	}

}
