package programmers_level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Level2_12949 {
	
	public int solution(int []A, int []B){
        int answer = 0;
        
        Arrays.sort(A);
        Arrays.sort(B);
        System.out.println(Arrays.toString(A));
        
        ArrayList<Integer> al = new ArrayList<>();
        
        for (int i = 0; i < B.length; i++) {
			al.add(B[i]);
		}
        Collections.reverse(al);
        
        System.out.println(al);
        
        for (int i = 0; i < A.length; i++) {
			answer += A[i] * al.get(i);
		}
        
        
        return answer;
    }
	
	public static void main(String[] args) {
		Level2_12949 level2_12949 = new Level2_12949();
		int[] A = {1,2};
		int[] B = {3,4};
		System.out.println(level2_12949.solution(A, B));

	}

}
