package regular_expersion;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

	public static boolean isValidPassword(String password) {
		// TODO Auto-generated method stub

		String pass="^(?=.*[0-9])"+"(?=.*[a-z])"+"(?=.*[A-Z])"+"(?=.*[@#$%^&+=])"+"(?=.\\S+$).{8,20}$";
		Pattern p=Pattern.compile(pass);
		if(password==null) {
			 return false;
		}
		Matcher m=p.matcher(password);
		return m.matches();
		
	}
	public static void main(String arg[])
	{
		String str1="Pass@portal12";
		System.out.println(isValidPassword(str1));
		
		String str2="PasswordCheck";
		System.out.println(isValidPassword(str2));
		
		String str3="pass@portal222";
		System.out.println(isValidPassword(str3));
		
		String str4="0l12";
		System.out.println(isValidPassword(str4));
		
		String str5="Check@20";
		System.out.println(isValidPassword(str5));
		
		String str6="check@portal12";
		System.out.println(isValidPassword(str6));
	}

}
