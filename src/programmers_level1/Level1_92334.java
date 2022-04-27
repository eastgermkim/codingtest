package programmers_level1;

import java.util.*;


public class Level1_92334 {
	public int[] solution(String[] id_list, String[] report, int k) {
		int[] answer = new int[id_list.length];
        int[] cnt = new int[id_list.length];
		//중복제거
		Set<String> set = new HashSet<String>(Arrays.asList(report));
		String[] report1 = set.toArray(new String[0]);

		
		//split으로 구분
		String[][] report2 = new String[set.size()][2];
        for (int i = 0; i < report2.length; i++) {
			report2[i][0] = report1[i].split(" ")[0];
			report2[i][1] = report1[i].split(" ")[1];
		}
        
        //벤
        ArrayList<String> ban = new ArrayList<>();
        for (int i = 0; i < cnt.length; i++) {
			for (int j = 0; j < report2.length; j++) {
				if(report2[j][1].equals(id_list[i])) {
					cnt[i] ++;
				}
			}
			if(k <= cnt[i]) {
				ban.add(id_list[i]);
			}
		}
        
        for (int i = 0; i < id_list.length; i++) {
        	for (int j = 0; j < report2.length; j++) {
        		if(report2[j][0].equals(id_list[i])) {
        			if(ban.size() == 0) {
        				answer[i] = 0;
        				break;
        			}else {
        				for (String banMan : ban) {
							if(report2[j][1].equals(banMan)) {
								answer[i]++;
							}
						}
        			}
        		}
			}
		}
		
		// 시간 초과 3, 9, 10, 11, 14, 15, 20, 21
/*        int[] answer = new int[id_list.length];
        int[] cnt = new int[id_list.length];
        ArrayList<String> al = new ArrayList<>();
        //report 중복 제거
        for (String item : report) {
        	if(!al.contains(item)) {
        		al.add(item);
        	}
		}
        report = al.toArray(new String[al.size()]);
        
        //report 1차원을 2차원으로 변환 + split
        String[][] report2 = new String[report.length][2];
        for (int i = 0; i < report2.length; i++) {
			report2[i][0] = report[i].split(" ")[0];
			report2[i][1] = report[i].split(" ")[1];
		}
        
        
        ArrayList<String> ban = new ArrayList<>();
        for (int i = 0; i < cnt.length; i++) {
			for (int j = 0; j < report2.length; j++) {
				if(report2[j][1].equals(id_list[i])) {
					cnt[i] ++;
				}
			}
			if(k <= cnt[i]) {
				ban.add(id_list[i]);
			}
		}
        
        for (int i = 0; i < id_list.length; i++) {
        	for (int j = 0; j < report2.length; j++) {
        		if(report2[j][0].equals(id_list[i])) {
        			if(ban.size() == 0) {
        				answer[i] = 0;
        				break;
        			}else {
        				for (int j2 = 0; j2 < ban.size(); j2++) {
							if(report2[j][1].equals(ban.get(j2))) {
								answer[i]++;
							}
						}
        			}
        		}
			}
		}
        
        System.out.println(Arrays.toString(answer));*/
        System.out.println(Arrays.toString(answer));
        return answer;
    }
	
	public static void main(String[] args) {
		Level1_92334 level1_92334 = new Level1_92334();
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2;
		System.out.println(level1_92334.solution(id_list, report, k));
	}
}
