package programmers_level2;

import java.util.Arrays;
import java.util.Stack;

public class Level2_42584 {
	//2중 for
//	public int[] solution(int[] prices) {
//        int[] answer = new int[prices.length];
//        
//        for (int i = 0; i < prices.length; i++) {
//        	for (int j = i+1; j < prices.length; j++) {
//        		answer[i] ++;
//				if(prices[i] > prices[j]) break;
//			}
//		}
//        System.out.println(Arrays.toString(answer));
//        return answer;
//    }
	
	    public int[] solution(int[] prices) {
	        int len = prices.length;
	        int[] answer = new int[len];
	        Stack<Integer> stack = new Stack<>();
	        
	        for(int i=0; i<len; i++){ // prices 배열의 크기동안
	            
	            //비교대상stack 인덱스의 price값이 현재 비교중인 인덱스의 price값보다 작다면
	            while(!stack.isEmpty() && prices[i] < prices[stack.peek()]){ 
	                //stack에서 해당값은 빼주고
	                int idx = stack.pop();
	                //answer 인덱스에 얼마만에 찾았는지 넣어준다. 
	                answer[idx] = i - idx;
	            }
	            stack.push(i);
	        }
	        System.out.println(stack);
	        
	        while(!stack.isEmpty()){
	            int leftIdx = stack.pop();
	            answer[leftIdx] = len-leftIdx-1;
	        }
	        
	        return answer;
	    }
	
	
	public static void main(String[] args) {
		Level2_42584 level2_42584 = new Level2_42584();
		int[] prices = {1, 2, 3, 2, 3};
		System.out.println(level2_42584.solution(prices));
	}

}
