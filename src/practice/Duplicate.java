package practice;

import java.util.Scanner;

public class Duplicate {
static int removeduplicate(int ae[],int n) {
	int replaceindex=0,j;
		for(int i=0;i<n;i++) {
			for( j=i+1;j<n;j++) {
				if(ae[j]!=ae[i]) { 
					break;
				}
			}
				
		    ae[replaceindex++]=ae[i];
		    i=j-1;
				
			}
		
		return replaceindex;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int n,pos;
			Scanner s=new Scanner(System.in);
			System.out.print("enter num of elements");
			n=s.nextInt();
			int ae[]=new int[n];
			System.out.println("enter num one by one:"+" ");
			for(int i=0;i<n;i++)
			{
				ae[i]=s.nextInt();
			}
		System.out.println("after duplicating:");
		int a=removeduplicate(ae,n);
		for(int i=0;i<a;i++) {
			
			System.out.println(" "+ae[i]);
		}

	}

}
