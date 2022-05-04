package programmers_level2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Level2_42839 {
	HashSet<Integer> set = new HashSet<>();
	
	private void recursive(String comb, String others) {
		//현재 조합을 set에 추가
		if(!comb.equals(""))
			set.add(Integer.valueOf(comb));
		
		//남은 숫자 중 한개를 더 해 새로운 조합
		for (int i = 0; i < others.length(); i++) {
			recursive(comb + others.charAt(i), others.substring(0, i)+others.substring(i+1));
		}
	}
	
	private boolean isPrime(int n) {
		if(n < 2)return false;
		
		for (int i = 2; i <= (int)Math.sqrt(n); i++) {
			if(n % i == 0) return false;
		}
		return true;
	} 
	
	public int solution(String numbers) {
	        recursive("", numbers);
	       
	        
	        int cnt = 0;
	        
//	        //소수 개수만 count
//	        Integer[] toArr = set.toArray(new Integer[0]);
//	       for (int i = 0; i < set.size(); i++) {
//	    	   if(isPrime(toArr[i])) cnt++;
//		}
	        
	        System.out.println(set);
	       
	       Iterator<Integer> it = set.iterator();
	       while(it.hasNext()) {
	    	   int number = it.next();
	    	   if(isPrime(number)) cnt++;
	       }
	        
	        return cnt;
	    }

	
	public static void main(String[] args) {
		Level2_42839 level2_42839 = new Level2_42839();
		String numbers = "121";
		System.out.println(level2_42839.solution(numbers));
	}

}
