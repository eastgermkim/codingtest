package programmers_level2;


public class Level2_12905 {
	 public int solution(int [][]board)
	    {
	        int answer = 0;
	        
	        int[][] test = new int[board.length+1][board[0].length+1];
	        
	        for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board[0].length; j++) {
					test[i+1][j+1] = board[i][j];
				}
			}
	        
	        
	        for (int i = 0; i < test.length; i++) {
				for (int j = 0; j < test[0].length; j++) {
					if(test[i][j] != 0) {
						test[i][j] = Math.min(test[i-1][j-1], Math.min(test[i-1][j], test[i][j-1]))+1;
						System.out.println(test[i][j]);
						answer = Math.max(answer, test[i][j]);
					}
				}
			}
	        System.out.println(answer);
	        
	        answer = answer * answer;
	        
	        return answer;
	    }
	
	
	public static void main(String[] args) {
		Level2_12905 level2_12905 = new Level2_12905();
		int[][] board = {{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}};
		System.out.println(level2_12905.solution(board));
	}

}
