package programmers_level2;

public class Level2_43165 {
	int answer = 0;
	
	public int solution(int[] numbers, int target) {
        
		dfs(numbers, 0 , target, 0);
		
        return answer;
    }
	
	public void dfs(int[] numbers, int depth, int target, int sum) {
		
		if(depth == numbers.length) {	//마지막 노드
			if(target == sum) {
				answer ++;
			}
		}else {
			dfs(numbers, depth+1, target, sum + numbers[depth]); // 해당 노드 값을 더하고 다음 깊이
			dfs(numbers, depth+1, target, sum - numbers[depth]); // 해당 노드 값을 빼고 다음 깊이
		}
		
	}
	
	public static void main(String[] args) {
		Level2_43165 level2_43165 = new Level2_43165();
		int[] numbers = {4, 1, 2, 1};
		int target = 2;
		System.out.println(level2_43165.solution(numbers, target));
	}

}
