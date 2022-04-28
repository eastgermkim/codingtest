package programmers_level1;

public class Level1_87389 {
	public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
			if(n % i == 1) {
				answer = i;
				break;
			}
		}
        
        return answer;
    }
	
	public static void main(String[] args) {
		Level1_87389 level1_87389 = new Level1_87389();
		int n = 12;
		System.out.println(level1_87389.solution(n));
	}

}
