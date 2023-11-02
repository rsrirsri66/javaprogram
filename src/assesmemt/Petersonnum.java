package assesmemt;

import java.util.Scanner;

public class Petersonnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int fact=1,num,n1=0,n2=0,result=0;
       Scanner s=new Scanner(System.in);
       System.out.println("enter num:");
       num=s.nextInt();
       String str1=Integer.toString(num);
       int len=str1.length();
       int temp=num;
       for(int i=1;i<=len;i++) {
    	  n1=num%10;
    	  num=num/10;
    	  for(int j=1;j<=n1;j++) {
    		   fact=fact*j;
    		    
    	  }
    	  //System.out.println(fact); 
    	  
    	  result=fact+result;
    	  fact=1;
       //System.out.print();
      	
	
       }
       //System.out.println(result);
        if(result==temp) {
        	System.out.println("peterson");
        }
        else {
        	System.out.print("not peterson");
        }

}
}
