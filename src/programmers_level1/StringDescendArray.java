package programmers_level1;

import java.util.Arrays;
import java.util.Collections;

public class StringDescendArray {
	 public String solution(String s) {
		 String answer = "";
		 
		 Character [] arr = new Character [s.length()];
			for(int i=0; i<arr.length; i++) {
				arr[i] = s.charAt(i);
			}
			Arrays.sort(arr,Collections.reverseOrder());
			for(int i=0; i<arr.length; i++) {
				answer += arr[i];
			}
			return answer;
	    }
	 
	 public static void main(String[] args) {
		StringDescendArray sda = new StringDescendArray();
		System.out.println(sda.solution("Zbcdefg"));
	}
}
