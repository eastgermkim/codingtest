package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class Level1_42840 {
	public int[] solution(int[] answers) {
        int[] answer;
        int[] giveup1 = {1,2,3,4,5};
        int[] giveup2 = {2,1,2,3,2,4,2,5};
        int[] giveup3 = {3,3,1,1,2,2,4,4,5,5};
        int[] score = new int[3];
        int max = 0;
        
        for (int i = 0; i <answers.length; i++) {
			if(answers[i] == giveup1[i%5]) {
				score[0]++;
			}
			if(answers[i] == giveup2[i%8]) {
				score[1]++;
			}
			if(answers[i] == giveup3[i%10]) {
				score[2]++;
			}
		}
        
        //최대 점수 구하기
        for (int i = 0; i < score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			}
		}
        
        //최대 점수 인 사람 수 구하기
        int maxCount = 0;
        for (int i = 0; i < score.length; i++) {
			if(score[i] == max) {
				maxCount++;
			}
		}
        
        //
        answer = new int[maxCount];
        int idx = 0;
        for(int i=0; i<3; i++){
            if(score[i] == max) {
            	answer[idx++] = i+1;
            }
        }
        return answer;
    }
	
	public static void main(String[] args) {
		Level1_42840 level1_42840 = new Level1_42840();
		int[] answers = {1,3,2,4,2};
		System.out.println(Arrays.toString(level1_42840.solution(answers)));
	}
}
