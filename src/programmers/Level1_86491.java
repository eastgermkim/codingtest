package programmers;

import java.util.Arrays;

public class Level1_86491 {

	public static void main(String[] args) {
		Level1_86491 level1_86491 = new Level1_86491();
		//60, 50], [30, 70], [60, 30], [80, 40
		//10, 7], [12, 3], [8, 15], [14, 7], [5, 15]
		int[][] sizes = {{1,2},{2,2},{2,2},{3,4}};
		System.out.println(level1_86491.solution(sizes));
	}
	
	public int solution(int[][] sizes) {
        int answer = 0;
        
        int[] list = new int[2 * sizes.length];
        
        //원소 중 가장 큰 값 찾기
        int max = 0;
        
        for (int i = 0; i < sizes.length; i++) {
			for (int j = 0; j < 2; j++) {
				list[2*i+j] = sizes[i][j];
				if(max < sizes[i][j]) {
					max = sizes[i][j];
				}
			}
		}
        
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        answer = max * list[list.length/2-1];
        
        return answer;
    }
}
