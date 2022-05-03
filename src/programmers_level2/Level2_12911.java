package programmers_level2;

public class Level2_12911 {
	public int solution(int n) {
        int answer = 0;
        String n_bi = Integer.toBinaryString(n);
        
        int cnt = 0;
        for (int i = 0; i < n_bi.length(); i++) {
        	if(n_bi.charAt(i) == '1') cnt++;
        }     
        
        int cnt2 = -1;
        while(cnt != cnt2){
        	n++;
        	cnt2 = 0;
        	String n_bi2 = Integer.toBinaryString(n);
        	
        	for (int i = 0; i < n_bi2.length(); i++) {
				if(n_bi2.charAt(i) == '1') cnt2++;
			}
        }
        
        answer = n;
        
        return answer;
    }
	
	public static void main(String[] args) {
		Level2_12911 level2_12911 = new Level2_12911();
		int n = 78;
		System.out.println(level2_12911.solution(n));
				
	}

}
