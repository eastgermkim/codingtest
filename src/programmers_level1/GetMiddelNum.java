package programmers_level1;

public class GetMiddelNum {
	public String solution(String s) {
        String answer = "";
        
        int num = s.length() / 2;
        
        //짝
        if(s.length() % 2 == 0) {
        	answer = s.substring(num-1, s.length()-num+1);
        	
        //홀
        }else{
        	answer = s.substring(num, s.length()-num);
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		GetMiddelNum gmn = new GetMiddelNum();
		System.out.println(gmn.solution("abcdef"));
	}
}
