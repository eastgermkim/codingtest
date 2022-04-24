package programmers;

import java.util.*;

public class DivideNumberArray {
	public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<Integer>(); 
        
        for (int i = 0; i < arr.length; i++) {
			if(arr[i] % divisor == 0) {
				list.add(arr[i]);
			}
		}
        
        int[] answer = new int[list.size()];
        
        if(list.isEmpty()) {
        	answer = new int[1];
        	answer[0] = -1;
        }else {
        	for (int i = 0; i < list.size(); i++) {
    			answer[i] = list.get(i).intValue();
    		}
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
	
	public static void main(String[] args) {
		DivideNumberArray dna = new DivideNumberArray();
		int[] testArr = {3,2,6};
		
		System.out.println(Arrays.toString(dna.solution(testArr, 10)));
	}
}
