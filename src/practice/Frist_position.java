package practice;
import java.util.*;
public class Frist_position {

       static  int capitalletter(String str) {
        
       for(int i=0;i<str.length();i++)
       {    
    	   char letter=str.charAt(i);
    	   if(Character.isUpperCase(letter))
    		   
    	   return i+1; 
    	   
       }
       return 0;
       }
       static int smallletter(String str) {
    	   for(int i=0;i<str.length();i++)
    	   {
    		   char letter=str.charAt(i);
    		   if(Character.isLowerCase(letter))
    			   return i+1;
    	   }
    	   return 0;
       } 
       static int digit(String str) {
    	   for(int i=0;i<str.length();i++)
    	   {
    		   char letter=str.charAt(i);
    		   if(Character.isDigit(letter))
    			   
    	  return i+1;
    	   }
    	   return 0;
       } 
       static int space(String str) {
    	   for(int i=0;i<str.length();i++)
    	   {
    		   char letter=str.charAt(i);
    		   if(Character.isSpace(letter))
    			   
    	  return i+1;
    	   }
    	   return 0;
       } 
       public static int Vowels(String str)
   	{
   		for(int i=0;i<str.length();i++)
   		{
   			
   			if(str.charAt(i)=='a'||str.charAt(i)=='A'||str.charAt(i)=='e'||str.charAt(i)=='E'||str.charAt(i)=='i'||str.charAt(i)=='I'||str.charAt(i)=='o'
   					||str.charAt(i)=='O'||str.charAt(i)=='u'||str.charAt(i)=='U')
   			{
   				return i+1;
   			}
   			
   		}
   		return 0;
   	}
       public static int consonants(String str)
   	{
   		for(int i=0;i<str.length();i++)
   		{
   			
   			if(str.charAt(i)!='a'&&str.charAt(i)!='A'&&str.charAt(i)!='e'&&str.charAt(i)!='E'&&str.charAt(i)!='i'&&str.charAt(i)!='I'&&str.charAt(i)!='o'
   					&&str.charAt(i)!='O'&&str.charAt(i)!='u'&&str.charAt(i)!='U')
   			{
   				return i+1;
   			}
   			
   		}
   		return 0;
   	}
       public static int specialch(String str)
   	{
                   for(int i=0;i<str.length();i++)
   			
   		{
   			char lett=str.charAt(i);
   			if(!Character.isDigit(lett)&&!Character.isUpperCase(lett)&&!Character.isLowerCase(lett)&&!Character.isSpace(lett))
   			{
   				return i+1;
   			}
   		}
              return 0; 
   	}
       
   	public static void main(String[] args) {
   	 Scanner s=new Scanner(System.in);
     System.out.println("input: ");
     String str=s.nextLine();
     
     int position=capitalletter(str);
     
     if(position>0)
     {
    	 System.out.println("position:"+position);
    	 
     }
     else {
    	 System.out.println("error");
     }
   		
	
   	int pos=smallletter(str);
   	if(pos!=0)
   		
   	{
   		System.out.println("lower case position:"+pos);
   	}
   	int pos1=digit(str);
   	if(pos1!=0)
   	{
   		System.out.println("digit:"+pos1);
   	}
 	int pos2=space(str);
   	if(pos2!=0)
   	{
   		System.out.println("space:"+pos2);
   	}
   	
   	int pos3=Vowels(str);
	if(pos3!=0)
   		
   	{
   		System.out.println("vowels:"+pos3);
   	}
	int pos4=consonants(str);
	if(pos4!=0)
   		
   	{
   		System.out.println("cons:"+pos4);
   	}
	int pos5=specialch(str);
	if(pos5!=0)
   		
   	{
   		System.out.println("cons:"+pos5);
   	}
	
   	
   	
   	

}
}
