package programmers;

import java.util.Arrays;
import java.util.Collections;

public class Descend {
	 public long solution(long n) {
	       
		 	String num = String.valueOf(n);
		 	String result = "";
		 	
		 	char[] arr = num.toCharArray();
		 	
		 	Arrays.sort(arr);
		 	for (int i = arr.length-1; i >= 0; i--) {
				result += arr[i];
			}
		 	
		 	long answer = Long.parseLong(result);
		 	
	        return answer;
	    }
	 
	 public static void main(String[] args) {
		Descend ds = new Descend();
		System.out.println(ds.solution(118372));
	}
}
