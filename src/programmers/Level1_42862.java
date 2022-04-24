package programmers;

import java.util.Arrays;

public class Level1_42862 {
	 public int solution(int n, int[] lost, int[] reserve) {
		 //answer는 먼저 lost의 수만큼 빠져 있다
	        int answer = n-lost.length;
        
            Arrays.sort(lost);
            Arrays.sort(reserve);
	        
	        for (int i = 0; i < lost.length; i++) {
				for (int j = 0; j < reserve.length; j++) {
					if(lost[i] == reserve[j]) {
						answer++;
                        reserve[j] = -1;
                        lost[i] = -1;
						break;
					}
				}
			}
	        
	        for(int k : lost) {
	        	for(int i = 0; i< reserve.length; i++) {
	        		if(k == reserve[i]-1 || k == reserve[i]+1) {
	        			answer += 1;
	        			reserve[i] = -1;
	        			break;
	        		}
	        	}
	        }
	        
	        
	        return answer;
	    }
	 
	 public static void main(String[] args) {
		Level1_42862 level1_42862 = new Level1_42862();
		int n = 3;
		int[] lost = {3};
		int[] reserve = {3};
		System.out.println(level1_42862.solution(n, lost, reserve));
	}
}
