
/*
 * Maylee Tan 
   Naoto Oka
   
   October 29, 2021
   
   CS A170 - Project 3
 */

import java.util.Scanner;
import java.util.*;

public class MayleeTanNaotoOkaProjectThreeTask1 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		// Task #1
		System.out.println("***********************************");
		double[] ftemp = new double[5];
		
		System.out.print("Fahrenheit Temperatures: ");
		enterTemps(ftemp);
		double[] convertedTemps = celsius(ftemp);
		
		// Task #3
		System.out.println("Fahrenheit       Celsius");
		System.out.println("==========================");
		
		for(int i = 0; i < ftemp.length; i++)
		{
			System.out.printf("%.0f %22.2f", ftemp[i], convertedTemps[i] );
			System.out.println();
		}
		
		// Task #4
		System.out.println("***********************************");
		int[] mathArray = new int[10];
		
		enterGrades(mathArray);
		for (int element: mathArray)
		{
			System.out.print(element + ", ");
		}
		
		System.out.println();
		
		selectionSort(mathArray);
		for (int element: mathArray)
		{
			System.out.print(element + ", ");
		}
		
		System.out.println();
		
		double mean = calculateMean(mathArray);
		System.out.println("Mean: " + mean);
		
		// Task #5
		System.out.println("***********************************");
		int[][] twoDArray =
			{
					{1, 2, 3},
					{4, 5, 6},
					{7, 8, 9},
			};
		
		int total = getTotal(twoDArray);
		double average = getAverage(twoDArray);
		
		System.out.printf("Total: " + total);
		System.out.println("Average: " + average);
		
		getRowTotal(twoDArray, 2);
		getColumnTotal(twoDArray, 2);
		getHighestInRow(twoDArray, 2);
		getLowestInRow(twoDArray, 2);
		

		// Task #6
		System.out.println("***********************************");
		ArrayList<Double> purchases = new ArrayList<Double>();
		ArrayList<String> customerNames = new ArrayList<String>();
		
		int i = 0;
			do
			{
				System.out.println("Customer's name: ");
				customerNames.add(i, in.next());
				System.out.println("Purchase amount (enter 0 to quit: ");
				purchases.add(i, in.nextDouble());

				i++;
			}
			while (purchases.get(i-1) != 0);
		
		
		String bestCustomer = nameOfBestCustomer(purchases, customerNames);
		
		System.out.println("Best customer: " + bestCustomer);
		
	} // end of main
	
	// Task #1
	public static void enterTemps(double[] fahrenheit)
	{
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i < fahrenheit.length; i++)
		{
			
			fahrenheit [i] = in.nextDouble();
		}
	}
	// Task #2
	public static double[] celsius(double[] fahrenheit1)
	{
		double[] celsius = new double[5];
 
		for(int i = 0; i < fahrenheit1.length; i++)
		{
			celsius[i] = (5.0 / 9) * (fahrenheit1[i] - 32);
		}
		
		return celsius;
	}
	
	// Task #4 
	
	public static void enterGrades(int[] grades)
	{
		Scanner in = new Scanner(System.in);
		
		int j = 1;
		for(int i = 0; i < grades.length; i++)
		{
			
		System.out.println("Enter score number " + j + ": "  );
		grades[i] = in.nextInt();
		
		j++;
		}
	}
	
	public static void selectionSort(int[] data)
	{
		
		for (int i = 0; i < data.length - 1; i++)
		{
			int max = i;
			int maxVal = data[i];
			
			for (int j = i + 1; j < data.length; j++)
			{
				if(data[j] > maxVal )
				{
					maxVal = data[j];
					max = j;
				}
			}
			
			
			data[max] = data[i];
			data[i] = maxVal;
		}
	}
	
	public static double calculateMean(int[] scores)
	{
		double total = 0;
		for (int i = 0; i < scores.length; i++)
		{
			total += scores[i];
			
		}
		
		double mean = total / scores.length;
		
		return mean;
	}
	
	// Task #5
	public static int getTotal(int[][] arr1)
	{
		int total = 0;
		for (int i = 0; i < arr1.length; i++)
		{
			for (int j = 0; j < arr1[0].length; j++)
			{
				total += arr1[i][j];
			}
			
		}
		return total;
	}
	
	public static double getAverage(int[][] arr2)
	{
		double total = getTotal(arr2);
		
		double average = total / arr2.length;
		
		return average;
	}
	
	public static void getRowTotal(int[][] arr3, int row)
	{
		int rowTotal = 0;
		for (int i = 0; i < arr3[row].length; i++)
		{
			rowTotal += arr3[row][i];
		}
		
		System.out.println("Row total of " + row + ": " + rowTotal);
		
	}
	
	public static void getColumnTotal(int[][] arr4, int column)
	{
		int columnTotal = 0;
		for (int i = 0; i < arr4.length; i++)
		{
			columnTotal += arr4[i][column];
		}
		
		System.out.println("Column total of " + column + " : " + columnTotal);
		
	}
	
	public static void getHighestInRow(int[][] arr5, int row)
	{
		int highest = arr5[row][0];
		for (int i = 0; i < arr5[row].length; i++)
		{
			if (highest < arr5[row][i])
			{
				highest = arr5[row][i];
			}
		}
		
		System.out.println("Highest value of row " + row + " : " + highest);
	}
	
	public static void getLowestInRow(int[][] arr6, int row)
	{
		int lowest = arr6[row][0];
		for (int i = 0; i < arr6[row].length; i++)
		{
			if (lowest > arr6[row][i])
			{
				lowest = arr6[row][i];
			}
		}
		
		System.out.println("Lowest value of row " + row + " : " + lowest);
	}
	
	// Task #6
	
	public static String nameOfBestCustomer(ArrayList<Double> sales, ArrayList<String> customers)
	{
		double largest = sales.get(0);
		String nameOfBest = customers.get(0);
		for(int i = 0; i < sales.size(); i++)
		{
			if (sales.get(i) > largest)
			{
				largest = sales.get(i);
				nameOfBest = customers.get(i);
			}
		}
		
		return nameOfBest;
	}
}
