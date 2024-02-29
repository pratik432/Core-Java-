package Problems;

import java.util.Arrays;

public class Practice {

	// String Pallindrome
	static void StringPall(String S) {
		String m = "";
		String S1 = S.toLowerCase();
		for (int i = S1.length() - 1; i >= 0; i--) {
			m = m + S1.charAt(i);

		}

		if (S1.equals(m))
			System.out.println(S1 + " --Pallindrome-- " + m);
		else
			System.out.println(S1 + " --Not Pallindrome-- " + m);

	}

	// Number Pallindrome
	static void NumPall(int n) {
		int org = n, rem = 0, sum = 0;
		while (n > 0) {
			rem = n % 10;
			sum = sum * 10 + rem;
			n = n / 10;
		}
		if (org == sum)
			System.out.println(sum + " is Pallindrome");
		else
			System.out.println(sum + " is not Pallindrome");
	}

	// Prime no.
	static void isPrime(int n) {
		boolean b = true;
		if (n <= 1)
			b = false;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				b = false;
		}
		if (b)
			System.out.println(n + " Prime");
		else
			System.out.println(n + " Not prime");
	}

	// Fibonacci
	static void isFibo(int n) {
		int n1 = 0, n2 = 1, n3;
		System.out.print(n1 + " " + n2);
		for (int i = 0; i <= n; i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
	}

	// Anagram
	static void isAnag(String s1, String s2) {
		// remove whitespace
		s1 = s1.replaceAll("//s", "");
		s2 = s2.replaceAll("//s", "");
		boolean b = true;
		System.out.println("");
		if (s1.length() != s2.length())
			b = false;
		else {
			char[] arr1 = s1.toLowerCase().toCharArray();
			char[] arr2 = s2.toLowerCase().toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			b = Arrays.equals(arr1, arr2);

		}
		if(b) System.out.println("Anagram");
		else System.out.println("Not Anagram");
	}

	public static void main(String[] args) {
		StringPall("Madam");
		NumPall(777);
		isPrime(6);
		isFibo(10);
		isAnag("madam","daamm");

	}

}
