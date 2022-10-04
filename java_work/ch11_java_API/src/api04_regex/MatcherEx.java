package api04_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherEx {
	
	public static void main(String[] args) {
		String ht = "http:// ";
		String txt = "http:// This is the text be searched "
				+ "for occurrence of the http:// pattern http:// ";
		
		String ptn = "http:// ";
		Pattern pattern = Pattern.compile(ptn);
		Matcher matcher = pattern.matcher(ht);
		System.out.println(matcher.matches());
		
		matcher = pattern.matcher(txt);
		System.out.println(matcher.matches());
		
//		System.out.println(matcher.lookingAt());
		
//		System.out.println(matcher.find());
//		System.out.println(matcher.group());
//		
//		System.out.println(matcher.find());
//		System.out.println(matcher.group());
//		
//		System.out.println(matcher.find());
//		System.out.println(matcher.group());
//		
//		System.out.println(matcher.find());
//		System.out.println(matcher.group());
		
		int count = 0;
		while(matcher.find()) {
			System.out.println(count + " : " + matcher.group());
			count++;
		}
		System.out.println("총 개수: " + count);
	}
	
}
