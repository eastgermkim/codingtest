package baekjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Greedy_3 {
	
	public int solution(int N, int[] arr) {
		int answer = 0;
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			answer += sum;
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Greedy_3 greedy_3 = new Greedy_3();
		
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(greedy_3.solution(N, arr));
	}
}
