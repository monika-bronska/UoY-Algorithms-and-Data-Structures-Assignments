/**
 * Class for testing DegreeGrader class
 * @author (name goes here)
 * @version 15 May 2020
 * 
 */

public class TestDegreeGrader {
	
	public static void main(String[] args) {
		
		//creating DegreeGrader object
		DegreeGrader ultimateGrader = new DegreeGrader();
		
		
		//testing ultimateGrader object with the 1st method
		System.out.println(ultimateGrader.degreeGrader(70, 75, 0, 0));
		System.out.println(ultimateGrader.degreeGrader(60, 65, 15, 0));
		System.out.println(ultimateGrader.degreeGrader(50, 55, 30, 0));
		System.out.println(ultimateGrader.degreeGrader(40, 45, 45, 0));
		System.out.println(ultimateGrader.degreeGrader(70, 75, 0, 1));
		System.out.println(ultimateGrader.degreeGrader(0, 75, 0, 0));
		

		
		//testing ultimateGrader object with the 2nd method
		ultimateGrader.gimmeNumbers();
		
		//testing with the 3rd method
		ultimateGrader.startDegreeGrading();
		
	}//end of main

}//end of class
