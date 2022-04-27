package programmers_level1;

public class Level1_76501 {
	 public int solution(int[] absolutes, boolean[] signs) {
	        int answer = 0;
	        
	        for (int i = 0; i < signs.length; i++) {
				if(signs[i] == true) {
					answer = answer + absolutes[i];
				}else {
					answer = answer - absolutes[i];
				}
			}
	        
	        return answer;
	    }
	
	
	public static void main(String[] args) {
		Level1_76501 level1_76501 = new Level1_76501();
		int[] absolutes= {4,7,12};
		boolean[] signs= {true,false,true};
		/*int[] absolutes= {1,2,3};
		boolean[] signs= {false,false,true};*/
		System.out.println(level1_76501.solution(absolutes, signs));
	}

}
