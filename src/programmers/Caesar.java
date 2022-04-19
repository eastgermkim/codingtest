package programmers;

import java.util.Arrays;

public class Caesar {
	  public String solution(String s, int n) {
	        String answer = "";
	        
	        /*char[] arr = s.toCharArray();
	        char[] result = new char[arr.length];
	        
	        for (int i = 0; i < arr.length; i++) {
				result[i] = (char)(arr[i]+n);
			}
	        
	        answer = new String(result);*/
	        
	        for (int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				
				if(ch == ' ') {
					answer += ch;
					continue;
				}
				if(ch >= 'a' && ch <= 'z') {
					if(ch+n > 'z') {
						answer += (char)(ch-26+n);
					}else {
						answer += (char)(ch+n);
					}
			}else if(ch >= 'A' && ch <= 'Z') {
				if(ch+n>'Z') {
						answer += (char)(ch-26+n);
				}else {
						answer += (char)(ch+n);
				}
			}
        }
	        return answer;
    }
	  
	  public static void main(String[] args) {
		  Caesar ca = new Caesar();
		  System.out.println(ca.solution("z", 1));
	}
}
