package programmers_level1;

import java.util.Arrays;

public class Level1_12982 {
	 public int solution(int[] d, int budget) {
	        int answer = 0;
	        Arrays.sort(d);
	        int result = 0;
	        
	        for (int i = 0; i < d.length; i++) {
	        	result = result +d[i];
	        	if(result <= budget) {
	        		answer ++;
	        	}else {
	        		break;
	        	}
	        	System.out.println(i+1+":"+result);
			}
	        
	        
	        return answer;
	    }
	 
	public static void main(String[] args) {
		Level1_12982 level1_12982 = new Level1_12982();
		int[] d = {1,3,2,5,4};
		int budget = 9;
		System.out.println(level1_12982.solution(d, budget));
	}

}
