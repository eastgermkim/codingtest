package programmers;

import java.util.Arrays;

public class MaxCommon {
	public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int min = (n < m) ? n : m;
        int gcd = 0;
        for (int i = 1; i <= min; i++) {
			if(n % i == 0 && m % i == 0) {
				gcd = i;
			}
		}
        
        answer[0] = gcd;
        answer[1] = m * n / gcd;
        
        return answer;
    }
	
	public static void main(String[] args) {
		MaxCommon mx = new MaxCommon();
		System.out.println(Arrays.toString(mx.solution(3, 12)));
	}
}
