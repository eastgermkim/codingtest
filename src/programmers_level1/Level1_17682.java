package programmers_level1;

public class Level1_17682 {
	 public int solution(String dartResult) {
	        int answer = 0;
	        
	        //각 라운드 
	        int[] round = new int[3];
	        char[] carr = dartResult.toCharArray();
	        
	        int idx = -1;
	        for (int i = 0; i < carr.length; i++) {
				if(carr[i] >= '0' && carr[i] <= '9') {
					idx ++;
					//라운드에 점수 추가
					round[idx] += Integer.parseInt(String.valueOf(carr[i]));
					if(i+1 != carr.length -1 && carr[i] == '1' && carr[i+1] == '0') {
						round[idx] -= Integer.parseInt(String.valueOf(carr[i]));
						round[idx] = 10;
					}
				}
			}
	        
	        return answer;
	    }
	 
	 public static void main(String[] args) {
		Level1_17682 lv = new Level1_17682();
		String test = "1S3D*10T";
		System.out.println(lv.solution(test));
		
	}
}
