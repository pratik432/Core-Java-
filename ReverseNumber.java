package Problems;

public class ReverseNumber {
	
	static void reverseNumber(int n) {
		int org=n,rem,sum=0;
		while(n!=0) {
		rem=n%10;
		sum=(sum*10)+rem;
		n=n/10;
		}
		if(sum==org) 
		System.out.println("This is reverse Number: " + sum);
		
	}

	public static void main(String[] args) {
		ReverseNumber.reverseNumber(55555);

	}

}
