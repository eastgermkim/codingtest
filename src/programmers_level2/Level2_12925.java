package programmers_level2;

public class Level2_12925 {
	public int solution(int n) {
        int answer = 0;
        int cnt = 0;
        
        for (int i = 1; i <= n; i++) {
        	int sum = 0;
        	for (int j = i; j <= n; j++) {
				sum += j;
				if(sum > n) {
					break;
				}else if(sum == n) {
					cnt ++;
					break;
				}else {
					continue;
				}
			}
		}
        answer = cnt;
        
        return answer;
    }
	
	
	public static void main(String[] args) {
		Level2_12925 level2_12925 = new Level2_12925();
		int n = 1;
		System.out.println(level2_12925.solution(n));
	}

}
