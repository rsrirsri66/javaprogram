package regular_expersion;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MUltiple_way_Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1st method
		Pattern p=Pattern.compile(".s");
		Matcher m=p.matcher("as");
		boolean b=m.matches();
		//2nd method
		boolean b2=Pattern.compile(".s").matcher("as").matches();
		//3rd method
		boolean b3=Pattern.matches(". ", "a ");
		
		System.out.println(b+" "+b2+" "+b3+" ");
	}

}
