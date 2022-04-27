package programmers_level1;

public class SquareRoot {
	public long solution(long n) {
        long answer = 0;
        
        double result = Math.sqrt(n);
        double floor = Math.floor(result);
        
        if(result - floor == 0) {
        	answer = (long) Math.pow(result+1, 2);
        }else {
        	answer = -1;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		SquareRoot sq = new SquareRoot();
		System.out.println(sq.solution(3));
	}
}
