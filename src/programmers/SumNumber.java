package programmers;

import java.util.*;

public class SumNumber {
	public int solution(int n) {
        int answer = 0;
        
        String temp = Integer.toString(n);
        
        for (int i = 0; i < temp.length(); i++) {
			answer += Integer.parseInt(temp.substring(i,i+1));
		}
        return answer;
    }
	
	public static void main(String[] args) {
		SumNumber sn = new SumNumber();
		System.out.println(sn.solution(123));
	}
}
