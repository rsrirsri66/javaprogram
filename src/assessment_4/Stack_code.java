package assessment_4;
import java.util.*;


public class Stack_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> s=new Stack<>();
		Boolean result=s.empty();
		System.out.println("The array is empty:"+result);
		s.push(1);
		s.push(1);
		s.pop();
		s.push(2);
		s.push(3);
		s.push(3);
		s.pop();
		s.push(4);
		s.push(5);
		result=s.empty();
		int siz=s.size();
		System.out.println("Stack size:"+siz);
        System.out.println("Stack elements are:"+s);
        System.out.print("the are is empty:"+result);
	    
        

	}
}
