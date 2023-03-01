import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortedHashMap {
	
	
	
	public static void main(String[] args) {
	
		HashMap<String, Integer> map =new HashMap<String, Integer>();
		
		map.put("a", 3);
		map.put("b", 2);
		map.put("c", 1);

		System.out.println("elements before sorting" +map);
		
       LinkedHashMap<String, Integer> map2 = map.entrySet().stream().sorted((e1,e2) ->{
	
	return e1.getValue()-e2.getValue();
	}).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2) -> e1,LinkedHashMap::new));
	

		System.out.println("elements after sorting" + map2);;
		
	}

}
