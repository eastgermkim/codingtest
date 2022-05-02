package baekjoon;

import java.util.Scanner;

public class Greedy_1 {
	
	public int solution(int N, int K, Integer[] arr) {
		int answer = 0;
		
		for (int i = N-1; 0 <= i; i--) {
			if(arr[i] <= K) {
				answer = answer + K / arr[i];
				K = K % arr[i];
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Greedy_1 greedy_1 = new Greedy_1();
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		Integer[] arr = new Integer[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(greedy_1.solution(N, K, arr));
	}
}
