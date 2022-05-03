package programmers_level2;

import java.util.ArrayList;

public class Level2_12945 {
	  public int solution(int n) {
	        int fibo0 = 1;
	        int fibo1 = 1;
	        
	        int sum = 0;
	        for (int i = 2; i < n; i++) {
	        	sum = fibo0 + fibo1;
	        	sum %= 1234567;
	        	fibo0 = fibo1;
	        	fibo1 = sum;
			}
	        
	        return sum;
	    }
	  
	  
	public static void main(String[] args) {
		Level2_12945 level2_12945 = new Level2_12945();
		int n = 5;
		System.out.println(level2_12945.solution(n));
		
	}

}
