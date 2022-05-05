package programmers_level2;

import java.util.PriorityQueue;

public class Level2_42626 {
	
	public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int i = 0; i < scoville.length; i++) {
			pq.add(scoville[i]);
		}
        
        System.out.println(pq);
        
        int now = 0;
        
        while (!pq.isEmpty()) {
            int current = pq.poll();
            
            if (current < K) {
                if (pq.size() == 0) {
                    return -1;
                }
                int next = pq.poll();
                int sum = current + next * 2;
                pq.offer(sum);
                answer++;
            }
        }
        return answer;
    }
	
	public static void main(String[] args) {
		Level2_42626 level2_42626 = new Level2_42626();
		int[] scoville = {1, 2};
		int K = 3;
		System.out.println(level2_42626.solution(scoville, K));
	}

}
