package Problems;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Stored 5 values 
		Map<String,String> capitals= new HashMap<String,String>();
		capitals.put("India", "New Delhi");
		capitals.put("Afganistan", "Kabul");
		capitals.put("England", "London");
		capitals.put("China", "Beijing");
		capitals.put("Sri lanka", "Colombo");
		System.out.println(capitals);
		//remove
		capitals.remove("England");
		//replace
		capitals.replace("India", "XYZ");
		// Using For-Each Loop
		for(String key: capitals.keySet()) {
			System.out.println(key+"="+capitals.get(key));
		}
	}

}
