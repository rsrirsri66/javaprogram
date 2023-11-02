package collection;
import java.util.*;

public class Stack_emptymethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating ab=n instance of stack class
		Stack<Integer> stk=new Stack<>();
		//checking stack is empty or not
		boolean result=stk.empty();
	    System.out.println("is stack empty?"+result);
	    //pushing elements into stack
	    stk.push(77);//push means adding
	    stk.push(23);
	    stk.push(12);
	    stk.push(90);
	   
	    //print elements in stack
	    System.out.println("elements in stack:"+stk);
	    result=stk.empty();
	    System.out.println("is stack is empty?"+result); 
	    stk.peek();
	    System.out.println("elements in stack:"+stk);

	}

}
