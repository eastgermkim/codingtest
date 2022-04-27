package programmers_level1;

import java.util.Arrays;

public class Level1_17681 {

	public static void main(String[] args) {
		Level1_17681 level1_17681 = new Level1_17681();
		int n = 5;
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		System.out.println(Arrays.toString(level1_17681.solution(n, arr1, arr2)));
	}
	
	//통과
	public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        String[] map1 = new String[n];
        String[] map2 = new String[n];
        String[] realMap1 = new String[n];
        String[] realMap2 = new String[n];
        
        for (int i = 0; i < n; i++) {
			realMap1[i] = "";
			realMap2[i] = "";
			answer[i] = "";
		}
        
        for (int i = 0; i < n; i++) {
	    	map1[i] = Integer.toBinaryString(arr1[i]);
			map2[i] = Integer.toBinaryString(arr2[i]);
			
			//2진법 수의 길이가 n보다 작으면
			if(map1[i].length() < n) {
				//n-2진법 수의 길이 만큼 0 을 붙인다
				for (int j = 0; j < n-map1[i].length(); j++) {
					realMap1[i] += "0";
				}
				//그리고 2진법 수를 더한다
				realMap1[i] += map1[i];
			//2진법 수의 길이가 n이라면
			}else {
				realMap1[i] = map1[i];
			}
			
			//2진법 수의 길이가 n보다 작으면
			if(map2[i].length() < n) {
				//n-2진법 수의 길이 만큼 0 을 붙인다
				for (int j = 0; j < n-map2[i].length(); j++) {
					realMap2[i] += "0";
				}
				//그리고 2진법 수를 더한다
				realMap2[i] += map2[i];
				//2진법 수의 길이가 n이라면
			}else {
				realMap2[i] = map2[i];
			}
			
			//realMap1, realMap2 비교해서 answer # 또는 "" 축적
			for (int j = 0; j < n; j++) {
				if(realMap1[i].charAt(j) == '1' || realMap2[i].charAt(j) == '1') {
					answer[i] += "#";
				}else {
					answer[i] += " ";
				}
			}
		}
        
        System.out.println(Arrays.toString(realMap1));
        System.out.println(Arrays.toString(realMap2));
        
        //해당 코드로 테스트 통과가 안됨
        /*int rowLen = 0;
        for (int i = 0; i < arr1.length; i++) {
			if(arr1[i] > rowLen) {
				rowLen = arr1[i];
			}
			if(arr2[i] > rowLen) {
				rowLen = arr2[i];
			}
		}
        
        rowLen = (int) Math.log10((int) Long.parseLong(Integer.toBinaryString(rowLen)))+1;
        
        long[] arr1Bi_1 = new long[n];
        long[] arr2Bi_1 = new long[n];
        String[] result = new String[n];
        for (int i = 0; i < result.length; i++) {
			result[i] = "";
		}
        
        long[][] arr1Bi_2 = new long[n][rowLen]; 
        long[][] arr2Bi_2 = new long[n][rowLen]; 
        
        for (int i = 0; i < arr1Bi_1.length; i++) {
			arr1Bi_1[i] = (int) Long.parseLong(Integer.toBinaryString(arr1[i]));
		}
        System.out.println(Arrays.toString(arr1Bi_1));
        
        for (int i = 0; i < n; i++) {
			for (int j = rowLen-1; rowLen-(int)Math.log10((int)Long.parseLong(Integer.toBinaryString(arr1[i])))-1 <= j; j--) {
				arr1Bi_2[i][j] = (int) (arr1Bi_1[i] % 10);
				arr1Bi_1[i] /= 10;
			}
		}
        
        for (int i = 0; i < arr2Bi_1.length; i++) {
        	arr2Bi_1[i] = (int) Long.parseLong(Integer.toBinaryString(arr2[i]));
        }
        
        for (int i = 0; i < n; i++) {
        	for (int j = rowLen-1; rowLen-(int) Math.log10((int) Long.parseLong(Integer.toBinaryString(arr2[i])))-1 <= j; j--) {
        		arr2Bi_2[i][j] = (int) (arr2Bi_1[i] % 10);
        		arr2Bi_1[i] /= 10;
        	}
        }
        
        for (int i = 0; i < arr1Bi_2.length; i++) {
        	System.out.println(Arrays.toString(arr1Bi_2[i]));
		}
        System.out.println("-------------------------");
        
        for (int i = 0; i < arr2Bi_2.length; i++) {
        	System.out.println(Arrays.toString(arr2Bi_2[i]));
        }
        
        for (int i = 0; i < n; i++) {
			for (int j = 0; j < rowLen; j++) {
				if(arr1Bi_2[i][j] + arr2Bi_2[i][j] > 0) {
					result[i] += "#";
				}else{
					result[i] += " ";
				};
			}
		}
        
        System.out.println("-------------------------");
        
        for (int i = 0; i < result.length; i++) {
        	System.out.println(result[i]);
        }
        
        for (int i = 0; i < answer.length; i++) {
			answer[i] = result[i];
		}*/
        
        return answer;
    }
}
