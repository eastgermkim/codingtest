package programmers_level1;

import java.util.*;


public class Leve1_42889 {
	 public int[] solution(int N, int[] stages) {
	        int[] answer = new int[N];
	        double[][] result = new double[N][2];
	        		
	        for (int i = 0; i < N; i++) {
	        	int failDown = 0;
	        	int failUp = 0;
	        	for (int j = 0; j < stages.length; j++) {
					if(stages[j] > i) {
						failDown++;
					}
					if(stages[j] == i+1) {
						failUp ++;
					}
				}
	        	result[i][0] = i+1;
	        	if(failDown == 0) {
	        		result[i][1] = 0;
	        	}else {
	        		result[i][1] = (double)failUp/failDown;
	        	}
			}

	       Arrays.sort(result,(o1, o2) ->{
	    	   if(o1[0] == o2[0]) {
	    		   return Double.compare(o1[0], o2[0]);
	    	   }else {
	    		   return Double.compare(o2[1], o1[1]);
	    	   }
	       });

	       for (int i = 0; i < answer.length; i++) {
			answer[i] = (int)result[i][0];
		} 
	       
	        return answer;
	    }
	
	 
	 public static void main(String[] args) {
		Leve1_42889 leve1_42889 = new Leve1_42889();
		int N = 5;
		int[] stages = {4,4,4,4};
		System.out.println(Arrays.toString(leve1_42889.solution(N, stages)));
	}
}
