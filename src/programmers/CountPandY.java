package programmers;

import java.util.*;

public class CountPandY {
	boolean solution(String s) {
        boolean answer = true;
        
        char[] arr = s.toCharArray();
        
        char c1 = 'p';
        char c2 = 'P';
        char c3 = 'y';
        char c4 = 'Y';
        int p_cnt = 0;
        int y_cnt = 0;
        
        for (int i = 0; i < arr.length; i++) {
			if(Character.compare(arr[i], c1) == 0 || Character.compare(arr[i], c2) == 0) {
				p_cnt++;
			}else if(Character.compare(arr[i], c3) == 0 || Character.compare(arr[i], c4) == 0) {
				y_cnt++;
			}
		}
        
        if(p_cnt == y_cnt) {
        	return answer;
        }else {
        	return false;
        }
    }
	public static void main(String[] args) {
		CountPandY cpy = new CountPandY();
		System.out.println(cpy.solution("Pyy"));
	}
}
