package programmers_level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Level2_42586 {
	public int[] solution(int[] progresses, int[] speeds) {
		ArrayList<Integer> result = new ArrayList<>();
        
        Queue<Integer> qu = new LinkedList<>();
        Queue<Integer> qu_s = new LinkedList<>();
        
        for (int i = 0; i < speeds.length; i++) {
        	qu.add(progresses[i]);
			qu_s.add(speeds[i]);
		}
        
        while(!qu.isEmpty()) {
        	int cnt= 0;
        	
        	if(qu.peek() >= 100) {
        		while(qu.peek() >= 100){
        			qu.poll();
        			qu_s.poll();
        			cnt ++;
        			if(qu.isEmpty())break;
        		}
        	}else {
        		for (int i = 0; i < qu.size(); i++) {
        			System.out.println(qu);
        			qu.add(qu.peek() + qu_s.peek());
        			qu_s.add(qu_s.peek());
					qu.poll();
					qu_s.poll();
				}
        	}
        	System.out.println(cnt);
        	if(cnt != 0) {
        		result.add(cnt);
        	}
        }
        
        int size = result.size();
        
        int[] answer = new int[size];
        for (int i = 0; i < result.size(); i++) {
        	answer[i] = result.get(i);
		}
        System.out.println(Arrays.toString(answer));
        
        return answer;
    }
	
	public static void main(String[] args) {
		Level2_42586 level2_42586 = new Level2_42586();
		int[] progresses = {93, 30, 55, 60, 40, 65};
		int[] speeds = {1, 30, 5 , 10, 60, 7};
//		int[] progresses = {40, 93, 30, 55, 60, 65};
//		int[] speeds = {60, 1, 30, 5 , 10, 7};
		System.out.println(level2_42586.solution(progresses, speeds));
	}
}
