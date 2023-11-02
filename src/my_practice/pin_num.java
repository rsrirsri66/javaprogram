package my_practice;
import java.util.*;

public class pin_num {
	public static boolean isprime(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i<=9;i++) {
			if(num%2==0) {
				return false;
			}
		}
		return true;
	}
	public static boolean isValid(int pin, int first, int sec, int third, int fourth) {
		  boolean condition1 = first % 2 != 0;
	        boolean condition2 = sec % 2 == 0;
	        boolean condition3 = isprime(third);
	        boolean condition4 = !isprime(fourth);

	        return condition1 && condition2 && condition3 && condition4;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the total number of PIN numbers ");
		int n=s.nextInt();
		int pins[]=new int[n];
		System.out.println("Enter the PIN numbers");
		for(int i=0;i<n;i++) {
			pins[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) {
		int pin=pins[i];
		int first = pin / 1000; 
		//System.out.println("1st:"+first);
		int sec = (pin / 100) % 10; 
		int third = (pin / 10) % 10;
		int fourth = pin % 10;
boolean isValidPin=isValid(pin, first, sec, third, fourth);
//System.out.println("Generated 4-digit PIN: " + pin + " - " + (isValidPin ? "Valid" : "Invalid"));
if(isValidPin==true) 
	      System.out.println("Valid PIN numbers are"+" "+pin);
	    } 
	}
}

