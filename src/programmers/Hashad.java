package programmers;

public class Hashad {
	public boolean solution(int x) {
/*        boolean answer = true;
        
        int length = (int)(Math.log10(x)+1);
        int[] arr = new int[length];
        int sum = 0;
        
        for (int i = 0; i < arr.length; i++) {
        	if(i == 0) {
        		arr[i] = x % 10;
        	}else {
        		arr[i] = (int) (x / Math.pow(10, i));
        	}
        	sum = sum + arr[i];
		}
        if(x%sum == 0) {
        	return answer;
        	
        }else {
        	return false;
        }*/
		 boolean answer = true;

	      String xStr = String.valueOf(x);
	      int divisionSum = 0;

	      for(int i = 0; i<xStr.length(); i++) {
	          divisionSum = divisionSum + Integer.parseInt(xStr.substring(i, i+1)); // 한글자씩 잘라내서 합침
	      }

	      if(x % divisionSum != 0) {
	          answer = false; // 나누어 떨어지지 않으면 false
	      }

	      return answer;
    }
	
	public static void main(String[] args) {
		Hashad ha = new Hashad();
		System.out.println(ha.solution(0));
	}
}
