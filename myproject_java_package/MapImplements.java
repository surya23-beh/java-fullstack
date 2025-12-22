package myproject_java_package;

import java.util.HashMap;
import java.util.Map;

public class MapImplements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Map<String,Integer> scores = new HashMap<>();
	scores.put("john", 90);
	scores.put("jayanthi", 60);
	scores.put("janani", 30);
	System.out.println(scores);
	System.out.println(" get usage : "+scores.get("john"));
	System.out.println(" contains key jayanthi ?"+scores.containsKey("jayanthi"));
	System.out.println(" size of the map :"+scores.size());
	System.out.println(" contains 50? "+scores.containsValue(50));
	
	}

}
