package programmers_level2;

import java.util.ArrayList;
import java.util.Collections;

public class Level2_60057_2 {
	public int solution(String s) {
        int answer = 0;
        
        for (int i = 1; i < s.length(); i++) {
        	
        	String pattern = s.substring(0, i);
        	int cnt = 1;
        	String result = "";
        	
        	for (int j = i; j < s.length()-i; j+=i) {
        		if(pattern.equals(s.substring(j, j+i))) {
        			cnt++;
        		}else {
        			if(cnt > 1) {
        				result += cnt + "";
        			}else {
        				result += pattern;
        				pattern = s.substring(j,j+i);
        				cnt = 1;
        			}
        		}
        		
        		if(cnt>1) {
        			result+= ""+cnt;
        		}
        		result+= pattern;
        		
        		int div = s.length() % i;
        		answer = Math.min(answer, result.length()+div);
            }
        }
            return answer;
        }
	
	public static void main(String[] args) {
		Level2_60057_2 level2_60057 = new Level2_60057_2();
		String s = "xxxxxxxxxxyyy";
		System.out.println(level2_60057.solution(s));
	}

}
