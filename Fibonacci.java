package Problems;

public class Fibonacci {
	static void checkFibo(int x) {
		int n1=0,n2=1,n3=0;
		for(int i=2;i<=x;i++) {
			n3=n1+n2;
			System.out.println(" "+n3);
			n1=n2;
			n2=n3;
			
		}
	}
	
	public static void main(String[] args) {
		checkFibo(10);

	}

}
