package Problems;

public class Reverseastring {
	
	public static void reverseString(String s) {
		String m="";
		for(int i=s.length()-1;i>=0;i--) {
			m=m+s.charAt(i);
			
		}
		System.out.print(m);
	}

 public static void main (String args[]) {
	 Reverseastring.reverseString("Madam1");
 }
 
}
