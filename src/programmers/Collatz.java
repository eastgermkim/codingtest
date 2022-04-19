package programmers;

public class Collatz {
	public int solution(int num) {
		int answer = 0;
		int cnt = 0;
        
        while(num != 1) {
            if(num % 2 == 0) {
	        	num = num / 2;
	        }else if(cnt > 500){
	        	cnt = -1;
	        	break;
	        }else if(num % 2 == 1){
	        	num = num * 3 + 1;
	        }
	        cnt ++;	
        };
        answer = cnt;
        return answer;
    }
	
	public static void main(String[] args) {
		Collatz co = new Collatz();
		System.out.println(co.solution(626331));
	}
}
