package programmers;

import java.util.Arrays;

public class Level1_77484 {
	 public int[] solution(int[] lottos, int[] win_nums) {
		 int[] answer = new int[2];
	        int min = 0;
	        int zero_num = 0;
	        
	        for (int i = 0; i < 6; i++) {
	        	for (int j = 0; j < 6; j++) {
	        		if(lottos[i] == win_nums[j]) {
	        			min++;
	        			}
	        		}
		        	if(lottos[i] == 0) {
		        		zero_num++;
				}
			}
	        
	        
	        System.out.println(min);
	        System.out.println(zero_num);
	        
	        int[][] rank = {{1,6},{2,5},{3,4},{4,3},{5,2},{6,1}};
	        
	        int max_rank = 0;
	        int min_rank = 0;
	        
	        for (int i = 0; i < rank.length; i++) {
	        	if(rank[i][1] == min +zero_num) {
	        		max_rank = rank[i][0];
	        	}
	        	if(rank[i][1] == min) {
	        		min_rank = rank[i][0];
	        	}
			}
	        
	        if(min_rank == 0) {
	        	min_rank = 6;
	        }
	        if(max_rank == 0) {
	        	max_rank = 6;
	        }
	        
	        answer[0] = max_rank;
	        answer[1] = min_rank;
	        
	        return answer;
	    }
	 
	 public static void main(String[] args) {
		Level1_77484 level1_77484 = new Level1_77484();
		int[] lottos = {1,2,3,4,5,11};
		int[] win_nums = {7,8,9,10,12,6};
		System.out.println(Arrays.toString(level1_77484.solution(lottos, win_nums)));
	}
}
