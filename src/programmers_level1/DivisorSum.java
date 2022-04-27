package programmers_level1;

public class DivisorSum {
	public int solution(int n) {
        int answer = 0;
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
			if(n % i == 0) {
				sum = sum+i;
				System.out.println(i);
			}
		}
        answer=sum;
        return answer;
    }
	
	public static void main(String[] args) {
		DivisorSum ds = new DivisorSum();
		System.out.println(ds.solution(5));
	}
}
