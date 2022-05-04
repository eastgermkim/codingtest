package programmers_level2;

import java.util.Arrays;

public class Level2_42842 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        
        //넓이를 구한다.
        int area = brown + yellow;
        
        
        //해당 넓이로 나올 수 있는 (a,b) 조합을 모두 구한다.
        for (int i = 1; i <= Math.sqrt(area); i++) {
        	int[] temp = new int[2];
			if(area % i == 0) {
				temp[0] = area / i;
				temp[1] = i;
			}
			System.out.println(temp[0]+","+temp[1]);
			
			//나온 (a,b)중 (a-2,b-2)의 넓이가 yellow인지 확인한다.
			if((temp[0]-2) *(temp[1]-2) == yellow) {
				answer[0] = temp[0];
				answer[1] = temp[1];
			}
		} 
        
        System.out.println(Arrays.toString(answer));
        
        return answer;
    }
	
	
	public static void main(String[] args) {
		Level2_42842 level2_42842 = new Level2_42842();
		int brown = 8;
		int yellow = 1;
		System.out.println(level2_42842.solution(brown, yellow));
	}

}
