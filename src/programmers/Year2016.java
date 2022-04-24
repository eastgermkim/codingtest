package programmers;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Year2016 {
	 public String solution(int a, int b) {
	        String answer = "";
	        
	        Calendar cal = Calendar.getInstance();
	        cal.set(2016, a-1, b);
	        
	        Date date = cal.getTime();
	        
	        SimpleDateFormat sdf = new SimpleDateFormat("E", Locale.ENGLISH);
	        
	        answer= sdf.format(date).toUpperCase();
	        return answer;
	    }
	 
	 public static void main(String[] args) {
		 Year2016 year2016 = new Year2016(); 
		System.out.println(year2016.solution(5, 24));
	}
}
