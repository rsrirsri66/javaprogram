package Program;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.print("name=");
		String name=s.nextLine();
		
		int numlength=name.length();
		String rev="";
		for(int i=(numlength-1);i>=0;--i)
		{
			rev=rev+name.charAt(i);
			
			
		}

		if(rev.equals(name))  
		{ 
			System.out.println("palindrome");  
		}
		else
		{
			System.out.println("not palindrome");  
		}
		
		

	}

}
