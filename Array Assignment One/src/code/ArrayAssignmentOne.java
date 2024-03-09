package code;

import java.util.Scanner;

public class ArrayAssignmentOne {
		
	public static int[] sequentialArray(int[] array)
	{
		int [] sequentialArray = new int[100];
		
		for (int x = 0; x < 100; x++)
		{
			sequentialArray[x] = x+1;
		}

		array = sequentialArray;
		
		return array;
	}
	
	public static int[] randomArray(int[] array)
	{
		int [] randomArray = new int[100];
		
		for (int x = 0; x < 100; x++)
		{
			randomArray[x] = (int)(Math.random()*(100)+ 1);
		}
		
		array = randomArray;

		return array;
	}
	public static String ascending(int[] array)
	{
		String trueOrFalse = "";
		
		for (int x = 0; x < 99; x++)
		{
			if(array[x+1] >= array[x])
			{
				trueOrFalse = "true";
			}
			else
			{
				trueOrFalse = "false";
				break;
			}
		}
		
		return trueOrFalse;
	}
	public static String shuffleSort(int[] array)
	{
		String trueOrFalse = "";
		
		int temp = 0;
		int count = 0;
		
		do
		{
			count++;
			
			for (int x = 0; x < 99; x++)
			{
				if(array[x+1] >= array[x])
				{
					trueOrFalse = "true";
				}
				else
				{
					trueOrFalse = "false";
					break;
				}
			}
			
			if (trueOrFalse == "true")
			{
				break;
			}
			
			for (int x = 0; x < 100; x++)
			{
				int y = (int)(Math.random()*100);
				temp = array[x];
				array[x] = array[y];
				array[y] = temp;
			}
		
		}while(count < 10000);
		
		return trueOrFalse;
	}
	public static int lowestNumber(int[] array)
	{
		int lowestNumber = 0;
		int temp = 0;
		
		for (int x = 0; x < 99; x++)
		{
			for (int y = 0; y < 99; y++)
			{
				if(array[x] < array[y])
				{
					temp = array[x];
					array[x] = array[y];
					array[y] = temp;
				}
			}
		}
		
		lowestNumber = array[0];
		
		return lowestNumber; 
	}
	public static int highestNumber(int[] array)
	{
		int highestNumber = 0;
		int temp = 0;
		
		for (int x = 0; x < 99; x++)
		{
			for (int y = 0; y < 99; y++)
			{
				if(array[x] > array[y])
				{
					temp = array[x];
					array[x] = array[y];
					array[y] = temp;
				}
			}
		}
		
		highestNumber = array[0];
		
		return highestNumber; 
	}	
	public static int occurances(int[] array, int number)
	{
		int occurances = 0;
		
		for (int x = 0; x < 99; x++)
		{
			if(array[x] == number)
			{
				occurances++;
			}
		}
		
		return occurances;
	}
	public static int[] replace(int[] array, int replace1, int replace2)
	{
		for (int x = 0; x < 99; x++)
		{
			if(array[x] == replace1)
			{
				array[x] = replace2;
			}
		}
		
		return array;
	}
	public static int consecutiveSum(int[] array)
	{
		int indexStart = 0;
		int total = 0;
		int maxTotal = 0;
		
		
		for (int x = 0; x < 92; x++)
		{
			for (int y = x; y < 10+x; y++)
			{
				total += array[x];
			}
			
			if(total > maxTotal)
			{
				maxTotal = total;
				indexStart = x;
			}
			
			total = 0;
		}
		
		return indexStart;
	}
	
	public static void main(String[] args) 
	{
		int exit = 0, menu = 0;
		
		Scanner input = new Scanner(System.in);
		int[] array = new int[100];	
		
		do
		{
			System.out.println("0. Exit the program.\r\n"
					+ "1. Populate the array randomly.\r\n"
					+ "2. Populate the array sequentially from 1 to 100.\r\n"
					+ "3. Display the Array.\r\n"
					+ "4. Shuffle the Array.\r\n"
					+ "5. Find array index of number.\r\n"
					+ "6. T/F The array is in ascending order.\r\n"
					+ "7. T/F Shuffle the method into ascending order.\r\n"
					+ "8. Print lowest value.\r\n"
					+ "9. Print highest value.\r\n"
					+ "10. Find number of occurances for a number.\r\n"
					+ "11. Replace _ with _.\r\n"
					+ "12. Find section of 10 consecutive indexes with greatest sum.");
			
			menu = input.nextInt();
			
			if(menu == 0)
			{
				exit = 1;
			}
			
			if(menu == 1)
			{
				array = randomArray(array);	
			}
			if(menu == 2)
			{
				array = sequentialArray(array);
			}
			if(menu == 3)
			{
				for (int x = 0; x < 100; x++)
				{
					System.out.println(array[x]);
				}
			}
			if(menu == 4)
			{
				int temp = 0;
				
				for (int x = 0; x < 100; x++)
				{
					int y = (int)(Math.random()*100);
					temp = array[x];
					array[x] = array[y];
					array[y] = temp;
				}
			}
			if(menu == 5)
			{
				int find = input.nextInt();
				int none = 0;
				
				for (int x = 0; x < 100; x++)
				{
					if(array[x] == find) 
					{
						System.out.println(x);
						none = 1;
						break;
					}
				}
				
				if(none == 0)
				{
					System.out.println("-1");
				}
			}
			if(menu == 6)
			{
				System.out.println(ascending(array));
			}
			if(menu == 7)
			{
				System.out.println(shuffleSort(array));
			}
			if(menu == 8)
			{
				System.out.println(lowestNumber(array));
			}
			if(menu == 9)
			{
				System.out.println(highestNumber(array));
			}
			if(menu == 10)
			{
				int number = input.nextInt();
				System.out.println(occurances(array, number));
			}
			if(menu == 11)
			{
				int replace1 = input.nextInt();
				int replace2 = input.nextInt();
				replace(array, replace1, replace2);
			}
			if(menu == 12)
			{
				int maxIndex = consecutiveSum(array)+9;
				System.out.println(consecutiveSum(array) + "-" + maxIndex);
			}
		}while(exit == 0);

	}

}