package programmers_level2;

import java.util.Stack;

public class Level2_12909 {
	boolean solution(String s) {
        boolean answer = true;
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                st.push('(');
            }else{
                if(st.isEmpty()){
                    answer = false;
                    break;
                }else{
                    st.pop();
                }
            }
        }
        if(st.size() > 0)
            return false;
 
        return answer;
    }
	
	
//	효용성 0	
//	 boolean solution(String s) {
//	        boolean answer = true;
//	        Stack<String> stack = new Stack<>();
//	        
//	        if(s.charAt(0) == ')' || s.charAt(s.length()-1) == '(') {
//	        	return false;
//	        }
//	        
//	        for (int i = 0; i < s.length(); i++) {
//				stack.push(Character.toString(s.charAt(i)));
//				if(stack.size()== 0 || stack.size() == 1) {
//					continue;
//				}else if(stack.get(stack.size()-1).equals(")") && stack.get(stack.size()-2).equals("(")) {
//					stack.pop();
//					stack.pop();
//				}
//			}
//	        
//	        if(stack.size()>0) {
//	        	return false;
//	        }
//	        
//	        
//	        return answer;
//	    }
	
	public static void main(String[] args) {
		Level2_12909 level2_12909 = new Level2_12909();
		String s = "()()";
		System.out.println(level2_12909.solution(s));
	}

}
