package takeHome;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {

	Random rn=new Random();
	
	int[] listOfRandomNumber=new int[500];
	
	for(int i=0;i<500;i++) {
		
		listOfRandomNumber[i]=rn.nextInt(1000);
		
		
		System.out.print(listOfRandomNumber[i]+" ");
	}
	
	Arrays.sort(listOfRandomNumber);
	System.out.println();
	for(int i=0;i<500;i++) {
		System.out.print(listOfRandomNumber[i]+", ");
	}
	System.out.println();
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("Please provide Nth smallest number");
	
	int n=scanner.nextInt();
	
	System.out.println("The Nth smallest number from the list of Random number "+listOfRandomNumber[n-1]);
	}

}
