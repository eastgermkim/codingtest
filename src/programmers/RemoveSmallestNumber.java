package programmers;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class RemoveSmallestNumber {
    public int[] solution(int[] arr) {
        int[] answer = {};
       LinkedList<Integer> list = new LinkedList<Integer>();
        
       for(int i = 0; i< arr.length; i++) {
    	   list.add(arr[i]);
       }
       
       if(list.size() != 1) {
    	   list.remove(Collections.min(list));
    	   
    	   answer = new int[list.size()];
    	   for(int i = 0; i < list.size(); i++) {
    		   answer[i] = list.get(i);
    	   }
       }else {
    	   answer = new int[]{-1};
       }
       
        
        return answer;
    }
}
