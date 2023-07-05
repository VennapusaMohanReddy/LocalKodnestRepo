package Mohan;
import java.util.Scanner;
public class Scenario1 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int []arr=new int[5];
	//Taking the input and storing it in array
	System.out.println("Enter marks of Student 0");
	arr[0]=scan.nextInt();
	System.out.println("Enter marks of Student 1");
	arr[1]=scan.nextInt();
	System.out.println("Enter marks of Student 2");
	arr[2]=scan.nextInt();
	System.out.println("Enter marks of Student 3");
	arr[3]=scan.nextInt();	
	System.out.println("Enter marks of Student 4");
	arr[4]=scan.nextInt();
	//printing the contents from the array
	System.out.println("Array contents are:");
	System.out.println(arr[0]);
	System.out.println(arr[1]);
	System.out.println(arr[2]);
	System.out.println(arr[3]);
	System.out.println(arr[4]);
}
}
