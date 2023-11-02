package Program;

import java.util.Scanner;

public class vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the char:");
		ch=s.next().charAt(0);
		switch(ch) {
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
		System.out.println("vowel="+ch);
		break;
		default:
			System.out.println("consonent:"+ch);
			
		} 
		

	}

}
