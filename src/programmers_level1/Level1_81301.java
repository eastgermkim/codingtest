package programmers_level1;

public class Level1_81301 {
	 public int solution(String s) {
	        int answer = 0;
	        String[][] sample = {
	        					{"0","zero"},
	        					{"1","one"},
	        					{"2","two"},
	        					{"3","three"},
	        					{"4","four"},
	        					{"5","five"},
	        					{"6","six"},
	        					{"7","seven"},
	        					{"8","eight"},
	        		        	{"9","nine"}
	        					};
	        
	        for (int i = 0; i < sample.length; i++) {
				if(s.contains(sample[i][1])) {
					s = s.replace(sample[i][1], sample[i][0]);
				}
			}
	        
	        answer = Integer.parseInt(s);
	        return answer;
	    }
	 
	public static void main(String[] args) {
		Level1_81301 level1_81301 = new Level1_81301();
		String s = "one4seveneight";
		/*String s ="23four5six7";
		String s = "2three45sixseven";
		String s = "123"*/
		System.out.println(level1_81301.solution(s));
	}

}
