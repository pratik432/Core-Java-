package Problems;

import java.util.ArrayList;
import java.util.List;

public class ArrayLi {

	public static void main(String[] args) {
		//Declare arraylist
		List<Integer> L = new ArrayList<Integer>();
		// append new element 
		for (int i = 1; i <= 10; i++) {
			L.add(i);

		}
		L.remove(5);
		//Print all element
		for(int a=0;a<L.size()-1;a++) {
			System.out.print(L.get(a)+" ");
		}

	}
}
