package programmers_level2;

import java.util.ArrayList;
import java.util.Collections;

public class Level2_60057 {
	public int solution(String s) {
        int answer = 0;
        ArrayList<Integer> result_al = new ArrayList<>();
        
        
        //88점, 2,3,15 틀림 어딜 고쳐야 할 지 모르겠다.
        //자르는 문자열 개수 for문
        for (int i = 0; i < s.length()/2; i++) {
        	ArrayList<String> al = new ArrayList<>();
        	String result = "";
        	ArrayList<Integer> nal = new ArrayList<>();
        	
        	//자르는 문자열 for문
        	for (int j = 0; j < s.length()-i; j++) {
				al.add(s.substring(j, j+i+1));
				j += i;
			}
        	if(al.size()* (i+1) < s.length()) {
        		for (int j = al.size()* (i+1); j < s.length(); j++) {
					al.add(Character.toString(s.charAt(j)));
				}
        	}
        	
        	if( al.size() >= 2) {
        		int nal_num = 0;
        			for (int j = 0; j < al.size(); j++) {
        				int cnt = 1;
        				for (int k = j+1; k < al.size(); k++) {
        					if(al.get(j).equals(al.get(k))) {
        						cnt ++;
        					}else {
        						break;
        					}
						}
        				if(cnt >= 2) {
        					j += cnt-1;
        				}
        				nal.add(cnt);
						if(nal.get(nal_num) == 1) {
							result += al.get(j);
						}else {
							result += cnt + al.get(j);
						}
						nal_num++;
					}
        			result_al.add(result.length());
        	}
        	System.out.println(result);
        	System.out.println(result_al);
		}
        
        if(result_al.size() == 0) {
        	answer = s.length();
        }else {
        	answer = Collections.min(result_al);
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		Level2_60057 level2_60057 = new Level2_60057();
		String s = "xxxxxxxxxxyyy";
		System.out.println(level2_60057.solution(s));
	}

}
