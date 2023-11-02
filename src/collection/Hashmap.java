package collection;
import java.util.*;
public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer>m1=new HashMap<String, Integer>();
		m1.put("zara", 8);//zara =kay ,8 is value
		m1.put("mahaan",1);
		m1.put("zarah", 18);
		m1.put("zarax", 81);
		
		System.out.println();
		System.out.println("map elements:");
		System.out.println("\t"+m1);
		System.out.println(m1.get("zara"));
		

	}

}
