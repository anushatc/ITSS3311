import java.util.Scanner;

public class StrictlyIdentical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//creating a scanner object to read input from console
		Scanner input = new Scanner(System.in);
		
		//prompting user to enter 5 elements for list1
		System.out.println("Enter 5 elements of list1:");
		
		//creating the array of size five
		int[] list1 = new int[5];
		
		//creating a for loop to read and assign every element inputed
		for(int i = 0; i < 5; i++) {
			list1[i] = input.nextInt();
			}
		
		//prompting user to enter 5 elements for list2
		System.out.println("Enter 5 elements of list2:");
		
		//creating new array of size 5
		int[] list2 = new int[5];
		
		//creating a for loop to read and assign every element inputed
		for(int i = 0; i < 5; i++) {
			list2[i] = input.nextInt();
					}
		//creating a boolean variable for whether list1 and list2 are identical
	boolean equals = equals(list1, list2);
	
	//if the boolean returns true, system prints that lists are identical
	if (equals == true) {
		System.out.println("Two lists are strictly identical");
	} 
	//if the boolean does not return true, system prints that lists are not identical
	else {
		System.out.println("Two lists are not strictly identical");
	}
	}
	//creating method to decide if arrays are strictly identical
	public static boolean equals(int[] list1, int[] list2) {
		
		//creating a for loop to read every element of the two lists
		for (int i = 0; i < list1.length; i++) {
	        
			//if the lists are not identical, the method returns false
			if (list1[i] != list2[i]) {
	            return false;
	        }
	}//if the lists are identical, the method returns true
		return true;
		//Enter 5 elements of list1:
			//1 2 3 4 5
			//Enter 5 elements of list2:
			//1 2 3 4 5
			//Two lists are strictly identical
} }
//https://github.com/anushatc/ITSS3311/blob/master/StrictlyIdentical.java
