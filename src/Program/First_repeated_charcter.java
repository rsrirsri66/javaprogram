package Program;
import java.util.*;
public class First_repeated_charcter {
	
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in) ;
		System.out.println("enter the word:");
		String a=s.nextLine();
		int len=a.length();
		for(int i=0;i<len-1;i++) {
			for(int j=i+1;j<len;j++) {
				if(a.charAt(i)==a.charAt(j)) {
					System.out.print(a.charAt(i));
					break;
				}
			}
			
		}

	}

}
