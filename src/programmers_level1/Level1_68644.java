package programmers_level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Level1_68644 {
	 public Integer[] solution(int[] numbers) {
	        Integer[] answer = {};
	        
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        
	        for (int i = 0; i < numbers.length; i++) {
				for (int j = i+1; j < numbers.length; j++) {
					if(!list.contains(numbers[i] + numbers[j]))
					list.add(numbers[i] + numbers[j]);
				}
			}
	        
	        Collections.sort(list);
	        answer = list.toArray(new Integer[list.size()]);
	        return answer;
	    }
	 
	 public static void main(String[] args) {
		Level1_68644 level1_68644 = new Level1_68644();
		int[] numbers = {2,1,3,4,1};
		System.out.println(Arrays.toString(level1_68644.solution(numbers)));
	}
}
