/**
 * Class used to calculate grade for degree
 * @author (name goes here)
 * @version 15 May 2020
 * 
 */

import java.util.Scanner;

public class DegreeGrader {
	
	//class attributes
	int average; //all module average 
	int ismAverage; //ISM module average
	int compFailed; //number of compensentable failed credits
	int failedModules; //number of outright failed modules
	
	
	
	/** method displays grade based on meeting the grading criteria
	 * 
	 * @param averageIn: all module average 
	 * @param ismAverageIn: ISM module average
	 * @param compFailedIn: number of compensentable failed credits
	 * @param failedModulesIn: number of outright failed modules
	 * @return returns grade 
	 */
	public String degreeGrader(int averageIn, int ismAverageIn, int compFailedIn, int failedModulesIn) {
		
		average = averageIn;
		ismAverage = ismAverageIn;
		compFailed = compFailedIn;
		failedModules = failedModulesIn;
		
		if (average >= 70 && ismAverage >= 70 && compFailed == 0 && failedModules == 0) {
			
			return "Distinction";
		}
		else if (average >= 60 && ismAverage >= 60 && compFailed <= 15 && failedModules == 0) {
			
			return "Merit";
		}
		else if (average >= 50 && ismAverage >= 50 && compFailed <= 30 && failedModules == 0) {
			
			return "Pass";
		}
		else 
			return "Fail";
		
		}//end of degreeGrader method
	
	
	/** Method prompts for four user inputs and validates if each of them is in range specified
	 * 
	 */
	public 	void gimmeNumbers() {
		
		//create a new scanner object to receive user input
		Scanner sc = new Scanner(System.in);
		
		//prompt user to enter the first input
		System.out.println("Please enter all module average: ");
		average = sc.nextInt();
		
		//input validation
		while (average < 0 || average > 100) //check if input is valid
		{
			//display error message
			System.out.println("Input invalid - please re-enter: ");
			//prompt to re-enter
			average = sc.nextInt();
		}//end of loop
		
		//prompt user to enter the second input
		System.out.println("Please enter ISM module average: ");
		ismAverage = sc.nextInt();
		//input validation
		while (ismAverage < 0 || ismAverage > 100) //check if input is valid
		{
			//display error message
			System.out.println("Input invalid - please re-enter: ");
			//prompt to re-enter
			ismAverage = sc.nextInt();
		}//end of loop
		
		//prompt user to enter the third input
		System.out.println("Please enter number of compensentable failed credits: ");
		compFailed = sc.nextInt();
		//input validation
		while (compFailed < 0 || compFailed > 180) //check if input is valid
		{
			//display error message
			System.out.println("Input invalid - please re-enter: ");
			//prompt to re-enter
			compFailed = sc.nextInt();
		}//end of loop
		
		//prompt user to enter the last input
		System.out.println("Please enter number of outright failed modules: ");
		failedModules = sc.nextInt();
		//input validation
		while (failedModules < 0 || failedModules > 11) //checks if input is valid
		{
			//display error message
			System.out.println("Input invalid - please re-enter: ");
			//prompting to re-enter
			failedModules = sc.nextInt();
		}//end of loop
	}//end of gimmeNumbers method
	
	
	/** Method gets and validates the input by the user and calculates the degree grade based on grading conditiions
	 * 
	 */
	public void startDegreeGrading() {
		
		//welcome message	
		System.out.println("*********** Degree Classification Program *********");
		System.out.println();
		
		//prompt for user input and validate if within range specified
		gimmeNumbers();
		
		//display the grade based on grading criteria
		System.out.println(degreeGrader(average, ismAverage, compFailed, failedModules));
		System.out.println();
		
		//check if user wants to continue or exit by prompting for input
		System.out.println("Would you like to continue - enter y/n: ");
		
		//create a new scanner object to receive user input
		Scanner stringScanner = new Scanner(System.in);
		String answer = stringScanner.nextLine();
		
		//action for each user input, allows lower and uppercase input from the user
		switch (answer) {
		
			case "y":
				startDegreeGrading();
				break;
				
			case "Y":
				startDegreeGrading();
				break;
				
			case "n":
				System.out.println("Thank you for using our program.");
				break;
			
			case "N":
				System.out.println("Thank you for using our program.");
				break;
			//check for invalid input	
			default:
				System.out.println("Invalid input  - program terminated.");	
		}//end of switch statement
	}//end of startDegreeGrading method
	
	
}//end of class
