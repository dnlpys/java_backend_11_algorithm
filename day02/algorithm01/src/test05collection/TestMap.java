package test05collection;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("id", "admin");
		map.put("pw", "hi12");
		map.put("result", "1");
		
		System.out.println(map);
		System.out.println(map.get("id"));
		System.out.println();
		
		for (String key : map.keySet()) {
			System.out.println(key+":"+map.get(key));
		}
		
		
	}//end main

}//end class
