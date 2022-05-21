/**
 * Class used to calculate grades for the module, based on the marks received
 * @author (name goes here)
 * @version 15 May 2020
 * 
 */

import java.util.Scanner;

public class ModuleGrader {
	

	private int mark; //attribute will be used by methods to calculate the grade
	
	
	/** method displays appropriate grade based on the mark received
	 * @param markIn: mark received by the student
	 */
	public void gradeModule(int markIn) {
		
		
		if (markIn < 50) {
			System.out.println("Fail");
		} else if (markIn >= 50 && markIn < 60) {
			System.out.println("Good");
		} else if (markIn >= 60 && markIn < 70) {
			System.out.println("Merit");
		} else if (markIn >= 70 && markIn <= 100) {
			System.out.println("Distinction");
		}
		
		
	}//end of gradeModule method
	
	
	/** Validates the mark by checking if in the range 0-100
	 * 
	 */
	public void getValidModuleMark() {
		
		int markIn;
		
		//create a new scanner object to receive user input
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter your mark: ");
		
		//getting user input
		markIn = scanner.nextInt();
		
		//check if in a range
		if (markIn > 100 || markIn < 0) {
			
			//prompt the user until the valid input is entered
			System.out.println("Invalid mark. Please enter a mark in range 0 to 100: ");
			markIn = scanner.nextInt();
		} else {
			//assign the valid input to mark attribute
			mark = markIn;
		}
	}//end of validModuleMark method
	
	
	/** method displays the grade after previously validating the mark entered
	 * 
	 */
	public void startModuleGrading() {
		
		//welcome message
		System.out.println("*********** Module Grading Program *********");
		System.out.println();
		
		//prompt the user for input and validating the mark
		getValidModuleMark();
		
		//if the mark is valid the appropriate grade is displayed
		gradeModule(mark);
		
		//check if user wants to continue or exit by prompting for input
		System.out.println();
		System.out.println("Would you like to continue - enter y/n: ");
		
		//create a new scanner object to receive user input
		Scanner stringScanner = new Scanner(System.in);
		String answer = stringScanner.nextLine();
		
		//action for each user input, allows lower and upper case input
		switch (answer) {
		
			case "y":
				startModuleGrading();
				break;
				
			case "Y":
				startModuleGrading();
				break;
				
			case "n":
				System.out.println("Thank you for using our program.");
				break;
			case "N":
				System.out.println("Thank you for using our program.");
				break;	
			//check for invalid input
			default:
				System.out.println("Invalid input - program terminated.");	
		}//end of switch statement
	
	
	}//end of startModuleGrading method

}//end of class
