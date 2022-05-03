package programmers_level2;

import java.util.Arrays;

public class Lever2_12949 {
	 public int[][] solution(int[][] arr1, int[][] arr2) {
		 
	        int[][] answer = new int[arr1.length][arr2[0].length];
	        for (int k = 0; k < arr1.length; k++) {
	        	for (int i = 0; i < arr2[0].length; i++) {
	        		for (int j = 0; j < arr2.length; j++) {
	        			answer[k][i] += arr1[k][j] * arr2[j][i];
	        		}
	        	}
			}
	        
	        for (int i = 0; i < answer.length; i++) {
				System.out.println(Arrays.toString(answer[i]));
			}
	        
	        return answer;
	    }
	
	
	public static void main(String[] args) {
		Lever2_12949 lever2_12949 = new Lever2_12949();
		int[][] arr1 = {{2,3,2},{4,2,4},{3,1,4}};
		int[][] arr2 = {{5,4,3},{2,4,1},{3,1,1}};
//		int[][] arr1 = {{1,1},{1,1},{8,4},{9,3}};
//		int[][] arr2 = {{3,3},{3,3}};
//		int[][] arr1 = {{1,2,3},{4,5,6}};
//		int[][] arr2 = {{1,4},{2,5},{3,6}};
		System.out.println(lever2_12949.solution(arr1, arr2));
	}

}
