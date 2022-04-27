package programmers_level1;

public class BasicString {
	public boolean solution(String s) {
        boolean answer = true;
        
        if(s.length() == 4 || s.length() == 6) {
        	for (int i = 0; i < s.length(); i++) {
            	if(!Character.isDigit(s.charAt(i))) {
            		answer = false;
            		break;
            	}
    		}
        }else{
        	answer = false;
        }
        
        return answer;
    }
	public static void main(String[] args) {
		BasicString bs = new BasicString();
		System.out.println(bs.solution("142"));
	}
}
