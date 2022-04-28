package programmers_level1;

import java.util.ArrayList;

public class Level1_86051 {
    public int solution(int[] numbers) {
        int answer = 0;
        
        ArrayList<Integer> list = new ArrayList<>(numbers.length);
        
        for (int n : numbers) {
			list.add(n);
		}
        
        for (int i = 0; i <= 9; i++) {
			if(!list.contains(i)) {
				answer += i;
			}
		}
        
        return answer;
    }
	
	public static void main(String[] args) {
		Level1_86051 level1_86051 = new Level1_86051();
		int[] numbers = {1,2,3,4,6,7,8,0};
		System.out.println(level1_86051.solution(numbers));
	}
}
