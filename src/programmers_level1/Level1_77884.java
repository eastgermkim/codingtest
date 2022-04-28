package programmers_level1;

public class Level1_77884 {
	public int solution(int left, int right) {
        int answer = 0;
        
        for (int i = left; i <= right; i++) {
    		int cnt = 0;
			for (int j = 1; j <= i; j++) {
				if(i % j == 0) {
					cnt ++;
				}
			}
			if(cnt % 2 ==0) {
				answer += i;
			}else {
				answer -= i;
			}
			cnt = 0;
		}
        
        return answer;
    }
	
	public static void main(String[] args) {
		Level1_77884 level1_77884 = new Level1_77884();
		int left = 24;
		int right = 27;
		System.out.println(level1_77884.solution(left, right));
	}

}
