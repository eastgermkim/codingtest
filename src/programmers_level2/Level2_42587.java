package programmers_level2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Level2_42587 {
	 public int solution(int[] priorities, int location) {
	        int answer = 0;
	        
	        Queue<Integer> qu = new LinkedList<>();
	        
	        
	        for (int i = 0; i < priorities.length; i++) {
				qu.add(priorities[i]);
			}
	        
	        //최댓값
	        Arrays.sort(priorities);
	        int max = priorities[priorities.length-1];
	        System.out.println(max);
	        
	        for (int i = 0; i < qu.size(); i++) {
	        	if(qu.peek() < max) {
	        		System.out.println("peek:" + qu.peek());
	        		qu.add(qu.peek());
	        		qu.poll();
	        		location --;
	        		System.out.println("location:" + location);
	        		if(location < 0) {
	        			location = qu.size()-1;
	        		}
	        	}else {
	        		break;
	        	}
			}
	        
	        answer = location;
	        
	        return answer+1;
	    }
	 
	 
	public static void main(String[] args) {
		Level2_42587 level2_42587 = new Level2_42587();
		int[] priorities = {1,2};
		int location = 1;
//		int[] priorities = {1, 1, 9, 1, 1, 1};
//		int location = 0;
		
//		int[] priorities = {2, 1, 3, 2};
//		int location = 2;
		
		System.out.println(level2_42587.solution(priorities, location));
		
	}
	
}
