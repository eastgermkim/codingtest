package programmers_level1;

public class BetweenSum {
	 public long solution(int a, int b) {
	        long answer = 0;
	        long sum = 0;
	        
	        if(a <= b) {
	        	for (int i = a; i < b+1; i++) {
	        		answer = answer + a;
	        		a++;
	        	}
	        	
	        	return answer;
	        }else {
	        	for (int i = b; i < a+1; i++) {
	        		answer = answer + b;
	        		b++;
	        	}
	        	
	        	return answer;
	        }
	    }
	 
	 public static void main(String[] args) {
		BetweenSum bs = new BetweenSum();
		System.out.println(bs.solution(3, 5));
	}
}
