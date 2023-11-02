package regular_expersion;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class Case_insensitive {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter:");
	    String a=s.nextLine();
		// TODO Auto-generated method stub
       Pattern p=Pattern.compile("javaTraining",Pattern.CASE_INSENSITIVE);
       Matcher m=p.matcher(a);
       boolean matchfound=m.find();
       if(matchfound) 
       {
    	   System.out.println("match found");
       }
       else {
    	   System.out.println("match not found");
       }
	}

}
