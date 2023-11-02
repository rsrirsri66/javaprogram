package practice;
import java.util.*;
public class Small_largest_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the sentence:");
		String ans=s.nextLine();
		String[]words=ans.split(" ");
		String small=words[0];
		String large=words[0];
		
		for(int i=0;i<words.length;i++)
		{
			if(words[i].length()<small.length()) {
				small=words[i];
			}
			if(words[i].length()>large.length()) {
				large=words[i];
			}
		}
		System.out.println("largest word:"+large);
		System.out.println("smallest word:"+small);
		System.out.println();	
	}
   }
