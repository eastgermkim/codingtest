package programmers_level2;


public class Level2_12913 {
	public int solution(int[][] land) {
        int answer = 0;
        
        for (int i = 1; i < land.length; i++) {
			land[i][0] += Math.max(land[i-1][1], Math.max(land[i-1][2], land[i-1][3]));
			land[i][1] += Math.max(land[i-1][0], Math.max(land[i-1][2], land[i-1][3]));
			land[i][2] += Math.max(land[i-1][0], Math.max(land[i-1][1], land[i-1][3]));
			land[i][3] += Math.max(land[i-1][0], Math.max(land[i-1][1], land[i-1][2]));
		}
        
        int max = 0;
        for (int i : land[land.length-1]) {
			if( i > max) {
				max = i;
			}
		}
        answer = max;
        
        
        return answer;
    }
	
	
	public static void main(String[] args) {
		Level2_12913 level2_12913 = new Level2_12913();
		
		int[][] land = {{1,2,3,5},{5,6,7,8},{4,3,1,2}};
		System.out.println(level2_12913.solution(land));
		
	}

}

//        반례가 있음 2행의 마지막 100
//        ArrayList<Integer> al = new ArrayList<>();
//        al.add(-1);
//        
//        for (int i = 0; i < land.length; i++) {
//        	int max = 0;
//        	int lo_j = -1;
//			for (int j = 0; j < land[0].length; j++) {
//				if(land[i][j] > max && j != al.get(i)) {
//					max = land[i][j];
//					lo_j = j;
//				}
//			}
//			al.add(lo_j);
//			answer += max;
//			System.out.println(max);
//		}
//        System.out.println(al);