package programmers;

import java.util.Arrays;

public class Level1_42748 {
	public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
			int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
			Arrays.sort(temp);
			answer[i] = temp[commands[i][2]-1];
		}
        
        return answer;
    }
	
	public static void main(String[] args) {
		Level1_42748 level1_42748 = new Level1_42748();
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		
		System.out.println(Arrays.toString(level1_42748.solution(array, commands)));
	}
}
