package programmers_level1;

import java.util.ArrayList;
import java.util.Arrays;

public class Level1_17682 {
	 public int solution(String dartResult) {
	        int answer = 0;
	        
	        String[] number = dartResult.replace("*", "").replace("#", "").split("S|D|T");
	        int[] num = new int[3];
	        String[] shot = new String[3];
	        String[] sym = new String[3];
	        
	        int cnt = 0;
	        
	        for (int i = 0; i < dartResult.length(); i++) {
				if(dartResult.charAt(i) == 'S'||dartResult.charAt(i) == 'D'||dartResult.charAt(i) == 'T') {
					shot[cnt] = Character.toString(dartResult.charAt(i));
					cnt++;
				}else if(dartResult.charAt(i) == '*'||dartResult.charAt(i) == '#') {
					sym[cnt-1] = Character.toString(dartResult.charAt(i));
				}
			}
	        
	        for (int i = 0; i < 3; i++) {
	        	if(shot[i].equals("S")) {
	        		num[i] = (int) Math.pow((double)Integer.parseInt(number[i]),1);
	        	}else if(shot[i].equals("D")) {
	        		num[i] = (int) Math.pow((double)Integer.parseInt(number[i]),2);
	        	}else if(shot[i].equals("T")) {
	        		num[i] = (int) Math.pow((double)Integer.parseInt(number[i]),3);
	        	}
			}
	        
	        for (int i = 0; i < sym.length; i++) {
	        	if(sym[i] == null){
					continue;
				}else if(sym[i].equals("*")) {
					if(i > 0) {
						num[i-1] = num[i-1] * 2;
						num[i] = num[i] * 2;
					}else {
						num[i] = num[i]*2;
					}
				}else if(sym[i].equals("#")) {
					num[i] = num[i] * (-1);
				}
			}
	        
	        for (int i = 0; i < num.length; i++) {
				answer += num[i];
				System.out.println(num[i]);
			}
	        return answer;
	    }
	 
	 public static void main(String[] args) {
		Level1_17682 lv = new Level1_17682();
		String test = "1S*2T*3S";
		System.out.println(lv.solution(test));
		
	}
}
