package looping;
import java.util.Scanner;
public class Sum_product {
	public static void main(String[] args) {
		int n,reminder,result=0,sum=0,product=0, fact=0,ans;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the num");
		n=s.nextInt();
		while(n>0) {
			reminder=n%10;
			result=reminder;
			n=n/10;
			 sum+=result;
			 product+=result;
			
		}
		
		System.out.println(sum);
		System.out.println("product="+product);
		System.out.println(fact);
	}

}
