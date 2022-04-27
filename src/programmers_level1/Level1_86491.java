package programmers_level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Level1_86491 {

	public static void main(String[] args) {
		Level1_86491 level1_86491 = new Level1_86491();
		//60, 50], [30, 70], [60, 30], [80, 40
		//10, 7], [12, 3], [8, 15], [14, 7], [5, 15]
		int[][] sizes = {{1, 2}, {2, 2}, {3, 4}};
		System.out.println(level1_86491.solution(sizes));
	}
	
	public int solution(int[][] sizes) {
        int answer = 0;
        
        //일단 한 쪽 전부 정렬 (가로로 고정, 둘 중 큰 값)
        for (int i = 0; i < sizes.length; i++) {
			if(sizes[i][0] <= sizes[i][1]) {
				continue;
			}else {
				int dummy_1 = 0;
				int dummy_2 = 0;
				dummy_1 = sizes[i][0];
				dummy_2 = sizes[i][1];
				
				sizes[i][0] = dummy_2;
				sizes[i][1] = dummy_1;
			}
		}
        
        for (int i = 0; i < sizes.length; i++) {
        	System.out.println(Arrays.toString(sizes[i]));
		}
        
        int max1 = 0;
        int max2 = 0;
        
        for (int i = 0; i < sizes.length; i++) {
        	if(max1 <= sizes[i][0]) {
        		max1 = sizes[i][0];
        	}
        	if(max2 < sizes[i][1]) {
        		max2 = sizes[i][1];
        	}
		}
        
        System.out.println(max1+","+max2+","+max1*max2);
        
        answer = max1 * max2;
        
        /*int[] list = new int[2 * sizes.length];
        
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
        System.out.println(Arrays.toString(list));*/
        
        
        
        return answer;
    }
}
