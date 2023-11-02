package Assessment;

import java.util.Scanner;

public class calculator {

	public static void main(String[] arg) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter first num=");
		double first=reader.nextDouble();
		System.out.println("Enter second num=");
		double second=reader.nextDouble();
	    System.out.print("enter a operator(+,-,*,/)");	
	    char operator = reader.next().charAt(0);
	    double result =0;
	    switch(operator)
	    {
	    case '+':
	    	result=first+second;
	    	break;
	    case '-':
	    	result=first-second;
	    	break;
	    case '*':
	    result=first*second;
	    break;
	    case '/':
	    	result=first/second;
	    	break;
	    	default:
	    		System.out.print("Error! ");
	    }
	    System.out.printf("%.1f %c %.1f=%.1f",first,operator,second,result );
	}
}
