package practice;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter string:");
		String str=s.nextLine();
		String letter=str.toLowerCase();
		StringBuffer a=new StringBuffer(letter);
		a.reverse();
		
		String data= a.toString();
		if(letter.equals(data)) {
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}

	}

}
