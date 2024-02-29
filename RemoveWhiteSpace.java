package Problems;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st= " Indoor Game - Table Tennis ";
		st = st.replaceAll("\\s+","");
		System.out.println(st);
	}

}
