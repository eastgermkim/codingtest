package programmers_level1;

import java.util.ArrayList;

public class Level1_1845 {
	
	public int solution(int[] nums) {
        int answer = 0;
        int N = nums.length/2;
        
        ArrayList<Integer> al = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
			if(!al.contains(nums[i])) {
				al.add(nums[i]);
			}
		}
        if(al.size()>N) {
        	answer = N;
        }else if(al.size() <= N){
        	answer = al.size();
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		Level1_1845 level1_1845 = new Level1_1845();
		int[] nums = {3,3,3,2,2,2};
		System.out.println(level1_1845.solution(nums));
	}

}
