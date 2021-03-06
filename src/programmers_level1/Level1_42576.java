package programmers_level1;

import java.util.Arrays;
import java.util.HashMap;

public class Level1_42576 {
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> hm = new HashMap<>();
		for (String player : participant)
			hm.put(player, hm.getOrDefault(player, 0) + 1);
		for (String player : completion)
			hm.put(player, hm.get(player) - 1);
		for (String key : hm.keySet()) {
			if (hm.get(key) != 0) {
				answer = key;
				System.out.println(answer);
				break;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Level1_42576 level1_42576 = new Level1_42576();
		String[] participant = { "mislav", "stanko", "mislav", "ana" };
		String[] completion = { "stanko", "ana", "mislav" };
		System.out.println(level1_42576.solution(participant, completion));
	}
}
