package java_eclipse;
import java.util.Scanner;
public class doWhileCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		do {
			System.out.println("enter two number");
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			System.out.println("1)addition\n2)substration\n3)multiplication\n4)divisiontion\n5)modulus\n6)exit\n");
			System.out.println("enter your choice");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("sum"+(num1+num2));
				break;
			case 2:
				System.out.println("dif"+(num1-num2));
				break;
			case 3:
				System.out.println("product"+(num1*num2));
				break;
			case 4:
				System.out.println("quotient"+(num1/num2));
				break;
			case 5:
				System.out.println("reminder"+(num1%num2));
				break;
			case 6:
				System.exit(0);
			
			default:
				System.out.println("invlid option");
			}
			System.out.println("do you want to continue Y/y");
			char option=sc.next().charAt(0);
			if(option=='y'||option=='Y') {
				continue;
			}
			else {
				System.out.println("adios amigo");
				break;
			}
		
		}while(true);
		}

	}


