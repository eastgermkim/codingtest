package programmers_level2;

import java.util.Arrays;

public class Level2_12953 {
	public int getGCD(int a, int b) {
		if(a % b == 0) {
			return b;
		}
		return getGCD(b, a % b);
	}
	
	public int solution(int[] arr) {
        int answer = 1;
        
        for (int i = 0; i < arr.length; i++) {
        	for (int j = i+1; j < arr.length; j++) {
				int numLCD = getGCD(arr[i], arr[j]);
				arr[j] = arr[j] / numLCD;
			}
		}
        
        for (int i = 0; i < arr.length; i++) {
			answer = arr[i]*answer;
		}
        
        return answer;
    }
	
	public static void main(String[] args) {
		Level2_12953 level2_12953 = new Level2_12953();
		int[] arr= {10,12,14};
		System.out.println(level2_12953.solution(arr));
	}

}
