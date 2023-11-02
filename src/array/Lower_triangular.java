package array;

import java.util.Scanner;

public class Lower_triangular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,c,flag=0;
		Scanner s=new Scanner(System.in);
		System.out.print("row:");
		r=s.nextInt();
		System.out.print("column:");
		c=s.nextInt();
		if(r==c) {
		int a[][]=new int[r][c];
		System.out.println("enter the element=");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=s.nextInt();
				
			}
		}
		System.out.println("enter the matrix:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<r;i++) {
			for(int j=i+1;j<r;j++) {
				if(a[i][j]!=0) {
					flag=1;
				}
				
			}
		}
		if(flag==0) {
			System.out.print("lower triangular");}
			else {
				System.out.print("no");
			}
		}
		else {
			System.out.print("miss match");
		}
		
	}

}
