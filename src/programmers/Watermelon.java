package programmers;

public class Watermelon {
	 public String solution(int n) {
	        String answer = "";
	        String wm = "수박";
	        String result = "";
	        
	        if(n % 2 == 0) {
	        	for (int i = 0; i < n/2; i++) {
					result = result +wm;
				}
	        }else {
	        	for(int i = 0; i < n/2; i++) {
	        		result = result + wm;
	        	}
	        	result = result +"수";
	        }
	        
	        answer = result;
	        return answer;
	    }
	 public static void main(String[] args) {
		Watermelon wm = new Watermelon();
		System.out.println(wm.solution(6));
	}
}
