package programmers_level1;

public class Level1_68935 {
	 public int solution(int n) {
		 	//3진법 문자열
	        String answer = "";	
	        //10진법
	        int result = 0;
	        answer = Integer.toString(n, 3);
	        
	        //string builder
	        StringBuilder sb = new StringBuilder(answer);
	        //거꾸로
	        sb.reverse().toString();
	        System.out.println(sb);
	        
	        for (int i = 0; i < sb.length(); i++) {
				System.out.println(i);
				if(i == sb.length()-1) {
					result = result + Character.getNumericValue(sb.charAt(i));
				}else {
					result = (int) (result + Character.getNumericValue(sb.charAt(i)) * Math.pow(3, sb.length()-i-1));
				}
				System.out.println(result);
			}
	        
	        
	        return result;
	    }
	 
	public static void main(String[] args) {
		Level1_68935 level1_68935 = new Level1_68935();
		System.out.println(level1_68935.solution(125));
	}

}
