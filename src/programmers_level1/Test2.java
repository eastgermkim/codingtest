package programmers_level1;

public class Test2 {
	public int solution(int [][]board){
        int answer = 0;
        int hor = board.length;
        int len = board[0].length;
        
        int[][] test = new int[hor+1][len+1];
        
        for (int i = 0; i < hor; i++) {
        	for (int j = 0; j < len; j++) {
				test[i+1][j+1] = board[i][j];
			}
		}
        
        for (int i = 0; i <= hor; i++) {
        	for (int j = 0; j <= len; j++) {
				if(test[i][j] != 0) {
					test[i][j] = Math.min(Math.min(test[i-1][j], test[i][j-1]),test[i-1][j-1])+1;
					answer = Math.max(answer, test[i][j]);
				}
			}
		}

        return answer * answer;
    }
	
	public static void main(String[] args) {
		Test2 test2 = new Test2();
		int[][] board = {{0,0,1,1},{1,1,1,1}};
		System.out.println(test2.solution(board));
	}
}
