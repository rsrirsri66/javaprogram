package assessment_3;

import java.util.*;

public class Sum_of_digit_from_strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String as="abcd5678efgh1234";
		int b, sum=0;
		Scanner s=new Scanner(System.in);
		String str1=s.next();
		for(int i=0;i<str1.length();i++)
		{
			if(Character.isDigit(str1.charAt(i)))
			{
				b=Integer.parseInt(String.valueOf(str1.charAt(i)));
				sum=sum+b;
				
				
			}
		}
		System.out.println(sum);

	}

}
