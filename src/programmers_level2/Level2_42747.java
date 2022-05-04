package programmers_level2;

import java.util.Arrays;
import java.util.Collections;

public class Level2_42747 {
	 public int solution(int[] citations) {
	        int answer = 0;
	        
	        Arrays.sort(citations);
	        System.out.println(Arrays.toString(citations));
	        
	        for (int i = citations.length; i > 0; i--) {
				int h = i;
				int cnt = 0;
				for (int j = 0; j < citations.length; j++) {
					if(citations[j] >= h) {
						cnt ++;
					}
				}
				if(cnt >= h && citations.length-cnt <= h) {
					System.out.println(h);
					answer = h;
					break;
				}
			}
	        
	        return answer;
	    }
	 
	 
	public static void main(String[] args) {
		Level2_42747 level2_42747 = new Level2_42747();
		int[] citations = {10,10,10,10,10};
		System.out.println(level2_42747.solution(citations));
	}

}
