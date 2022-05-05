package programmers_level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Level2_42587 {
	 public int solution(int[] priorities, int location) {
	        int answer = 0;
	        int target = priorities[location];
	        
	        Queue<Integer> qu = new LinkedList<>();
	        
	        for (int i = 0; i < priorities.length; i++) {
				qu.add(priorities[i]);
			}
	        
	        while(qu.size() != 0) {
	        	int max = Collections.max(qu);
	        	System.out.println(qu);
	        	System.out.println("max:" + max);
	        	System.out.println("location:"+location);
	        	System.out.println("-------------------------");
	        		//qu 다음 애들중에 큰 값 있으면
	        		if(qu.peek() < max) {
	        			qu.add(qu.poll());
	        		}else {
	        			answer ++;
	        			if(qu.peek() == target && location == 0)break;
	        			qu.poll();
				}
        		location--; 
        		if(location < 0) {
        			location = qu.size()-1;
        		}
	        }
	        
	        return answer;
	    }
	 
	 
	public static void main(String[] args) {
		Level2_42587 level2_42587 = new Level2_42587();
		int[] priorities = {2, 1, 2, 1, 2, 1, 2, 1, 2};
		int location = 1;
//		int[] priorities = {1, 1, 9, 1, 1, 1};
//		int location = 0;
		
//		int[] priorities = {2, 1, 3, 2};
//		int location = 2;
		
		System.out.println(level2_42587.solution(priorities, location));
		
	}
	
}
