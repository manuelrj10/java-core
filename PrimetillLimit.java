package java_eclipse;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		outerLoop:
		for(int num=2;num<=100;num++) {
			int count=0;
			innerLoop:
			for(int i=1;i<=num;i++) {
				if(num%i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(num);
			}
		
		}

	}

}
