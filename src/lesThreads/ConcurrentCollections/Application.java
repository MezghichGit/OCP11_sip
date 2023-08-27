package lesThreads.ConcurrentCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Application {

	public static void main(String[] args) {
		
		//Map<String,Object> foodData = new HashMap<>();
		Map<String,Object> foodData = new ConcurrentHashMap<>();
		foodData.put("ab",1);
		foodData.put("cd",2);
		
		for(String s : foodData.keySet())
		{
			foodData.remove(s);
		}

	}

}
