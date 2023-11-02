package collection;
import java.util.*;

public class Try_catch {
	
	static void pushelement(Stack<Integer>stk,int x)
	{
		stk.push(x);
		 System.out.println("push->"+x);
		 //prints modified stack
		 System.out.println("Stack:"+stk);
	}
	static void popeelement(Stack<Integer>stk)
	{
		 System.out.println("pop-> ");
		 Integer x=(Integer)stk.pop();
		 System.out.println(x);
		//prints modified stack
		 System.out.println("stack:"+stk);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer>stk=new Stack<Integer>();
		 System.out.println("stack:"+stk);
		 try
		 {
			 popeelement(stk);
			 
		 }
		 catch(EmptyStackException e)
		 {
			 System.out.println("empty stack");
		 }
		 pushelement(stk,20);
		 pushelement(stk,13);
		 pushelement(stk,89);
		 pushelement(stk,11);
		 pushelement(stk,45);
		 pushelement(stk,18);
		 popeelement(stk);
		 popeelement(stk);
		 System.out.println(stk.peek());
		 int loc=stk.search(11);
         System.out.println("location :"+loc);
	}
		
	}


