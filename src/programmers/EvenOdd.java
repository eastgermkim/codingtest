package programmers;

public class EvenOdd {
	 public String solution(int num) {
	        String answer = "";
	        
	        if(num % 2 == 0 || num == 0) {
	        	answer = "Even";
	        	
	        /*}else if(num % 2 == 1) {*/
	        	//이건 왜 안되는거지
	        }else{
	        	answer = "Odd";
	        	
	        }
	        return answer;
	    }
	 
	 public static void main(String[] args) {
		EvenOdd eo = new EvenOdd();
		System.out.println(eo.solution(9999999));
	}
}
