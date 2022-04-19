package programmers;

public class HidePhoneNumber{
	 public String solution(String phone_number) {
		 String answer = "";
	        
	        int num = phone_number.length();
	        
	        String lastNumbers = phone_number.substring(num-4,num);
	        
	        for (int i = 0; i <num-4; i++) {
				answer = answer + "*";
			}
	        answer = answer + lastNumbers;
        return answer;	
	 }
	 
	 public static void main(String[] args) {
		HidePhoneNumber  hn =  new HidePhoneNumber();
		System.out.println(hn.solution("0277778888"));
	}
}
