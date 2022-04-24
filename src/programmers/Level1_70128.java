package programmers;

public class Level1_70128 {
	public int solution(int[] a, int[] b) {
        int answer = 0;
        
        for (int i = 0; i < b.length; i++) {
			answer = answer + a[i] * b[i]; 
		}
        
        return answer;
    }
	
	public static void main(String[] args) {
		Level1_70128 level1_70128 = new Level1_70128();
		int[] a = {1,2,3,4};
		int[] b = {-3,-1,0,2};
		System.out.println(level1_70128.solution(a, b));
	}
}
