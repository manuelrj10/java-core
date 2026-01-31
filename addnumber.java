import java.util.Scanner;
class addnumber{
public static void main(String args[]){
int first;
int second;
int sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the first number");
first=sc.nextInt();
System.out.println("enter the second number");
second=sc.nextInt();
sum=first+second;
System.out.println("sum of " + first + " and " + second + " is " + sum);


}
}