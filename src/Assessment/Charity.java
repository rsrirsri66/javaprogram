package Assessment;

import java.util.Scanner;

public class Charity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n,m,result = 0;
       Scanner s=new Scanner(System.in);
       System.out.print("charity peoples=");
       n=s.nextInt();
       System.out.print("clothes=");
       m=s.nextInt();
       result=m/n;
    if(result==m/n) {
    	   System.out.print(result);
        }
    	  
    else {
    	System.out.print(0);
    }
    	   
    	   
     
    	  
	}

}
