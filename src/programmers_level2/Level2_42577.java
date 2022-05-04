package programmers_level2;

import java.util.HashMap;

public class Level2_42577 {
	 public boolean solution(String[] phone_book) {
	        boolean answer = true;
	        
	        HashMap<String, Integer> hm = new HashMap<>();
	        
	        
	        
	        for (int i = 0; i < phone_book.length; i++) {
        		hm.put(phone_book[i],i);
			}
	        
	       for (String phone : phone_book) {
			for (int i = 1; i < phone.length(); i++) {
				String sub = phone.substring(0,i);
				if(hm.containsKey(sub)) return false;
			}
		}
	        
	        return answer;
	    }
	 
	public static void main(String[] args) {
		Level2_42577 level2_42577 = new Level2_42577();
		String[] phone_book = {"119", "97674223", "1195524421"};
		System.out.println(level2_42577.solution(phone_book));
	}

}
