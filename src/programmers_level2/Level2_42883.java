package programmers_level2;


public class Level2_42883 {
	
	public String solution(String number, int k) {
        int idx = 0;
        char max;
		StringBuilder answer = new StringBuilder();
	
		if(number.charAt(0) == '0') return "0";
		for(int i = 0; i < number.length() - k; i++) {
			max = '0';
			for(int j = idx; j <= k + i; j++) {
		        	if(max < number.charAt(j)) {
		        		max = number.charAt(j); idx = j + 1;
		        	}
			}			
			answer.append(max);
		}
	        return answer.toString();
	    }
//        String answer = "";
//        
        //런타임 에러 오지게 뜸
//        int cnt = 0;
//        //문자열 앞부터 다음 숫자가 이전보다 크면 제거한다
//        for (int i = 0; i < number.length(); i++) {
//			if(Character.getNumericValue(number.charAt(0)) 
//					> Character.getNumericValue(number.charAt(1))){
//				number = number.substring(i+1);
//				System.out.println(number);
//				cnt ++;
//			}else {
//				break;
//			}
//		}
//        
//        System.out.println(number);
//        System.out.println(cnt);
//        
//        if(cnt == k)return number;
//        
//        while(cnt != k){
//        	int temp = 0;
//        	ArrayList<Integer> al = new ArrayList<>();
//        	
//        	for (int i = 0; i < number.length(); i++) {
//        		temp = Integer.parseInt(number.substring(0, i) + number.substring(i+1));
//        		al.add(temp);
//        	}
//        	cnt++;
//        	number = Integer.toString(Collections.max(al));
//        }
//        System.out.println("number:" + number);
//        
//        answer = number;
//        
//        return answer;
//    }
	
	public static void main(String[] args) {
		Level2_42883 level2_42883 = new Level2_42883();
		String number = "4177252841";
		int k = 4;
		System.out.println(level2_42883.solution(number, k));
	}

}
