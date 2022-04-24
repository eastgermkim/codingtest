package programmers;

import java.util.*;

public class IdonwantSameNumber {
	public int[] solution(int []arr) {
		  int[] answer = {};
	        
	        ArrayList<Integer> arrList = new ArrayList<Integer>();
	        
	        int num = 10;
	        for (int i=0; i<arr.length; i++) {
	            if (arr[i] != num) {
	                arrList.add(arr[i]);
	                num = arr[i];
	            } 
	        }
	        
	        answer = new int[arrList.size()];
	        for (int i=0; i<answer.length; i++) {
	            answer[i] = arrList.get(i);
	        }
	        
	        return answer;
	    }
	
	public static void main(String[] args) {
		IdonwantSameNumber idsn = new IdonwantSameNumber();
		int[] test = {1,1,3,3,0,1,1};
		System.out.println(Arrays.toString(idsn.solution(test)));
	}
}
