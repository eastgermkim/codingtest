package programmers;

public class StrangeWord {
	public String solution(String s) {
        String answer = "";
        
        /*char[] arr = s.toCharArray();
        
        for (int i = 0; i < arr.length; i++) {
			if(i % 2 == 0) {
				arr[i] = Character.toUpperCase(arr[i]);
			}
		}
        answer = new String(arr);*/
        
        int cnt = 0;
        String[] arr = s.split("");
        
        for(String ss : arr) {
        	cnt = ss.contains(" ") ? 0 : cnt + 1;
        	answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
        }
        return answer;
    }
	public static void main(String[] args) {
		StrangeWord st = new StrangeWord();
		System.out.println(st.solution("try hello world"));
	}
}
