package programmers_level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Level2_12939 {
	 public String solution(String s) {
	        String answer = "";
	        
	        List<String> al = new ArrayList<>();
	        List<Integer> al2 = new ArrayList<>();
	        
	        al = Arrays.asList(s.split(" "));
	        
	        for (int i = 0; i < al.size(); i++) {
				al2.add(Integer.parseInt(al.get(i)));
			}
	        
	        int max = Collections.max(al2);
	        int min = Collections.min(al2);
	        
	        answer = min +" "+ max + "";
	        
	        return answer;
	    }
	
	
	public static void main(String[] args) {
		Level2_12939 level2_12939 = new Level2_12939();
		String s = "1 2 -3 4";
		System.out.println(level2_12939.solution(s));
	}

}
