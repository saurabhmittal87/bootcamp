package com.ttnd.bootcamp;

public class ArrayExample {

	public static void main(String...args) {
		Integer []singleDimentionalArray = new Integer[10];
		int counter=0;
		for(int loopCounter=1;loopCounter<=10;loopCounter++){
			singleDimentionalArray[counter] = counter++;
		}
		System.out.println("Single dimentional array:");
		for(Integer arraySequentialValue: singleDimentionalArray){
			System.out.println(arraySequentialValue);
		}
		
		Integer [][]multiDimentionalArray = new Integer[3][3];
		counter=0;
		for(int loopCounter=1;loopCounter<=3;loopCounter++)
			for(int loopCounter2=1;loopCounter2<=3;loopCounter2++)
				multiDimentionalArray[loopCounter-1][loopCounter2-1] = counter++;
		
		System.out.println("\nMulti dimentional array:");
		for(int loopCounter=1;loopCounter<=3;loopCounter++){
			for(int loopCounter2=1;loopCounter2<=3;loopCounter2++)
				System.out.print(multiDimentionalArray[loopCounter-1][loopCounter2-1] + " ");
			System.out.println();
		}
			
	}
}
