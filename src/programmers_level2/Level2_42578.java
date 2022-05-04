package programmers_level2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Level2_42578 {
	 public int solution(String[][] clothes) {
	        int answer = 1;
	        
	        Map<String, Integer> map = new HashMap<>();
	       for (String[] cloth : clothes) {
			String category = cloth[1];
			map.put(category, map.getOrDefault(category, 1) + 1);
		}

	       
	       for (String key : map.keySet()) {
	            answer *= map.get(key);
	        }
	       return answer-1;
	        
	    }
	
	
	public static void main(String[] args) {
		Level2_42578 level2_42578 = new Level2_42578();
		
		String[][] clothes = {{"yellowhat", "headgear"}
							,{"bluesunglasses", "eyewear"}
							,{"green_turban", "headgear"}};
		
		System.out.println(level2_42578.solution(clothes));
	}

}
