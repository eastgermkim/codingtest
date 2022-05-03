package programmers_level2;

import java.util.Arrays;
import java.util.Collections;

public class Level2_42747 {
	 public int solution(int[] citations) {
	        int answer = 0;
	        
	        Arrays.sort(citations);
	        System.out.println(Arrays.toString(citations));
	        
	        for (int i = citations.length-1; i > 0; i--) {
				int h =citations[i];
				int cnt = 0;
				for (int j = 0; j < citations.length; j++) {
					
				}
			}
	        
	        return answer;
	    }
	 
	 
	public static void main(String[] args) {
		Level2_42747 level2_42747 = new Level2_42747();
		int[] citations = {3, 0, 6, 1, 5};
		System.out.println(level2_42747.solution(citations));
	}

}
