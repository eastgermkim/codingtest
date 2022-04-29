package programmers_level2;

import java.util.Arrays;

public class Level2_12951 {
	 public String solution(String s) {
	        String answer = "";
	        String[] split = s.split("");
	        Arrays.asList(split);
	        
	        
	        for (int i = 0; i < split.length; i++) {
	        	split[i] = split[i].toLowerCase();
	        	
				if(i == 0) {
					split[i] = split[i].toUpperCase();
				}else {
					if(split[i-1].equals(" ")) {
						split[i] = split[i].toUpperCase();
					}
				}
			}
	        for (int i = 0; i < split.length; i++) {
				answer += split[i];
			}
	        
	        return answer;
	    }
	
	public static void main(String[] args) {
		Level2_12951 level2_12951 = new Level2_12951();
		String s = "3people Unfollowed Me";
		System.out.println(level2_12951.solution(s));
	}

}
