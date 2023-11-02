package regular_expersion;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Pattern.matches("\\d", "abc"));
		System.out.println(Pattern.matches("\\d", "1"));
		System.out.println(Pattern.matches("\\d", "1234"));
		System.out.println(Pattern.matches("\\d", "3233"));
		System.out.println(Pattern.matches("\\d", "323abc"));
		
		System.out.println("metacharacters D....");
		System.out.println(Pattern.matches("\\D", "abc"));
		System.out.println(Pattern.matches("\\D", "1"));
		System.out.println(Pattern.matches("\\D", "4443"));
		System.out.println(Pattern.matches("\\D", "abc323"));
		System.out.println(Pattern.matches("\\D", "m"));
		
		System.out.println("metacharacters D with oocurance");
		System.out.println(Pattern.matches("\\D*", "maa"));//true(non-digit and may come 0 or more times)
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "srisri66"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "111111"));
		System.out.println(Pattern.matches("[a-zA-Z]{6}", "srisri"));
		

	}

}
