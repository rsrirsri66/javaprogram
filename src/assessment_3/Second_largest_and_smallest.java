package assessment_3;

import java.util.Scanner;

public class Second_largest_and_smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,temp;
		Scanner s=new Scanner(System.in);
		System.out.print("no.of elements:");
		n=s.nextInt();
		int aa[]=new int[n];
		System.out.println("enter num one by one:");
		for(int i=0;i<n;i++) {
			aa[i]=s.nextInt();
		}
		 for(int i=0;i<n-1;i++) {
	    	 for(int j=0;j<n-i-1;j++) {
	    		 
				if(aa[j]>aa[j+1]) {
					temp=aa[j];
					aa[j]=aa[j+1];
					aa[j+1]=temp;
	    			 
	    		 }
	    	 }
	     }
		// System.out.println("after sorting:");
	    // for(int k=0;k<n;k++) {
	    // System.out.println(aa[k]+" ");}
	    // }
	     System.out.println("second largest num="+aa[n-2]+" ");
	     System.out.print(" smallest num="+aa[0]);

	}

}
