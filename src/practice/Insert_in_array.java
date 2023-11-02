package practice;
import java.util.*;
public class Insert_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner(System.in);
    	System.out.println("enter the num:");
		n=s.nextInt();
		int ar[]=new int[n+1];
		System.out.print("array before inserting:"+" ");
		for(int i=0;i<n;i++) {
			ar[i]=s.nextInt();
			
		}
		
		System.out.println("position:");
		int pos=s.nextInt();
		System.out.print("enter the element to insert:");
		int ele=s.nextInt();
		int j=n;
		while(j>=pos) {
			ar[j]=ar[j-1];
			j--;
		}
		
		ar[pos-1]=ele;
		System.out.print("after positioning:");
		for(int i=0;i<n+1;i++) {
			System.out.print(ar[i]+" ");
		}
	}
}
