package programmers_level1;

import java.util.Arrays;

public class Reverse {
	public int[] solution(long n) {
        String num = String.valueOf(n);
        char[] arr = num.toCharArray();
        
        int[] answer = new int[num.length()];
        for (int i = num.length()-1; i >= 0; i--) {
			answer[num.length()-1-i]=num.charAt(i)-'0';
		}
        return answer;
    }
	
	public static void main(String[] args) {
		Reverse rv = new Reverse();
		System.out.println(Arrays.toString(rv.solution(12345)));
	}
}
