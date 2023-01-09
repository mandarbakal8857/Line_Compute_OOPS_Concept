package com.bridgelabs.linecompute;

import java.util.Scanner;



public class LineCompute
{
	
		int x1,x2,y1,y2;
		int lenghtOfLine;
		int line1,line2;
		
		public void values()
		{
			System.out.println("Enter values of points:x1,x2,y1,y2");
			Scanner sc=new Scanner(System.in);
			
			x1=sc.nextInt();
			x2=sc.nextInt();
			y1=sc.nextInt();
			y2=sc.nextInt();
			System.out.println("The co-ordinates are: (" + x1 + ", " + y1 + ")" + "(" + x2 + "," + y2 + ")");
		}
		//calculate length
		public void lengthCalculation()
		{
			lenghtOfLine=(int) Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1, 2));
		}
		
		//Equality Check
		public void equalityCheck()
		{
			System.out.println("For line 1:");
			values();
			lengthCalculation();
			line1=lenghtOfLine;
			System.out.println("Length of line 1="+line1);
			
			System.out.println("For line 2:");
			values();
			lengthCalculation();
			line2=lenghtOfLine;
			System.out.println("Length of line 1="+line2);
			
		}
		
		public void compareLength()
		{
			int lengthCheck= line1.compareTo(line2);
			switch(lengthCheck)
			{
			case 0:
				System.out.println("line 1 is equal to line 2");
				break;
			case 1:
				System.out.println("line 1 is greater than line 2");
				break;
			default:
				System.out.println("line 2 is greater than line 1");
			}
		}

		public static void main(String[] args) 
		{
			LineCompute ln=new LineCompute();
			ln.equalityCheck();
			ln.compareLength();
		}


}
