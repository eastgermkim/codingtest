package programmers_level1;

public class Avaerage {
	public double solution(int[] arr) {
        double answer = 0;
        
        double d = arr.length;
        double sum = 0;
        
        for (int i = 0; i < d; i++) {
			sum = sum +arr[i];
		}
        
        answer = sum/d;
        
        return answer;
    }
	
	public static void main(String[] args) {
		Avaerage av = new Avaerage();
		
		int[] arr = {5,5};
		
		System.out.println(av.solution(arr));
	}
}
