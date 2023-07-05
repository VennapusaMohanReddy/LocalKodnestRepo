package Mohan;
import java.util.Scanner;
public class Scenario4 {

		public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);
			String[][] arr = new String[7][5];
			// taking the input from user and storing it in an array
			for (int i=0; i<=arr.length-1; i++) 
			{
				for (int j=0; j<=arr[i].length-1; j++) 
				{
					System.out.println("Enter the Name of Bank " + i + " Customer " + j);
					arr[i][j] = scan.next();
				}
			}
			//Printing the array contents on to the display
			System.out.println("Array contents are...");
			for (int i=0; i<=arr.length-1; i++) 
			{
				for (int j=0; j<=arr[i].length-1; j++) 
				{
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
		}
	}


