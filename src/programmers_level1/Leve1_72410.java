package programmers_level1;

import java.util.*;

public class Leve1_72410 {
	 public String solution(String new_id) {
	        String answer = "";
	        
	        //1
	        String step1 = new_id.toLowerCase();
	        
	        //2
	        char[] step1_arr = step1.toCharArray();
	        StringBuilder step2 = new StringBuilder();
	        for (char c : step1_arr) {
				if((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '-' || c == '_' || c == '.') {
					step2.append(c);
				}
			}
	        
	        //3
	        String step3 = step2.toString();
	        while(step3.contains("..")) {
	        	step3 = step3.replace("..", ".");
	        }
	        
	        //4
	        String step4 = step3;
	        if(step4.length() > 0) {
	        	if(step4.charAt(0) == '.') {
	        		step4 = step3.substring(1, step3.length());
	        	}
	        }
	        if(step4.length()>0) {
	        	if(step4.charAt(step4.length() - 1) == '.'){
	        		step4 = step4.substring(0, step4.length()-1);
	        	}
	        }
	        
	        //5
	        String step5 = step4;
	        if(step5.isEmpty()) {
	        	step5 += "a";
	        }
	        
	        //6
	        String step6 = step5;
	        if(step6.length() >= 16) {
	        	step6 = step6.substring(0,15);
	        }
	        if(step6.length()>0) {
	        	if(step6.charAt(step6.length()-1) == '.'){
	        		step6 = step6.substring(0, step6.length()-1);
	        	}
	        }
	        
	        //7
	        String step7 = step6;
	        if(step7.length() <= 2) {
	        	while(step7.length() != 3) {
	        		step7 = step7 += step7.charAt(step6.length()-1);
	        	}
	        }
	        answer = step7;
	        
	        return answer;
	    }
	 
	 public static void main(String[] args) {
		Leve1_72410 leve1_72410 = new Leve1_72410();
		String new_id = "...!@BaT#*..y.abcdefghijklm";
		System.out.println(leve1_72410.solution(new_id));
	}
}
