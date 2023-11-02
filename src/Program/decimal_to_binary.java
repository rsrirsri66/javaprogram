package Program;
import java.util.*;
public class decimal_to_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter num=");
		int nbr=sc.nextInt();
		int rem;
	//	int bin[]=new int[nbr];
		int index=0;
		while(nbr!=0)
		{
			
			rem=nbr%2;
			nbr=nbr/2;
			//nbr=que;
			//res=rem;
			
			
			System.out.println(rem);
			
			
				
		}

	}

}
