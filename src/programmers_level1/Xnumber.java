package programmers_level1;

import java.util.Arrays;
import java.util.Scanner;

public class Xnumber {
	public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long gap = x;
        
        for (int i = 0; i < n; i++) {
        	answer[i] = x+(i)*gap; 
        }
        
        return answer;
	}
	
	public static void main(String[] args) {
		Xnumber xn = new Xnumber();
		 Scanner sc = new Scanner(System.in);
		 int x = sc.nextInt();
		 int n = sc.nextInt();
		 
		 System.out.println(Arrays.toString(xn.solution(x, n)));
	}
}
