package Problems;

public class Strrev {

	public static void main(String args[]) {
		Strrev.EmptyStr("madam");
		
		boolean rev=Strrev.Pall("Madm");
		if(rev) System.out.println("Pallindrome");
		else System.out.println("Not Pallindrome");

	}

	//String Pallindrome
	public static void EmptyStr(String L) {
		String M = "";
		L = L.toLowerCase();
		for (int i = L.length() - 1; i >= 0; i--) {
			M = M + L.charAt(i);

		}

		if (M.equals(L))
			System.out.println(L+" is Pallindrome");

		else
			System.out.println(L+"is not Pallindrome");

	}
	
	public static boolean Pall(String S) {
		int len=S.length();
		S=S.toLowerCase();
		for(int i=0;i<=len/2;i++) {
			if(S.charAt(i)!=S.charAt(len-1-i))
				return true;
		}
		return false;
	}

}
