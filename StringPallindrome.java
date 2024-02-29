package Problems;

public class StringPallindrome {
 public static void Pallindrome(String S) {
	 String empty="";
	 S=S.toLowerCase();
	 for(int i= S.length()-1;i>=0;i--) {
		 empty=empty+S.charAt(i);
	 }
	 
	 if(empty.equals(S))
		 System.out.println(S+" is Pallindrome ");
	 else
		 System.out.println(S+" Not pallindrome ");
 }
 public static void main(String args[]) {
	 StringPallindrome.Pallindrome("Madm");
 }
}
