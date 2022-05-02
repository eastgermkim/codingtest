package baekjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Greedy_2 {
	
	public int solution(int N, int[][] arr) {
		int answer = 0;
		//통과 안됨
		/*Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0] == o2[0]) {
					return o1[1] -o2[s1];
				}else {
					return o1[0] -o2[0];
				}
			}
		});
		
		for (int i = 0; i < arr.length-1; i++) {
			int[] test = arr[i];
			int cnt = 1;
			for (int j = i+1; j < arr.length; j++) {
				if(test[1] <= arr[j][0] && test[1] <= arr[j][1]) {
					cnt ++;
					test = arr[j];
				}
			}
			if(cnt > answer) {
				answer = cnt;
			}
		}*/
		
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1] == o2[1]) {
					return o1[0] -o2[0];
				}else {
					return o1[1] -o2[1];
				}
			}
		});
		
		int end = 0;
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i][0] >= end) {
				end = arr[i][1];
				cnt++;
			}
					
		}
		
		answer = cnt;
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Greedy_2 greedy_2 = new Greedy_2();
		
		int N = sc.nextInt();
		
		int[][] arr = new int[N][2];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 2; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(greedy_2.solution(N, arr));
	}
}
