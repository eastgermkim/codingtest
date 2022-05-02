package baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Greedy_4 {
	
	//1-2+3+4+5-6+7+8+9-10-11-12-13
	public int solution(String N) throws ScriptException {
		
		ScriptEngineManager s = new ScriptEngineManager();
		ScriptEngine engine = s.getEngineByName("JavaScript");
		ArrayList<Integer> al = new ArrayList<>();
		String[] cal = (N.split("-"));
		
		int answer = 0;
		int sum = 0;
		
		System.out.println(Arrays.toString(cal));
		
		if(cal[0] == null) {
			for (int i = 0; i < cal.length; i++) {
				
			}
			
		}else {
			
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws ScriptException {
		
		Scanner sc = new Scanner(System.in);
		Greedy_4 greedy_4 = new Greedy_4();
		
		/*String N = sc.next();
		
		System.out.println(greedy_4.solution(N));*/
		System.out.println(greedy_4.solution("-1+2+3-4+5+6"));
	}
}
