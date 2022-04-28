package programmers_level1;

public class Level1_12977 {
	public boolean isPrime(int num) {
		boolean result = true;
			if(num == 2) {
				result = true;
			}else {
				for(int i = 2; i <= Math.sqrt(num); i++) {
					if(num % i == 0) {
						result = false;
					}
				}
			}
			return result;
	}
	
	public int solution(int[] nums) {
        int answer = 0;
        
        for (int i = 0; i < nums.length-2; i++) {
        	for (int j = i+1; j < nums.length-1; j++) {
        		for (int j2 = j+1; j2 < nums.length; j2++) {
        			if(isPrime(nums[i] + nums[j] + nums[j2])) {
        				answer ++;
        			}
				}
			}
		}
        

        return answer;
    }
	
	public static void main(String[] args) {
		Level1_12977 level1_12977 = new Level1_12977();
		int[] nums = {1,2,7,6,4};
		System.out.println(level1_12977.solution(nums));
	}

}
