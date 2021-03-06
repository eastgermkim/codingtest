package programmers_level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StringChangeMine {
	public String[] solution(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> list = new ArrayList<>();
        
        for (int i = 0; i < strings.length; i++) {
        	list.add(strings[i].charAt(n)+strings[i]);
        }
        
        Collections.sort(list);
        
        answer = new String[list.size()];
        
        for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i).substring(1,list.get(i).length());
		}
        
        
        return answer;
    }
	public static void main(String[] args) {
		StringChangeMine scm = new StringChangeMine();
		String[] strings = {"sun", "bed", "car"};
		System.out.println(Arrays.toString(scm.solution(strings , 1)));
	}
}
