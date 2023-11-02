package practice;

import java.util.Scanner;

public class Primenum {

	  public static boolean isPrime(int n) {
		   if (n <= 1) {
	            return false;
	        }
	        if (n <= 3) {
	            return true;
	        }
	        if (n % 2 == 0 || n % 3 == 0) {
	            return false;
	        }
	        int i = 5;
	        while (i * i <= n) {
	            if (n % i == 0 || n % (i + 2) == 0) {
	                return false;
	            }
	            i += 6;
	        }
	        return true;
	    }

	  public static void main(String[] args) {
		    Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the limit: ");
	        int limit = scanner.nextInt();
	        System.out.println("Prime numbers up to " + limit + ":");
	        for (int i=2;i<=limit;i++) {
	        	if(isPrime(i)) {
	        		System.out.print(i);
	        	}
	        }


 
	  }
}

	   
	               
	            
	