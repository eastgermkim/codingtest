package programmers_level1;

public class Level1_82612 {
	public long solution(int price, long money, int count) {
        long answer = -1;
        
        for (int i = 0; i < count; i++) {
			money = money - price * (i+1);
		}
        
        if(money < 0) {
        	answer = money * -1;
        }else {
        	answer = 0;
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		Level1_82612 level1_82612 = new Level1_82612();
		int price = 3;
		int money = 20;
		int count = 4;
		System.out.println(level1_82612.solution(price, money, count));
	}

}
