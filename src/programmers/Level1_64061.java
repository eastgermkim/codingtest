package programmers;

import java.util.Stack;

public class Level1_64061 {
	public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<Integer>();
        
        for(int move : moves) {
        	for(int i = 0; i <board.length; i++) {
        		//인형 X
        		if(board[i][move-1] == 0) {
        			continue;
        		//인형 O
        		}else {
        			if(!stack.isEmpty() && board[i][move-1] == stack.peek()) {
        				answer += 2;
        				stack.pop();
        			}else {
        				stack.add(board[i][move-1]);
        			}
        			board[i][move-1] = 0;
        			
        			break;
        		}
        	}
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		Level1_64061 level1_64061 = new Level1_64061();
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		System.out.println(level1_64061.solution(board, moves));
	}
}
