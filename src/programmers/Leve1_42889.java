package programmers;

import java.util.*;


public class Leve1_42889 {
	 public int[] solution(int N, int[] stages) {
	        int[] answer = new int[N];
	        //실패 횟수 담는 배열
	        int[] fail_cnt = new int[N];
	        //실패율과 스테이지를 담는 배열 {스테이지, 실패율}
	        double[][] fail_arr = new double[N][2];
	        //실패 횟수 합 sum
	        int sum = 0;
	        
	        //스테이지 배열
	        int[] stage = new int[N];
	        for (int i = 0; i < stage.length; i++) {
				stage[i] = i+1;
			}
	        
	        for (int i = 0; i < N; i++) {
	        	int cnt = 0;
	        	
				for (int j = 0; j < stages.length; j++) {
					if(stages[j] == i+1) {
						cnt++;
					}else {
						continue;
					}
				}
				if(cnt == 0) {
					fail_arr[i][1] = 0;
					break;
				}else if(cnt > 0) {
					fail_cnt[i] = cnt;
					System.out.println("cnt:"+cnt);
					
					fail_arr[i][0] = i+1;
					fail_arr[i][1] = (cnt*1.0)/(stages.length - sum);
					System.out.println(cnt*1.0);
					System.out.println(stages.length-sum);
					System.out.println("fail_arr["+i+1+"]:"+fail_arr[i][1]);
					
					sum = (int) (sum + fail_cnt[i]);
					System.out.println("sum:"+sum);
				}
	        }
	        
	        for (int i = 0; i < N; i++) {
					System.out.println(Arrays.toString(fail_arr[i]));
			}
	        
	        Arrays.sort(fail_arr,Comparator.comparingDouble((double[] o) -> o[1]).reversed());
	        
	        
	        for (int i = 0; i < N; i++) {
	        	// 배열 안에 0.0 이 있으면
    			if((fail_arr[i][0]) == 0.0){
    				//배열 만들기
    				for (int j = 0; j < N-1; j++) {
						answer[i] = (int)fail_arr[i][0];
						break;
					}
				}else{
					for (int k = 0; k < N; k++) {
						answer[i] = (int) fail_arr[i][0];
						break;
					}
	        	}
	        }
	        
	        return answer;
	    }
	
	 
	 public static void main(String[] args) {
		Leve1_42889 leve1_42889 = new Leve1_42889();
		int N = 5;
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		System.out.println(Arrays.toString(leve1_42889.solution(N, stages)));
	}
}
