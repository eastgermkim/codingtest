package programmers_level2;

import java.util.Arrays;

public class Level2_42885 {
	public int solution(int[] people, int limit) {
	    int answer = 0;

	    Arrays.sort(people);

	    int min = 0;

	    for (int max = people.length - 1; min <= max; max--){
	      if (people[min] + people[max] <= limit) min++;
	      answer++;
	    }

	    return answer;
	}
	
	//효율성 0
//	 public int solution(int[] people, int limit) {
//	        int answer = 0;
//	        
//	        Arrays.sort(people);
//	        
//	        int cnt = 0;
//	        
//	        for (int i = people.length-1; i >= 0; i--) {
//	        	for (int j = i-1; j >= 0; j--) {
//	        		System.out.println(people[i]+","+people[j]);
//	        		if(people[i] + people[j] <= limit && people[i] != 0 && people[j] != 0) {
//	        			cnt ++;
//	        			people[i] = 0;
//	        			people[j] = 0;
//	        			break;
//	        		}else if(people[i] == 0) {
//	        			break;
//	        		}
//				}
//			}
//	        answer = people.length - cnt;
//	        
//	        return answer;
//	    }
	
	
	public static void main(String[] args) {
		Level2_42885 level2_42885 = new Level2_42885();
		int[] people = {40,40,40,40,40,50,60};
		int limit = 100;
		System.out.println(level2_42885.solution(people, limit));
	}

}
