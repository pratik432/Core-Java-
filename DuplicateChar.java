package Problems;

public class DuplicateChar {

	public static void main(String[] args) {

		DuplicateChar.check("MADAM");
	}

	public static void check(String S) {
		int distinct = 0;
		S.toLowerCase();
		for (int i = 0; i < S.length(); i++) {
			for (int j = 0; j <= S.length() - 1; j++) {

				if (S.charAt(i) == S.charAt(j))
					distinct++;
			}
			
			System.out.println(S.charAt(i)+"---"+distinct);
			distinct=0;
		}

	}

}
