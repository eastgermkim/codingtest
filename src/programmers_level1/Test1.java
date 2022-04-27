package programmers_level1;

public class Test1 {
	public int solution(int n, int a, int b) {
        int answer = 0;
        
        while(a != b) {
        	a = a / 2 + a % 2;
        	b = b / 2 + b % 2;
        	answer ++;
        	if(a == b) {
        		break;
        	}
        }
        return answer;
    }
	
public static void main(String[] args) {
	Test1 test1 = new Test1();
	System.out.println(test1.solution(8, 4, 7));
	}
}
