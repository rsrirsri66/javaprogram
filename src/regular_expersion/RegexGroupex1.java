package regular_expersion;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexGroupex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Pattern p=Pattern.compile("a(bb)");
      Matcher m=p.matcher("aabbabbabbaaa");
      while(m.find())
    	  System.out.println("start:"+m.start()+",end:"+m.end()+",group:"+m.group());
    	  
	}

}
