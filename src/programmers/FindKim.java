package programmers;

public class FindKim {
	public String solution(String[] seoul) {
        String answer = "";
        
        for (int i = 0; i < seoul.length; i++) {
			if(seoul[i].equals("Kim")) {
				answer = "김서방은 "+i+"에 있다"; 
				break;
			}
		}
        return answer;
    }
	
	public static void main(String[] args) {
		FindKim fk = new FindKim();
		String[] seoul = {"Jane", "Kim"};
		fk.solution(seoul);
	}
}
