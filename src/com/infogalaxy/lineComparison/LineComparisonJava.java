package com.infogalaxy.lineComparison;

import java.util.Scanner;

public  class LineComparisonJava {
	
	int x1;
	int x2;
	int y1;
	int y2;
	String line;

	public  void  lineInput()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter the x1,y1 and x2,y2 Points for the Line : ");
		
		 x1 = scanner.nextInt();
		 x2 = scanner.nextInt();
		 y1 = scanner.nextInt();
		 y2 = scanner.nextInt();
	}
		public double lineCalculate()
		{
			return Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
		}
		
		public void lineCheck(LineComparisonJava lineComparisonJava2)
		{
			if(this.lineCalculate() == lineComparisonJava2.lineCalculate())
			{
				System.out.println(" Both Lines are Same ");
			}
			else if (this.lineCalculate() > lineComparisonJava2.lineCalculate())
			{
				System.out.println(" Line 1 is Greater than Line 2 ");
			}
			else
			{
				System.out.println(" Line 2 is Greater than Line 1 ");
			}
		}
		
		public static  void main(String[] args)
		{
	
			System.out.println(" Welcome to Line Comparison Program ");
			
			LineComparisonJava lineComparisonJava = new LineComparisonJava();
			LineComparisonJava lineComparisonJava2 = new LineComparisonJava();
			
			lineComparisonJava.lineInput();
			lineComparisonJava2.lineInput();
			
			lineComparisonJava.lineCheck(lineComparisonJava2);
			
		}
	}

