package Program;

import java.util.Scanner;

public class Matrix_boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int r,c,flag = 0;
		System.out.print("row:");
		r=s.nextInt();
		System.out.print("column:");
		c=s.nextInt();
		
			int a[][]=new int[r][c];
			System.out.println("enter the matrix :"+" ");
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
			int R[]=new int [r];
			int C[]=new int [c];
			
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					R[i]=0;
					C[j]=0;
				}
			}
			
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					if(a[i][j]==1)
					{
						R[i]=1;
						C[j]=1;
					}
				}
			}
			
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					if(R[i]==1 || C[j]==1)
					{
						a[i][j]=1;
						
					}
				}
			}
			System.out.println("The Output matrix is:");
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
				
				
			}


		}}


