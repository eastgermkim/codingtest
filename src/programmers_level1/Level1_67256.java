package programmers_level1;

import java.util.Arrays;

public class Level1_67256 {
	 public String solution(int[] numbers, String hand) {
	        String answer = "";
	        
	        for (int i = 0; i < numbers.length; i++) {
				if(numbers[i] == 0) {
					numbers[i] = 11;
				}
			}
	        System.out.println(Arrays.toString(numbers));
	        
	        int[][] keypad = {{0,0},{1,0},{2,0},
	        				  {0,1},{1,1},{2,1},
	        				  {0,2},{1,2},{2,2},
	        				  {0,3},{1,3},{2,3}};
	        
	        int[] leftLocation = keypad[9];
	        int[] rightLocation= keypad[11];
	        
	        for (int n : numbers) {
	        	
	        	int[] numberLocation = keypad[n-1];
	        	
	        	System.out.println("numbers:"+n);
	        	System.out.println("numberLocation:"+Arrays.toString(numberLocation));
	        	System.out.println(Arrays.toString(leftLocation));
	        	System.out.println(Arrays.toString(rightLocation));
	        	System.out.println("왼손 거리:"+(Math.abs(numberLocation[0]-leftLocation[0])+Math.abs(numberLocation[1]-leftLocation[1])));
	        	System.out.println("오른손 거리:"+(Math.abs(numberLocation[0]-rightLocation[0])+Math.abs(numberLocation[1]-rightLocation[1])));
	        	
	        	int leftDistance = (Math.abs(numberLocation[0]-leftLocation[0])+Math.abs(numberLocation[1]-leftLocation[1]));
	        	int rightDistance = (Math.abs(numberLocation[0]-rightLocation[0])+Math.abs(numberLocation[1]-rightLocation[1]));
	        	
	        		if(n % 3 == 1) {
		 	        	answer += "L";
		 	        	leftLocation = keypad[n-1];
		 	        }else if(n % 3 == 0){
		         		answer +="R";
		         		rightLocation = keypad[n-1];
		 	        }else if(n % 3 == 2) {
		 	        	if(leftDistance < rightDistance) {
			 	        	leftLocation = keypad[n-1];
			 	        	answer += "L";
		 	        	}else if(leftDistance > rightDistance) {
		 	        		rightLocation = keypad[n-1];
			 	        	answer += "R";
		 	        	}else if(leftDistance == rightDistance) {
		 	        		//프로그래머스에선 == 으로 처리 하면 string은 구분해주지 않았다. equals로 처리할 것
		 	        		if(hand.equals("left")) {
			 	        		leftLocation = keypad[n-1];
			 	        		System.out.println("왼손잡이?");
			 	        		answer += "L";
			 	        	}else if(hand.equals("right")){
			 	        		rightLocation = keypad[n-1];
			 	        		System.out.println("오른손 잡이?");
			 	        		answer += "R";
			 	        	}
		 	        	}
		 	        }
	        	System.out.println(answer);
			}
	        return answer;
	    }
	public static void main(String[] args) {
		Level1_67256 level1_67256 = new Level1_67256();
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		System.out.println(level1_67256.solution(numbers, hand));
	}

}
